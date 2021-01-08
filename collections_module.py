from collections import Counter

animals = [
    ('cat',100,1),
    ('dot',200,2),
    ('rabbit',50,3),
    ('monkey',30,4),
    ('rabbit',21,5),
    ('cat',230,6)
]

total = Counter()

for name, num, idx in animals:
    total[name] += num

print("동물별 카운트 : ",total)

print("알파벳 개수 : ",Counter('hello counter'))

s = Counter('hello i am heewon') #매개변수에 문자열 넣으면 에러 / Counter로 만든 값만 가능
print("데이터 개수 많은 순으로 정렬된 배열 리턴 : ",s.most_common())
print("개수 상위 3개 : ",s.most_common(3))
#일대다 매핑(하나의 키를 여러 개의 값에 매핑)
from collections import defaultdict
holdings = defaultdict(list)

for name, num, idx in animals:
    holdings[name].append((num,idx))

print("일대다 매핑 : ",holdings)
