# def recursive(n):
#     if n == 1:
#         return n 
#     elif n== 0:
#         return n
#     else :
#         return recursive(n-1) + recursive(n-2)

# n = int(input())

# print(recursive(n))
# 시간 복잡도 : 2^n 

n = int(input())

a,b = 0,1
while n>0 :
    a,b = b,b+a 
    n -= 1

print(a) 
