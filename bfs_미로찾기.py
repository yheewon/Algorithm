# 위치 (1,1)
# 미로 출구 (N,M)
# 0 : 괴물 / 1: 길
# 최소 칸의 개수
from collections import deque
def bfs(x,y):
    queue = deque()
    queue.append((x,y))

    while queue:
        x,y = queue.popleft()

        for move in range(4):
            xx, yy = x+dx[move],y+dy[move]

            if xx < 0 or xx >=N or yy<0 or yy >=M:
                continue
            if Map[xx][yy] == 1:
                Map[xx][yy] = Map[x][y] + 1
                queue.append((xx,yy))

    return Map[N-1][M-1]


N, M = map(int,input().split())

Map = [list(map(int,input())) for i in range(N)]

dx, dy = [-1,1,0,0],[0,0,1,-1]

print(bfs(0,0))
