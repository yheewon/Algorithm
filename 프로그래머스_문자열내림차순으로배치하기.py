def solution(s):
    temp = []
    answer = ''
    
    for i in s : 
        temp.append(ord(i))
        
    temp.sort(reverse=True)
    
    for i in temp : 
        answer += chr(i)
    
    return answer


# def solution(s):
#     return ''.join(sorted(s, reverse=True))
