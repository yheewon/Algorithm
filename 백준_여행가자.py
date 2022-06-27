import sys
input = sys.stdin.readline

def find(x):
    if x == parent[x] :
        return x
    else :
        parent[x] = find(parent[x])
        return parent[x]
    
def union(x,y):
    x = find(x)
    y = find(y)
    
    if x > y :
        parent[x] = y
    else :
        parent[y] = x

N = int(input())
M = int(input())
parent = [i for i in range(N)]

for i in range(N) :
    road = list(map(int, input().split()))
    
    for j in range(N):
        if road[j] == 1:
            union(i,j)
            
plan = list(map(int, input().split()))
result = set([find(i-1) for i in plan])

print('NO' if len(result) != 1 else 'YES')
