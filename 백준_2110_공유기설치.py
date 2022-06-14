import sys
input = sys.stdin.readline

N, C = map(int, input().split())
house = [int(input()) for _ in range(N)]

house.sort()

left, right = 1 , house[-1]-house[0]
result = 0

while left <= right : 
    mid = (left + right) // 2
    val = house[0]
    cnt = 1
    
    for i in range(1,N) :
        if house[i] >= val + mid :
            val = house[i]
            cnt += 1
        
    if cnt >= C :
        left = mid + 1
        result = mid
    
    else :
        right = mid -1 
        
print(result)    
