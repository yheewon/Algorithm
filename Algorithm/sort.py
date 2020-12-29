def bubble_sort(data):
    for i in range(len(data)-1):
        for j in range(len(data)-i-1):
            if data[j] > data[j+1]:
                data[j],data[j+1] = data[j+1],data[j]

    print("Bubble sort : ",data)


def selection_sort(data):
    for i in range(len(data)):
        idx_min = i
        for j in range(i+1,len(data)):
            if data[idx_min] > data[j]:
                idx_min = j

        data[i],data[idx_min] = data[idx_min],data[i]

    print("Selection sort : ",data)

def insertion_sort(data):
    for i in range(1,len(data)):
        for j in range(i-1,0,-1):
            if data[j]>data[i]:
                data[j],data[i] = data[i],data[j]

    print("insertion sort : ",data)



num_list = [1,9,3,2,7]

# 정렬
# num_list.sort()
# 최소값 찾기
# min(num_list)

bubble_sort(num_list)
selection_sort(num_list)
insertion_sort(num_list)


