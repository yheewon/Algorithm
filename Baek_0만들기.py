def recursive(idx, arr):
    if idx == n-1:

        string = ""
        for i in arr:
            string += str(i)

        if eval(string.replace(" ","")) == 0:
            print(string)

    else:
        arr.insert(idx *2 +1," ")
        recursive(idx+1,arr)
        arr.pop(idx*2+1)
        arr.insert(idx *2 +1,"+")
        recursive(idx+1,arr)
        arr.pop(idx*2+1)
        arr.insert(idx *2 +1,"-")
        recursive(idx+1,arr)
        arr.pop(idx*2+1)



tc = int(input())

for _ in range(tc):
    n = int(input())
    n_list = [i for i in range(1,n+1)]
    recursive(0,n_list)
    print()
