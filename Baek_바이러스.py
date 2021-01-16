from collections import deque

def bfs(start,cnt,visited):
    queue = deque([start])

    visited[start] = True
    while queue:
        v = queue.popleft()
        cnt += 1

        for i in range(1,C+1):
            if not visited[i] and graph[v][i] == 1:
                queue.append(i)
                visited[i] = True
    return cnt-1

C = int(input())
N = int(input())

graph = [[0]*(C+1) for i in range(C+1)]
visited = [False] * (C+1)

for _ in range(N):
    a,b = map(int,input().split())
    graph[a][b] = graph[b][a] = 1

cnt = 0

print(bfs(1,cnt,visited))
