def solution(strings, n):
    answer = []
    sort_str = {}
    
    for i in strings : 
        sort_str[i] = i[n]
        
    sort_str = sorted(sort_str.items(), key=lambda x: (x[1], x[0]))
    for i in sort_str : 
        answer.append(i[0])
    return answer
