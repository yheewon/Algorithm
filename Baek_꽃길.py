def calc(lst):
    dx,dy = [0,-1,1,0,0],[0,0,0,1,-1]
    ck = []
    result = 0

    for flower in lst :
        x = flower // N
        y = flower % N

        if x==0 or x==N-1 or y==0 or y==N-1:
            return 10000
        
        for move in range(5):
            ck.append((x+dx[move],y+dy[move]))
            result += price[x+dx[move]][y+dy[move]]

    if len(set(ck)) == 15:
        return result
    else : 
        return 10000


N = int(input())

price = [list(map(int,input().split(' '))) for i in range(N)]

answer = 100000
for i in range(N*N):
    for j in range(N*N):
        for k in range(N*N):
            lst = [i,j,k]
            answer = min(answer,calc(lst))

print(answer)


    




