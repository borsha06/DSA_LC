class MinStack {
    List<Integer> stack;
    List<Integer> stack1;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new ArrayList<>();
        stack1 = new ArrayList<>();
        stack1.add(min);
    }

    public void push(int val) {

        if (val <= stack1.get(stack1.size() - 1)) {
            stack1.add(val);

        }
        stack.add(val);

    }

    public void pop() {
        int rem = stack.remove(stack.size() - 1);
        if (stack1.get(stack1.size() - 1) == rem) {
            stack1.remove(stack1.size() - 1);
        }
    }

    public int top() {
        if (stack.isEmpty())
            return -1;
        else
            return stack.get(stack.size() - 1);
    }

    public int getMin() {

        return stack1.get(stack1.size() - 1);

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */