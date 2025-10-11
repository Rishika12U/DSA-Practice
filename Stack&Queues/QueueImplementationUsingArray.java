class ArrayQueue {
    static int arr[];
    static int rear;
   static int size;
    public ArrayQueue() {
        arr = new int[100];
        rear = -1;
    }

    public void push(int x) {
       rear++;
       arr[rear] = x;
    }

    public int pop() {
      if(rear == -1)return -1;
      int front = arr[0];

      for(int i=0; i<rear;i++){
        arr[i] = arr[i+1];
      }
      rear = rear-1;
      return front;
    }

    public int peek() {
     if(rear == -1)return -1;  
     return arr[0]; 
    }

    public boolean isEmpty() {
        return rear == -1;
    }
}
