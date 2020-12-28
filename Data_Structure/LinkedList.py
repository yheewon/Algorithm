class Node:
    def __init__(self,data,next = None):
        self.data = data
        self.next = next

class NodeManage:
    def __init__(self,data):
        self.head = Node(data)

    def add(self,data):
        if self.head == '':
            self.head = Node(data)

        else :
            node = self.head
            while node.next : 
                node = node.next

            node.next = Node(data)

    def delete(self,data):
        if self.head == '':
            print("해당 값을 가진 노드 없음")
            return

        elif self.head.data == data:
            self.head = self.head.next
        
        else:
            node = self.head
            while node.next:
                if node.next.data == data:
                    temp = node.next
                    node.next = temp.next
                    return 
                else:
                    node = node.next



    def print_node(self):
        node = self.head

        while node :
            print(node.data)
            node = node.next

linkedlist = NodeManage(0)
for i in range(1,10):
    linkedlist.add(i)

linkedlist.delete(0)
linkedlist.print_node()
