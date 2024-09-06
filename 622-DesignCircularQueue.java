class MyCircularQueue {
    int[] list;

    private int front, size, back;

    public MyCircularQueue(int k) {
        this.front = -1;
        this.back = -1;
        this.size = k;
        list = new int[size];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            this.front = 0;
            this.back = 0;
        } else if (back == size - 1 && front != 0) {
            this.back = 0;
        } else {
            this.back++;
        }
        list[back] = value;
        return true;

    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else if (front == back) {
            front = back = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return list[front];
    }

    public int Rear() {
        if (this.back == -1)
            return -1;
        else {
            return list[this.back];
        }

    }

    public boolean isEmpty() {
        if (this.front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (front == 0 && back == size - 1 || (back + 1) % size == front) {
            return true;
        }
        return false;

    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */