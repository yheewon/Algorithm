from collections import deque
graph = [
    [],
    [2,3,8],
    [1,7],
    [1,4,5],
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
]

def bfs(start,visited):
    queue = deque([start])

    visited[start] = True

    while queue :
        n = queue.popleft()
        print(n,end=' ')
        for i in graph[n]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

def dfs(v,visited):
    visited[v] = True
    print(v,end=' ')

    for i in graph[v] :
        if not visited[i] :
            dfs(i,visited)



visited = [False] * 9
# bfs(1,visited)
dfs(1,visited)
