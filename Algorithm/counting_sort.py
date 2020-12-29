# 10,000,000 = 기본 정렬 알고리즘으로 풀 수 없음 => 계수 정렬

import sys

N = int(sys.stdin.readline())
array = [0] * 10001

for i in range(N):
    data = int(sys.stdin.readline())
    array[data] += 1

for i in range(10001):
    if array[i] != 0 :
        print("%s\n" % i * array[i], end='')
