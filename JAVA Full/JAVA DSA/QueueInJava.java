class QueueInJava{
    stastic class Queue{
        ststic int arr[];
        ststic int size;
        static int rear=-1;

        Queue(int size){
            arr = new int[size];
            this.size=size;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //enquue or add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue full");
                return;
            }
            rear++;
            arr[rear]=data;
        } 

        //remove or dequeue
        public static int remove(){
            if(isEmpty){
                System.out.println("Queue Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
        }

    }

    public static void main(String[] args){

    }
}