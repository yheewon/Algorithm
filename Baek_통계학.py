from collections import Counter
import sys

N = int(sys.stdin.readline().rstrip())
num = list()

for _ in range(N) :
    num.append(int(sys.stdin.readline().rstrip()))

num.sort()
num_count = Counter(num).most_common(2)

print(sum(num)//len(num))
print(num[len(num)//2])
if len(num_count) >1 and num_count[0][1] == num_count[1][1] :
    print(num_count[1][0])
else :
    print(num_count[0][0])

print(num[-1] - num[0])
