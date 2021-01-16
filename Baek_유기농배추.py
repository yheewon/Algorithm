#전형적인 
import sys
sys.setrecursionlimit(10000)

def dfs(x,y):
    if x<=-1 or x>=M or y<=-1 or y>=N:
        return False
    if Map[x][y] == 1:
        Map[x][y] = 2

        dfs(x-1,y)
        dfs(x+1,y)
        dfs(x,y-1)
        dfs(x,y+1)
        return True
    return False

T = int(input())

for _ in range(T):
    M,N,K = map(int,input().split(' ')) #가로 세로 배추

    Map = [[0 for i in range(N)] for _ in range(M)]

    for _ in range(K):
        a,b = map(int,input().split())
        Map[a][b] = 1

    bug = 0
    for i in range(M):
        for j in range(N):
            if dfs(i,j) :
                bug += 1

    print(bug)
