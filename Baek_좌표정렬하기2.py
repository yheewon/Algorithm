N = int(input())

array = []

for _ in range(N):
    a,b = map(int,input().split())
    array.append((a,b))

array.sort(key = lambda x: (x[1],x[0]))

for i in array:
    print(i[0],i[1])
