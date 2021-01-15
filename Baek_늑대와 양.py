
R,C = map(int,input().split())

M = [input().replace('.','D') for i in range(R)]

dx,dy = [-1,1,0,0],[0,0,1,-1]

check = False

for i in range(R):
    for j in range(C):
        if M[i][j] == 'W':
            for w in range(4):
                x,y = i+dx[w], j+dy[w]

                if x<0 or x==R or y<0 or y==C:
                    continue
                if M[x][y] == 'S':
                    check = True
    

if check:
    print(0)

else :
    print(1)
    for i in M : 
        print(''.join(i))

# R,C = map(int,input().split())

# M = [input().replace('.','D') for i in range(R)]

# s = ""
# for i in M:
#     s += ''.join(i)

# if 'SW' in s or 'WS' in s : 
#     print(0)

# else:
#     print(1)
#     for i in range(0,len(s),+C):
#         print(s[i:i+C])
# 가로뿐아니라 세로도 고민해보기 !!
