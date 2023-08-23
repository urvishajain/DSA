class Solution:
    def reorganizeString(self, s: str) -> str:
        d={}
        for x in s:
            if x in d:
                d[x]+=1
            else:
                d[x]=1
        import heapq as h
        lt=[]
        h.heapify(lt)
        for x in d:
            lt.append([-1*d[x],x])
        h.heapify(lt)
        k=[]
        while(lt):
            print(lt)
            t=h.heappop(lt)
            t[0]*=-1
            if not k:
                k.append(t[1])
                if (t[0]-1)>0:
                    h.heappush(lt,[-1*(t[0]-1),t[1]])
            else:
                if k[-1]==t[1]:
                    print(lt,"befor<0")
                    if len(lt)>0:
                        print(lt,"after")
                        q=h.heappop(lt)
                        h.heappush(lt,[t[0]*-1,t[1]])
                        k.append(q[1])
                        if (q[0]+1)<0:
                            h.heappush(lt,[q[0]+1,q[1]])
                        print(lt)
                    else:
                        return ""
                else:
                    k.append(t[1])
                    if (t[0]-1)>0:
                        h.heappush(lt,[-1*(t[0]-1),t[1]])
                    
        return ''.join(k)
                        
                        
                    
                
            
    
        