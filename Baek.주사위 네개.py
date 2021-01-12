N = int(input())
lst = []

for _ in range(N):
    nums = sorted(list(map(int,input().split())))

    num = set(nums)

    if len(num) == 1 :
        lst.append(nums[0]*5000 + 50000)

    elif len(num) == 2:
        # 2, 3 번 둘다 해당
        if nums.count(nums[0]) == 2 and nums.count(nums[3]) == 2 :
            lst.append(2000 + nums[0]*500 + nums[3]*500)
        else :
            lst.append(10000 + nums[2]*1000)

    elif len(num) == 3:
        for i in num:
            print(i)
            if nums.count(i) >= 2:
                break
        lst.append(1000 + i*100)

    else :
        lst.append(nums[3]*100)

print(max(lst))

