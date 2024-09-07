public class stacklinkedlist {
   static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class Stack {
        static Node headNode;
        public static boolean isempty(){
            return headNode == null;
        }

        public static void push(int data){
            Node newnNode = new Node(data);
            if (isempty()) {
                headNode = newnNode;
                return;
            }
            newnNode.next = headNode;
            headNode = newnNode;
        }

        public static int pop(){
            if (isempty()) {
                return -1;
            }
            int top = headNode.data;
             headNode = headNode.next;
             return top;
        }

        public static int peek(){
            if (isempty()) {
                return -1;
            }
            int top = headNode.data;
            return top;
        }
        public static void main(String[] args) {
            Stack stack = new Stack();
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);

            while (!stack.isempty()) {
                System.out.println(stack.peek());
                stack.pop();
            }

        }
    }

}
