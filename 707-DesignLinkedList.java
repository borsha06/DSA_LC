class MyLinkedList {

    Node head;
    int size;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;

    }

    public int get(int index) {

        if (index > size - 1 || index < 0) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node current = this.head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;

    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size)
            return;

        Node current = this.head;

        Node newNode = new Node(val);
        if (size == index) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        for(int i = 0; i < index-1; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;

        Node curr = this.head;
        while (curr != null) {
            System.out.println(curr.data);

            curr = curr.next;
        }
    }

    public void deleteAtIndex(int index) {

         if (index > size-1 || index < 0) {
            return;
        }

        if(index == 0) {
            head = head.next;
            size--;
            return;
        }
        if (index == size) {
            Node curr = head;

            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
            curr.next = null;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */