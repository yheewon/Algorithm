import sys 
input = sys.stdin.readline

K, N = map(int, input().split())
line = []

for _ in range(K):
    line.append(int(input()))
    
left, right = 1, max(line)

while left <= right : 
    mid = (left + right) // 2    
    cnt = 0
    
    for i in line : 
        cnt += i // mid
        
    if cnt >= N : 
        left = mid + 1
        
    else : 
        right = mid - 1
        
print(right)
    
