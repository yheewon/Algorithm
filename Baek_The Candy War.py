T = int(input())

for _ in range(T):
    N,C = int(input()), list(map(int,input().split()))

    for i in range(N):
        if C[i]%2 != 0 :
            C[i] +=1

    turn = 0
    
    while C.count(C[0]) != N:
        turn += 1

        relay = [i//2 for i in C] #움직일 캔디

        for i in range(N):
            if i==0:
                C[i] = C[i]//2 + relay[-1]
            else:
                C[i] = C[i]//2 + relay[i-1]

            if C[i] % 2 != 0 :
                C[i] += 1

        

    print(turn)
