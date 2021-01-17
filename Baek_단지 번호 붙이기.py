from collections import deque
def dfs(x,y):
    if x<=-1 or x>=N or y<=-1 or y>=N:
        return False

    if M[x][y] == 1:
        M[x][y]  = 0
        global cnt
        cnt += 1

        dfs(x-1,y)
        dfs(x+1,y)
        dfs(x,y+1)
        dfs(x,y-1)
        return True
    return False
    
def bfs(x,y,cnt):
    dx,dy = [-1,1,0,0],[0,0,1,-1]
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

lst = []
cnt = 0 
for i in range(N):
    for j in range(N):
        # if dfs(i,j) :
        #     lst.append(cnt)
        #     cnt = 0
        if M[i][j] == 1:
            lst.append(bfs(i,j,cnt))
            cnt = 0

print(len(lst))

for i in sorted(lst):
    print(i)
