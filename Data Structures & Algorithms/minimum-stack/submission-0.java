class MinStack {
    int top=-1;
    int stack[];
    int prefix[];
    public MinStack() {
        stack = new int[1000];
        prefix = new int[1000];
    }
    
    public void push(int val) {
        top++;
        stack[top]=val;

        if(top==0)
            prefix[top]=val;

        else
            prefix[top]=Math.min(prefix[top-1],val);
    }
    
    public void pop() {
        if(top>=0){
            top--;
        }

    }
    
    public int top() {
        if(top>=0)
            return stack[top];
        return -1;
    }
    
    public int getMin() {
        if(top>=0)
            return prefix[top];
        return -1;
    }
}
