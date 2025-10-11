class QueueStack {
    Queue<Integer>q = new LinkedList<>();
    public QueueStack() {
    }

    public void push(int x) {
       q.add(x);
       for(int i=0; i<q.size()-1 ; i++){
        q.add(q.remove());
       }
    }

    public int pop() {
      return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}
