N = int(input())
F = [int(input()) for i in range(N)]
DP = [[1,0],[0,1]]

for i in range(2,max(F)+1):
    DP.append([DP[i-1][0]+DP[i-2][0], DP[i-1][1]+DP[i-2][0]])

for i in F:
    print(DP[i][0]," ",DP[i][1])
