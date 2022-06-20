def solution(arr):
    answer = []
    
    if len(arr) == 1 : 
        answer.append(-1)
    else :
        answer = arr
        mn, idx = answer[0], 0
        
        for i in range(1,len(arr)) : 
            if answer[i] < mn : 
                mn = answer[i]
                idx = i
                
        answer.pop(idx)
        
    return answer