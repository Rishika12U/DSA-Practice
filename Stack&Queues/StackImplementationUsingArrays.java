class ArrayStack {
      int arr[] = new int[1000];
        int top = -1;
    public ArrayStack() {
      
    }

    public void push(int x) {
      top++;
      arr[top] = x; 
    }

    public int pop() {
      int x = arr[top];
      top--;
      return x;
    }

    public int top() {
       return arr[top] ;
    }

    public boolean isEmpty() {
        if(top == -1){
        return true;}
        return false;
    }
}
