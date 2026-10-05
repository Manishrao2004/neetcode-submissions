from _heapq import heappop
class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        heap = []

        for x, y in points:
            dist = math.sqrt(math.pow(x,2)+math.pow(y,2))

            heapq.heappush(heap,(dist,[x,y]))
        
        res=[]
        for _ in range(k):
            res.append(heappop(heap)[1])
        
        return res