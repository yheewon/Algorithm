def solution(array, commands):
    answer = []
    for row in commands : 
        i,j,k = row[0], row[1], row[2]
        tmp = sorted(array[i-1: j])
        answer.append(tmp[k-1])
    return answer