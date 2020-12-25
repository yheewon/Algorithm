### 문자열 함수 ###
python = "Hello I am Heewon"
print("대문자 : ",python.upper())
print("소문자 : ",python.lower())
print("대문자인지 확인 : ",python.isupper())
print("문자열 길이 : ",len(python))
print("문자열 수정 : ",python.replace("Hello","Hi"))

# index vs find
# index = 찾는 문자 없으면 오류
# find = 찾는 문자 없으면 -1 반환

print("문자 찾기 : ",str(python.index("H")))
print("문자 찾기 : ",python.find("H"))
print("문자 count : ",python.count("H"))

### 문자열 포맷 ###
print("%d살 입니다."% 20)
print("{}살 입니다.".format(20))
print("{age}살 이며, {color}색을 좋아한다. ".format(age=20,color="pink"))

age = 20
color = "pink"
print(f"나는 {age}살이며, {color}색을 좋아한다.")

### 탈출 문자 ###
print("Hello \n i am heewon")
print("Hello i am \"heewon\"")

### 리스트 // 순서를 따지는 집합 ###
lists = [10,"짱구","짱아",40]

print("인덱스 위치 : ",lists.index("짱구"))

#마지막에 추가
lists.append("흰둥이") 
print(lists)

#1번 뒤에 추가
lists.insert(1,"철수") 
print(lists)

#뒤에서 한개씩 pop
print(lists.pop()) 

# 값은 값 count
lists.append("짱구")
print("같은 값 갯수 : ",lists.count("짱구"))

# 리스트 정렬
num_list = [5,1,3,4,9,2]
num_list.sort()
print("리스트 정렬 : ",num_list)

# 순서 뒤집기 
num_list.reverse()
print("순서 뒤집기 : ",num_list)

# 모두 지우기
# num_list.clear()

# 리스트 확장
num_list.extend(lists)
print(num_list)

### dictionary ###
dictionary = {3:"짱구",100:"짱아"}
print(dictionary[3]) #없으면 오류
print(dictionary.get(3)) #없으면 None
print(dictionary.get(5,"사용 가능")) #없으면 "" 출력

print(3 in dictionary) #true

dictionary[10] = "흰둥이"
print(dictionary)

# 키 삭제
del dictionary[100]
print(dictionary)

# 키 출력
print(dictionary.keys())

# value 출력
print(dictionary.values())

# key, value 쌍으로 출력
print(dictionary.items())

dictionary.clear()

### 튜플 : 내용 변경 추가 X / 속도는 리스트보다 빠름 ###
frined = ("짱구","짱아","흰둥이","철수")

name,age,hobby = "희원",20,"코딩"
print(name,age,hobby)

### 집합(set) : 중복 X / 순서 없음 ###
my_set = {1,2,3,4,5,3}
print(my_set)

animal = {"참새","코끼리","토끼"}
bird = {"참새", "까치"}

# 교집합(animal bird둘 다 포함 )
print("교집합 : ",animal & bird)
print("교집합 : ",animal.intersection(bird))

# 합집합
print("합집합 : ",animal | bird)
print("합집합 : ",animal.union(bird))

# 차집합(animal이지만 bird는 아닌)
print("차집합 : ",animal - bird)
print("차집합 : ",animal.difference(bird))

# 값 추가 / 제거
animal.add("호랑이")
animal.remove("토끼")
print(animal)

### 자료구조 변경 ###
print(animal,type(animal))

animal = tuple(animal)
print(type(animal))

animal = list(animal)
print(type(animal))

### random ###
from random import *
shuffle(animal)
print(animal)
print(sample(animal,1)) #중복 X
ran = randrange(1,20)
print(ran)

# id = range(1,21) #1부터 20까지 

### 한줄 for문 ###
students = [1,2,3,4,5]
students = [i+100 for i in students]
print(students)
