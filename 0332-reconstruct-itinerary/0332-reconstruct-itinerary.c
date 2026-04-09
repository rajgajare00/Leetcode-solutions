typedef struct {
    char **dests;
    int size;
    int capacity;
} DestList;

typedef struct {
    char *src;
    DestList list;
} Node;

static int cmpStr(const void *a, const void *b) {
    return strcmp(*(char **)a, *(char **)b);
}
void dfs(Node *nodes, int n, char *airport, char **route, int *idx) {
    for (int i = 0; i < n; i++) {
        if (strcmp(nodes[i].src, airport) == 0) {
            while (nodes[i].list.size > 0) {
                char *next = nodes[i].list.dests[0];
                memmove(nodes[i].list.dests, nodes[i].list.dests + 1,
                        (nodes[i].list.size - 1) * sizeof(char *));
                nodes[i].list.size--;
                dfs(nodes, n, next, route, idx);
            }
            break;
        }
    }
    route[(*idx)++] = airport;
}

char** findItinerary(char*** tickets, int ticketsSize, int* ticketsColSize, int* returnSize) {
    Node *nodes = malloc(ticketsSize * sizeof(Node));
    int n = 0;

    for (int i = 0; i < ticketsSize; i++) {
        char *src = tickets[i][0];
        char *dst = tickets[i][1];
        int found = -1;
        for (int j = 0; j < n; j++) {
            if (strcmp(nodes[j].src, src) == 0) {
                found = j;
                break;
            }
        }
        if (found == -1) {
            nodes[n].src = src;
            nodes[n].list.size = 0;
            nodes[n].list.capacity = ticketsSize;
            nodes[n].list.dests = malloc(ticketsSize * sizeof(char *));
            found = n++;
        }
        nodes[found].list.dests[nodes[found].list.size++] = dst;
    }
    for (int i = 0; i < n; i++) {
        qsort(nodes[i].list.dests, nodes[i].list.size, sizeof(char *), cmpStr);
    }
    char **route = malloc((ticketsSize + 1) * sizeof(char *));
    int idx = 0;

    dfs(nodes, n, "JFK", route, &idx);
    for (int i = 0; i < idx / 2; i++) {
        char *tmp = route[i];
        route[i] = route[idx - 1 - i];
        route[idx - 1 - i] = tmp;
    }

    *returnSize = idx;
    return route;
}