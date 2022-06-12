import sys
input = sys.stdin.readline

N = int(input()) #상근이가 가지고 있는 카드 
card = list(map(int, input().split()))
M = int(input()) #찾고자 하는 수
search = list(map(int, input().split()))

card.sort()

for i in search : 
    left, right = 0, N-1
    stop = 1
    
    while left <= right and stop == 1 :
        mid = (left + right) // 2
        
        if card[mid] == i :
            stop = 0
            
        elif card[mid] > i : 
            right = mid - 1
            
        else :
            left = mid + 1
            
    print(1 if stop == 0 else 0, end=' ') 