def search_answer(answers, arr) : 
    idx , cnt = 0,0 #현재 인덱스, 맞은문제 
    for i in answers:
        if idx == len(arr):
            idx = 0
        
        if arr[idx] == i:
            cnt += 1
        idx += 1
    return cnt
        
        
def solution(answers):
    answer = []
    a_dic = {}
    
    a_dic[1] = search_answer(answers, [1,2,3,4,5])
    a_dic[2] = search_answer(answers, [2,1,2,3,2,4,2,5])
    a_dic[3] = search_answer(answers, [3,3,1,1,2,2,4,4,5,5])
    
    mx = max(a_dic[1], a_dic[2], a_dic[3])
    for k,v in a_dic.items():
        if v == mx : 
            answer.append(k)

    return answer