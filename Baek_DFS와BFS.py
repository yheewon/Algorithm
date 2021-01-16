from collections import deque

def dfs(v,visited):
    visited[v] = True
    print(v,end=' ')

    for i in range(1,N+1):
        if visited[i] == 0 and graph[v][i] == 1:
            dfs(i,visited)

def bfs(v,visited):
    queue = deque([v])

    visited[v] = 0
    while queue:
        n = queue.popleft()
        print(n,end=' ')

        for i in range(1,N+1):
            if visited[i] == 1 and graph[n][i] == 1:
                queue.append(i)
                visited[i] = 0




N,M,V = map(int,input().split())
graph = [[0]*(N+1) for _ in range(N+1)]

for _ in range(M):
    a,b = map(int,input().split())
    graph[a][b] = graph[b][a] = 1

visited = [False] * (N+1)

dfs(V,visited)
print()
bfs(V,visited)
