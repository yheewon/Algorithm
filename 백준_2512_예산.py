import sys
input = sys.stdin.readline

N = int(input()) # 지방 수 
arr = list(map(int, input().split())) # 각 지방 예산 
M = int(input()) #총 예산

arr.sort()

left, right = 1, arr[-1]

while left <= right : 
    mid = (left + right) // 2
    cnt = 0
    
    for i in arr : 
        if i >= mid : 
            cnt += mid
        else :
            cnt += i
            
        if cnt > M :
            break

    if cnt > M :
        right = mid -1
    
    else : 
        left = mid + 1
    
print(right)