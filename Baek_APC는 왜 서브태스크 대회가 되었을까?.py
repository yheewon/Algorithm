N,L,K = map(int,input().split())

level = []
for _ in range(N):
    sub1, sub2 = map(int,input().split())
    level.append((sub2,sub1))

level = sorted(level)

score = 0
cnt = 0 

for i in level:
    if i[0] <= L :
        score += 140
        cnt += 1

    elif i[1] <= L:
        score += 100
        cnt +=1

    if cnt == K:
        break

print(score)



# N,L,K = map(int,input().split())
# easy, hard = 0,0

# for _ in range(N):
#     sub1, sub2 = map(int,input().split())

#     if sub2 <= L:
#         hard += 1
#     elif sub1 <= L :
#         easy += 1


# score = min(hard,K)*140

# if hard < K:
#     score += min(K-hard,easy) * 100

# print(score)
