from re import L


def solution(new_id):
    answer = new_id.lower() 
    
    for i in answer : 
        if i not in "abcdefghijklmnopqrstuvwxyz0123456789-_." :
            answer = answer.replace(i,'')
        
    while ".." in answer : 
        answer = answer.replace("..", ".")
       
    answer = answer.strip(".")
        
    if len(answer) == 0 :
        answer = 'a'
        
    if len(answer) >= 16 :
        answer = answer[0:15]
        
    answer = answer.strip('.')

    while len(answer) <= 2:
        answer += answer[-1]
            
    return answer

print(solution("abcdefghijklmn.p"))

