import sys 
input = sys.stdin.readline

N, M = map(int,  input().split())
tree = list(map(int, input().split()))

left, right = 1, max(tree)

while left <= right : 
    mid = (left + right) // 2
    cnt = 0
    
    for i in tree :
        if i > mid : 
            cnt += i - mid
            
        if cnt > M : 
            break
            
    if cnt >= M : 
        left = mid + 1
        
    else :
        right = mid -1 
        
print(right)