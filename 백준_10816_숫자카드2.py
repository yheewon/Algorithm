# 딕셔너리 사용 
import sys
input = sys.stdin.readline

N = int(input())
card = list(map(int, input().split()))
M = int(input())
search = list(map(int, input().split()))

card_dict = {}

for i in card : 
    if i in card_dict : 
        card_dict[i] += 1
        
    else : 
        card_dict[i] = 1
        
for i in search : 
    print(card_dict.get(i) if i in card_dict else 0, end=' ')
    

#이분탐색 사용 
import sys
input = sys.stdin.readline

N = int(input())
card = list(map(int, input().split()))
M = int(input())
search = list(map(int, input().split()))

card_dict = {}
card_set = list(set(card))
card_set.sort()

for i in card : 
    if i in card_dict : 
        card_dict[i] += 1
        
    else : 
        card_dict[i] = 1

for i in search : 
    left, right , cnt = 0, len(card_set)-1, 0
    
    while left <= right :
        mid = (left + right) // 2
        
        if card_set[mid] == i : 
            cnt = card_dict.get(i)
            break
            
        elif card_set[mid] > i : 
            right = mid - 1
            
        else : 
            left = mid + 1
            
    print(cnt, end=' ')

    
   
    