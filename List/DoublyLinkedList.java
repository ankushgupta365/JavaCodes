package List;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int value;
        private ListNode next;
        private ListNode prev;
        public ListNode(int value){
            this.value = value;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public Boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.value+"..>");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.value+"..>");
            temp = temp.prev;
        }
        System.out.print("null");
    }
    public void insertAtBegining(int value){
        ListNode newNode = new ListNode(value); // this will create a node with next & prev is null
        if(head==null){
            tail = newNode;
        }else{
            head.prev = newNode;
            }
        newNode.next = head;
        head= newNode;
        length++;
    }
    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBegining(10);
        dll.insertAtBegining(20);
        dll.insertAtEnd(5);
        dll.displayForward();
    }
}
