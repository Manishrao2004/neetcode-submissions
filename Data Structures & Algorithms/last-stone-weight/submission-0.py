class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        heap=[-st for st in stones]

        heapq.heapify(heap)

        while len(heap)>1:
            y = -heapq.heappop(heap)
            x = -heapq.heappop(heap)

            if x!=y and x<y:
                heapq.heappush(heap,-(y-x))
        
        return -heap[0] if heap else 0
