N = int(input())

array = []

for _ in range(N):
    a,b = map(int,input().split())
    array.append((a,b))

array = sorted(array, key = lambda array: array[1])

for i in array:
    print(i[0],i[1])
