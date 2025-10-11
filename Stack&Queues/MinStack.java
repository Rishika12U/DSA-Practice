class MinStack {

Stack<Long> s = new Stack<>();
long min;

    public MinStack() {
    min = Long.MAX_VALUE;    
    }
    
    public void push(int val) {
        long value= val;
        if(s.isEmpty()){
            min = value;
             s.push(value);
        }else
        {
            if(value < min){
                s.push(2*value - min);
                min = value;
            }else{
                s.push(value);
            }
        }
    }
    
    public void pop() {
       if(s.isEmpty()){
        return;
       } 

       Long val = s.pop(); 

       if(val < min){
        min = 2* min - val;
       }
    }
    
    public int top() {
        if(s.peek() < min){
            return (int)min;
        }
        return (int)(long)s.peek();
    }
    
    public int getMin() {
        return (int)min;
    }
}
