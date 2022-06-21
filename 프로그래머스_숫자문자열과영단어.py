def solution(s):
    vac = {"zero":0, "one":1, "two":2, "three":3, "four":4, "five":5, "six":6, "seven":7, "eight":8, "nine":9}
    answer = ""
    tmp = ""
    
    for i in s :
        if ord(i) >= 48 and ord(i) <= 57:
            answer += i
        else :
            tmp += i
            if tmp in vac :
                answer += str(vac[tmp])
                tmp = ""
            
    return int(answer)