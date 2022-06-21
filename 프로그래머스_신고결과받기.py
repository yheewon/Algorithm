# id = ["muzi", "frodo", "apeach", "neo"]
# report = ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]

def solution(id_list, report, k):
    answer = []
    report_lst = {} #유저ID : 신고한 유저ID
    nums = {} # 신고당한 횟수
    
    #모든 유저ID 삽입 
    for i in id_list : 
        report_lst[i] = list()
    
    for i in report : 
        tmp = i.split(" ") #0 : 신고한 사람 / 1 : 신고당한사람
        
        if tmp[1] in list(report_lst[tmp[0]]):
            continue
        
        report_lst[tmp[0]].append(tmp[1])
        
        if tmp[1] in nums:
            nums[tmp[1]] += 1
        else :
            nums[tmp[1]] = 1
            
    for key, val in report_lst.items():
        cnt = 0
        for ck, cv in nums.items():
            if cv >= k and ck in val:  
                cnt += 1
        answer.append(cnt)
    return answer

# def solution(id_list, report, k):
#     answer = [0] * len(id_list)    
#     reports = {x : 0 for x in id_list}

#     for r in set(report):
#         reports[r.split()[1]] += 1
        
#     print(reports)

#     for r in set(report):
#         if reports[r.split()[1]] >= k:
#             answer[id_list.index(r.split()[0])] += 1

#     return answer

id = ["muzi", "frodo", "apeach", "neo"]
report = ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]

result = solution(id,report,2)
print(result)