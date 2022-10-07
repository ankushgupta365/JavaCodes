package List;

public class SLLL {
    private ListNode head;

    private static class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

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
    public static void main(String[] args) {
        SLLL sll = new SLLL();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(12);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        System.out.println("length of linkedList is: "+ sll.length());
    }
}
