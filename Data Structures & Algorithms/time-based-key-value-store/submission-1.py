class TimeMap:

    def __init__(self):
        self.store = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.store:
            self.store[key]=[[value,timestamp]]
        else:
            self.store[key].append([value,timestamp])


    def get(self, key: str, timestamp: int) -> str:
        if key not in self.store:
            return ""
            
        lst = self.store[key]
        
        l,r= 0, len(lst)-1
        res=-1

        while(l<=r):
            mid= (l+r)//2
            if(lst[mid][1]<=timestamp):
                res=max(res,mid)
                l=mid+1
            else:
                r=mid-1
        
        if(res!=-1):
            return lst[res][0]
        return ""