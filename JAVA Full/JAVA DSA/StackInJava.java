class StackInJava{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    } 
    static class Stack{
        public Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int dataa){
            Node newNode = new Node(data);
            if(isEmpty){
                head = newNoad;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            int top=head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty){
                return -1;
            }
            else
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        
    }
}