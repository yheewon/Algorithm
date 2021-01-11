def find(N,r,c,cnt):
    if N > 1:
        temp = N-1
        if r // (2**temp) >=1 :
            cnt += 2**temp * 2**N 

        if c // (2**temp) >= 1:
            cnt += 2**temp * 2**temp

        N -= 1
        r = r % (2**temp)
        c = c % (2**temp)

        return find(N,r,c,cnt)

    elif N == 1:
        if r==0 and c==1:
            cnt += 1
        elif r==1 and c==0 :
            cnt += 2
        elif r==1 and c==1 :
            cnt += 3

        return cnt 
    
    

N, r , c = map(int,input().split())
cnt = 0

print(find(N,r,c,cnt))
