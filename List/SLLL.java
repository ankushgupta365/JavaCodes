package List;

public class SLLL {
    //head will be null initially
    private ListNode head;

    private static class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        //this constructor will create a node whose next will point to null
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "....>");
            current = current.next;
        }
        //below s specifies that it is a string to be printed
        System.out.print("null");
    }
    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        SLLL sll = new SLLL();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(12);

        // sll.head.next = second;
        // second.next = third;
        // third.next = fourth;

        sll.insertFirst(10);
        sll.insertFirst(20);
        sll.insertFirst(30);
        sll.display();
        System.out.println("\nlength of linkedList is: "+ sll.length());
    }
}
