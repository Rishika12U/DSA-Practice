class Solution {

public void insertatBottom(Stack<Integer>st ,int temp){
    if(st.isEmpty()){
        st.push(temp);
        return;
    }
int topVal = st.pop();

insertatBottom(st, temp);

st.push(topVal);

}

    public void reverseStack(Stack<Integer> st) {
       if(st.isEmpty()) return;

       int topVal = st.pop();

       reverseStack(st);

       insertatBottom(st, topVal);
    }
}
