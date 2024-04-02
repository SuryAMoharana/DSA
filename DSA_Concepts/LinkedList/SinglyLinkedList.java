package LinkedList;

public class SinglyLinkedList {
    private Node head;
    private int size;

    public int size(){
        return this.size;
    }

    public void traverse(){
        Node current=head;
        while(current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }

    public void prepend (Object data){
        //crate a new node with data and null pointer
        Node header=new Node(data, (Node)null);
        //Set the pointer of the new Head to be the node that was the old head
        header.setNext(this.head);
        //Set the node to be the new head
        this.head=header;
        //Increase the size counter
        this.size++;
    }

    public void insertAt(Object data, int idx){
        //Check idx is within the current size of the list
        if(idx >= 0 && idx<this.size){
            //Create a new header node with null data and a pointer to the current head
            Node header=new Node((Object)null, this.head);
            //Copy header into a new Node before
            //before will be the node in front of the inserted node
            Node before = header;
            //Loop to the specified index
            for(int i=0;i<idx;i++){
                //Set before to the next node in the list
                before=before.getNext();
            }
            //Set the node after before to a new Node with the data and a pointer to the node
            //after before
            before.setNext(new Node(data,before.getNext()));
            //Set the head of the list to be the node after header
            this.head=header.getNext();
            //Increase the size counter
            this.size++;
        }else{
            System.out.println("Index out of bounds");
        }
    }

    public Node popFirst(){
        //Only do this if head!=null
        if(this.head!=null){
            //create a temp node that stores the old head
            Node temp=this.head;
            //Set the new head to be the 2nd node in the list
            this.head=temp.getNext();
            //Disjoin the old head from the list
            temp.setNext((Node)null);
            //Decrease the size counter
            this.size--;
            //return null if the list is empty
            return new Node(null,null);
        }else{
            System.out.println("HEAD IS NULL");
            //return the popped node
            return new Node(null,null);
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.prepend(100);
        //singlyLinkedList.traverse();
        singlyLinkedList.prepend(200);
        //singlyLinkedList.traverse();
        singlyLinkedList.prepend(300);
        //singlyLinkedList.traverse();

        System.out.println("Inserting 150 at 1");
        singlyLinkedList.insertAt(150,1);
        //singlyLinkedList.traverse();

        singlyLinkedList.popFirst();
        singlyLinkedList.traverse();
    }

}
