N, B = input(), list(map(int,input().split(' ')))
A = [B[0]]

for i in range(1,int(N)):
    A.append(B[i] * (i+1) - sum(A))

for i in A:
    print(i)

