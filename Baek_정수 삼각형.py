N = int(input())

A = [list(map(int,input().split())) for i in range(N)]

for i in range(1,N):
    for j in range(i+1):
        if j==0:
            A[i][j] += A[i-1][j]

        elif i==j:
            A[i][j] += A[i-1][j-1]

        else : 
            A[i][j] += max(A[i-1][j-1],A[i-1][j])

print(max(A[-1]))
