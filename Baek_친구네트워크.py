def findParent(x):
    if x == parent[x] :
        return x
    else :
        temp = findParent(parent[x])
        parent[x] = temp
        return parent[x]
    
def union(x,y):
    x = findParent(x)
    y = findParent(y)
    
    if x!=y:
        parent[y] = x
        count[x] += count[y]


test_case = int(input())

for i in range(test_case):
    n = int(input())
    parent = dict()
    count = dict()
    
    for _ in range(n):
        x,y = input().split(' ')
        
        if x not in parent :
            count[x] = 1
            parent[x] = x
            
        if y not in parent :
            count[y] = 1
            parent[y] = y
            
        union(x,y)
        print(count[findParent(x)])
