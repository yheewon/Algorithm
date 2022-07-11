def solution(s):
    answer = ''
    tmp = []
    
    for i in s.split(" ") : 
        if i != ' ':
            tmp.append(int(i))
            
    tmp.sort()
    
    answer = str(tmp[0]) + " " + str(tmp[-1])
    return answer
