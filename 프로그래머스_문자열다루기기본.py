def solution(s):
    answer = True
    
    if len(s) != 4 and len(s) != 6 : 
        return False
    for i in s : 
        if ord(i) < 48 or ord(i) > 57:
            return False
    return answer

def alpha_string46(s):
    try:
        int(s)
    except:
        return False
    return len(s) == 4 or len(s) == 6 
