class Solution:
    def validateBinaryTreeNodes(self, n, leftChild, rightChild):
        indegree = [0] * n

        # Step 1: Count indegrees
        for i in range(n):
            if leftChild[i] != -1:
                indegree[leftChild[i]] += 1
            if rightChild[i] != -1:
                indegree[rightChild[i]] += 1

        # Step 2: Find root (node with indegree 0)
        roots = [i for i in range(n) if indegree[i] == 0]
        if len(roots) != 1:  # must be exactly one root
            return False
        root = roots[0]

        # Step 3: DFS to check connectivity and cycles
        visited = set()

        def dfs(node):
            if node == -1:
                return True
            if node in visited:  # cycle detected
                return False
            visited.add(node)
            return dfs(leftChild[node]) and dfs(rightChild[node])

        return dfs(root) and len(visited) == n
