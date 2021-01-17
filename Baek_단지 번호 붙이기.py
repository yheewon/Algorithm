from collections import deque
def dfs(x,y,cnt):
    M[x][y] = 0

    for move in range(4):
        xx,yy = x+dx[move], y+dy[move]

        if xx<0 or xx>=N or yy<0 or yy>=N:
                continue
        if M[xx][yy] == 1:
            cnt += 1
            cnt = dfs(xx,yy,cnt)

    return cnt

    
def bfs(x,y,cnt):
    queue = deque([(x,y)])
    M[x][y] = 0

    while queue:
        x,y = queue.popleft()
        
        for move in range(4):
            xx,yy = x+dx[move], y+dy[move]

            if xx<0 or xx>=N or yy<0 or yy>=N:
                continue
            if M[xx][yy] == 1:
                cnt += 1
                M[xx][yy] = 0
                queue.append((xx,yy))

    return cnt + 1

N = int(input())
M = [list(map(int,input())) for _ in range(N)]
dx,dy = [-1,1,0,0],[0,0,1,-1]

lst = []
cnt = 0 
for i in range(N):
    for j in range(N):
        if M[i][j]==1:
            lst.append(dfs(i,j,cnt+1))
            cnt = 0
        # if M[i][j] == 1:
        #     lst.append(bfs(i,j,cnt))
        #     cnt = 0

print(len(lst))

for i in sorted(lst):
    print(i)
