C, M = list(), list()

for _ in range(3) :
    c,m = map(int,input().split())
    C.append(c)
    M.append(m)

for i in range(100):
    num = i%3
    nxt = (num+1) % 3

    M[num],M[nxt] = max(M[num] - (C[nxt] - M[nxt]),0), min(C[nxt],M[nxt] + M[num])
for i in M:
    print(i)
       
        
