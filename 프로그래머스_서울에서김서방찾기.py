def solution(seoul):
    answer = '김서방은 '
    
    for i in range(len(seoul)):
        if seoul[i] == "Kim" :
            answer = answer + str(i) + '에 있다'
            break
    return answer
