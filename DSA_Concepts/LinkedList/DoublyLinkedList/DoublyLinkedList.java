package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList(){
        head=(Node) null;
        tail=(Node) null;
    }
    public int size(){
        return this.size;
    }

    public void prepend(Object data){
        Node header=new Node(data, (Node)null, (Node)null);
        header.setNext(head);
        if(head!=null){
            head.setPrev(header);
        }else{
            tail=header;
        }
        head=header;
        size++;
    }
    public static void main(String[] args) {

    }
}
