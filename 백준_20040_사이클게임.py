def find(x):
    if x == parent[x] :
        return x
    else :
        parent[x] = find(parent[x])
        return parent[x]
    
def union(x,y):
    x = find(x)
    y = find(y)
    
    if x == y :
        return 1
    elif x > y :
        parent[x] = y
    else :
        parent[y] = x
         
    

# n : 점의 개수, m : 차례 
n, m = map(int, input().split())
parent = [i for i in range(n)]

for i in range(m):
    a,b = map(int, input().split())
    
    if find(a) == find(b):
        print(i+1)
        exit(0)
        
    union(a,b)    
print(0)
    
