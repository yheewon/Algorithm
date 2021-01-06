N = int(input())

voca = dict()

for _ in range(N):
    word = input()

    if word not in voca:
        voca[word] = len(word)

voca = sorted(voca.items(), key = lambda x: (x[1] , x[0]))

for i in voca :
    print(i[0])
