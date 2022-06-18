import sys

N, M = map(int, input().split())
nameList = sys.stdin.read().splitlines()

hearset = set(nameList[:N])
seeset = set(nameList[N:])

result = list(hearset & seeset)
result.sort()

print(len(result))
for i in result:
    print(i)