import sys
input = sys.stdin.readline

X = int(input())

curr_len = 64 #현재 스틱 길이
len = 0 # 더한 스틱 길이 
cnt = 0 #더한 스틱 갯수 

while len != X and X != 64:
    curr_len = curr_len // 2
    
    if curr_len + len > X : 
        continue
    
    len += curr_len
    cnt += 1
    
print(1 if X == 64 else cnt)