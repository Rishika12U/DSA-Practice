class Solution {
public void insert(Stack<Integer> s, int temp){
    if(s.isEmpty() || s.peek() <= temp){
        s.push(temp);
        return;
    }
    int val = s.pop();
    insert(s, temp);
    s.push(val);
}

    public void sortStack(Stack<Integer> st) {
       if(!st.isEmpty()){
        int temp = st.pop();
        sortStack(st);
        insert(st, temp);
       }
    }
}
