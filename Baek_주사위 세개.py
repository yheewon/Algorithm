nums = sorted(list(map(int,input().split())))
num = set(nums)

if len(num) == 3:
    num = sorted(num)
    print(num[2]*100)

elif len(num) == 2:
    nums.sort()
    print(nums[1]*100 + 1000)
else : 
    print(10000 + nums[0]*1000)
