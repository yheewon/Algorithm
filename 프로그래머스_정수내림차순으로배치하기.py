def solution(n):
    answer = 0
    num = list(str(n))
    num.sort(reverse = True)

    return int(''.join(num))
