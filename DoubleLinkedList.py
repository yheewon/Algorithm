class Node:
    def __init__(self,data, prev = None, next = None):
        self.data =data
        self.prev = prev
        self.next = next

class NodeManage:
    def __init__(self,data):
        self.head = Node(data)
        self.tail = Node(data)

    def insert(self,data):
        if self.head == '':
            self.head = Node(data)
            self.tail = self.head

        else:
            node = self.head
            while node.next:
                node = node.next
            new = Node(data)
            node.next = new
            new.prev = node
            self.tail = new

    def print_node(self):
        node = self.head
        while node :
            print(node.data)
            node = node.next

    def insert_before(self,num,data): #특정 숫자 노드 앞에 데이터 추가 -tail
        if self.head == '':
            self.head = Node(data)
            return True
        else :
            node = self.tail
            while node.data != num:
                node = node.prev
                if node == '':
                    return False #찾는 숫자 없음
            
            new = Node(data)
            prev_node = node.prev
            node.prev = new
            new.prev = prev_node
            prev_node.next = new
            new.next = node
            return True

    def insert_after(self,num,data): #특정 숫자 노드 뒤에 데이터 추가 - head
        if self.head == '':
            self.head = Node(data)
            return True
        else:
            node = self.head
            while node.data != num:
                node = node.next
                if node=='':
                    return False
            
            new = Node(data)
            next_node = node.next
            node.next = new
            new.next = next_node

            next_node.prev = new
            new.prev = node
            return True



    

dLinkedlist = NodeManage(0)
for i in range(1,7):
    dLinkedlist.insert(i)

# dLinkedlist.print_node()
dLinkedlist.insert_before(2,1.5)
dLinkedlist.print_node()

dLinkedlist.insert_after(4,4.5)
dLinkedlist.print_node()
