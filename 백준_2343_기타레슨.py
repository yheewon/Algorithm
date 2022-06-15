import sys
input = sys.stdin.readline

N, M = map(int, input().split()) #강의수 ,블루레이 수 
video = list(map(int, input().split()))

left , right = 1, sum(video) # 강의 최소 길이 1 ~ 강의 총 합
result = sum(video) # 총합보다 클 수 없음 
mx = max(video)

while left <= right :
    mid = (left + right) // 2
    size, cnt = 0, 1 # 블루레이 크기, 블루레이 개수 
    
    if mid < mx : #제일 큰 수보다 작으면 패스 후 mid를 늘이기  
        left = mid + 1
        continue
    
    for i in video: # mid 크기로 블루레이 개수 구하기 
        if size + i <= mid : 
            size += i
        else : 
            cnt += 1
            size = i
            
    if cnt <= M:
        right = mid - 1
        result = min(result,mid) #최소 블루레이 크기 
    else:
        left = mid + 1
        
print(result)
