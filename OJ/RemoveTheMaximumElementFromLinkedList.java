/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{
  public Node deleteMaximum(Node head){
    Node previous = null;
    Node max = head;
    Node current = head;
    while(current != null)
    {
        if(current.next != null && current.next.data >= max.data)
        {
            max = current.next;
            previous = current;
        }
        current = current.next;
    }
    if(max != head){
        previous.next = max.next;
    }
    else{
        head = head.next;
    }
    return head;
  }
}
