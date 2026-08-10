class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        node = head
        count = 0
        while node and count < k:
            node = node.next
            count += 1
        if count < k:
            return head
        prev = None
        curr = head
        for _ in range(k):
            next_temp = curr.next
            curr.next = prev
            prev = curr
            curr = next_temp
        head.next = self.reverseKGroup(curr, k)
        
        return prev  