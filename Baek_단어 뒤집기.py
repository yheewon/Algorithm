s = input()

match = True
temp = ""

for i in s:
    if i == ' ':
        if match:
            print(temp[::-1],end=" ")
            temp = ""
        else  :
            print(" ",end="")

    elif i == '<':
        match = False
        print(temp[::-1] + i,end="")
        temp = ""

    elif i == '>':
        match = True
        print(i,end="")

    else:
        if match:
            temp += i
        else:
            print(i,end="")


print(temp[::-1],end=" ")
