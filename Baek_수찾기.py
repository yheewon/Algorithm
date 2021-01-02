# N,A = int(input()), {i: 1 for i in map(int,input().split(' '))}

# M,B = int(input()), list(map(int,input().split(' ')))

# for i in B : 
#     # print(A.get(i,0))
#     print(1 if i in A else 0)

N,A = int(input()), set(map(int,input().split(' ')))

M,B = int(input()), list(map(int,input().split(' ')))

for i in B :
    print(1 if i in A else 0)

