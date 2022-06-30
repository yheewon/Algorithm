n = int(input())
prime = [] #2~246912까지 소수 

for i in range(2, 246913) :
    ck = True
    
    for j in range(2, int(i**0.5) +1):
        if i % j == 0 :
            ck = False
            break
    
    if ck:
        prime.append(i)

while n != 0 :
    cnt = 0
    
    for i in prime:
        if n < i <= 2*n:
            cnt += 1
            
    print(cnt)
    n = int(input())
