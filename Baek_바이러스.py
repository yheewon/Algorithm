from collections import deque
def bfs(start,cnt):
    queue = deque([start])
    visited[start] = True

    while queue:
        n = queue.popleft()
        cnt += 1
        for i in range(1,computer+1):
            if not visited[i] and graph[n][i] == 1:
                queue.append(i)
                visited[i] = True
    return cnt-1

def dfs(v):
    visited[v] = True
    global cnt
    cnt += 1
    for i in range(1,computer+1):
        if not visited[i] and graph[v][i] == 1:
            dfs(i)

    return cnt-1

    


computer = int(input())
N = int(input())
graph = [[0]*(computer+1) for _ in range(computer+1)]
visited = [False] * (computer+1)

for _ in range(N):
    a,b = map(int,input().split())
    graph[a][b] = graph[b][a] = 1

cnt = 0
# print(bfs(1,cnt))
dfs(1)
print(cnt-1)
