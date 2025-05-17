
class CreateALinkedListInJava{
    Node head;
    private int size;

    CreateALinkedListInJava(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next= null;
            size++;
        }
    }
//Add Element.
    /* Add First */
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    /* Add Last */
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

//Delete element
    /* Delete First */
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    /* Delete last */
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //Display List
    public void displayList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
    System.out.println("NULL");
    }

//Display the size of the linked list
    public int returnSize(){
        return size;
    }

    public static void main(String[] args) {
        CreateALinkedListInJava LinkedList = new CreateALinkedListInJava();
        LinkedList.addFirst("really Love");
        LinkedList.addFirst("I");
        LinkedList.addFirst("Do");
        LinkedList.addLast("Susmita");
        LinkedList.addLast(" & ");
        LinkedList.addLast("Titli");

        LinkedList.displayList();
        System.out.println("Size of the linked List : "+LinkedList.returnSize());

        LinkedList.deleteFirst();
        LinkedList.deleteLast();
        LinkedList.deleteLast();

        LinkedList.displayList();
        System.out.println("Size of the linked List : "+LinkedList.returnSize());


    }
}