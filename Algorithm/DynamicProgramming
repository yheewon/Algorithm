def fivo(num):
    if num <= 1:
        return num
    return fivo(num-1) + fivo(num-2)

def fivo_dp(num):
    n_list = [0 for i in range(num+1)]
    n_list[0], n_list[1] = 0,1

    for i in range(2,num+1):
        n_list[i] = n_list[i-1] + n_list[i-2]

    return n_list[num]

print("재귀함수 : ",fivo(4))
print("동적 계획법 : ",fivo_dp(4))
