def solution(s, n):
    answer = ''
    
    for i in s : 
        if ord(i) == 32 : #공백 
            answer += ' '
        elif ord(i) <= 90 and ord(i)+n > 90: #대문자 
            answer += chr(ord(i)+n-26)
        elif ord(i) >= 97 and ord(i) <= 122 and ord(i)+n >122: #소문자
            answer += chr(ord(i)+n-26)
        else : 
            answer += chr(ord(i)+n)
        
    return answer