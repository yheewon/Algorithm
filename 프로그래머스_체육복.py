#체육복
def solution(n, lost, reserve):
    res_student = sorted([x for x in reserve if x not in lost])
    lost_student = sorted([x for x in lost if x not in reserve])
    
    for i in res_student :
        if i-1 in lost_student : 
            lost_student.remove(i-1)
        elif i+1 in lost_student : 
            lost_student.remove(i+1)
        
    return n - len(lost_student)
