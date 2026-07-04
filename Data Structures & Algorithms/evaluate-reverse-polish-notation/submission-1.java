class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<tokens.length;i++ ){
            String v = tokens[i];

            if(v.matches("-?\\d+")){
                stack.push(Integer.parseInt(v));
            }

            else{
                int a=stack.pop();
                int b= stack.pop();
                if(v.equals("+"))
                    stack.push(b+a);
                else if(v.equals("-"))
                    stack.push(b-a);
                else if(v.equals("*"))
                    stack.push(b*a);
                else if(v.equals("/"))
                    stack.push(b/a) ;   
            }
        }
        return stack.pop();
    }
}
