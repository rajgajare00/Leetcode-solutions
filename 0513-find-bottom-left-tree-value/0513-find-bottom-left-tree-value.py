from collections import deque

class Solution:
    def findBottomLeftValue(self, root):
        queue = deque([root])
        while queue:
            node = queue.popleft()
            # Push right first, then left → ensures last popped is bottom-left
            if node.right:
                queue.append(node.right)
            if node.left:
                queue.append(node.left)
        return node.val
