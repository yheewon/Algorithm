N, M = map(int,input().split(' '))

group = dict()

for _ in range(N) :
    name = input()
    num = int(input())

    for _ in range(num):
        group[input()] = name

group = sorted(group.items())
group = dict(group)

for _ in range(M) :
    q_name = input()
    quiz = int(input())
    if quiz == 0:
        #그룹 이름 입력 => 팀 멤버 이름 사전순으로 출력
        for key, value in group.items():
            if value == q_name:
                print(key)

    else :
        # 멤버 이름 입력 => 어디 팀인지 출력
        print(group.get(q_name))


# N, M = map(int,input().split(' '))

# team_mem, mem_team = {},{}

# for _ in range(N):
#     name, num = input(), int(input())

#     team_mem[name] = []

#     for _ in range(num):
#         mem_name = input()
#         team_mem[name].append(mem_name)
#         mem_team[mem_name] = name

# for _ in range(M):
#     name, quiz = input(),int(input())

#     if quiz :
#         print(mem_team[name])

#     else:
#         for i in sorted(team_mem[name]):
#             print(i)
