import sys
input = sys.stdin.readline

N = int(input())
num = list(map(int, input().split()))
ck = False

for i in range(N-1):
    for j in range(i+1, N):
        if num[j] > num[i]:
            print(num[j], end=' ')
            ck = True
            break
        
    if not ck:
        print('-1',end= ' ')
        
print(-1)
