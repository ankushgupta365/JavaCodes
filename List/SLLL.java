package List;
//special attention: (1.) insert method which inset node at any given postion in the node
//                   (2.) reverse method which reverse the list 
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

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "....>");
            current = current.next;
        }
        //below s specifies that it is a string to be printed
        System.out.print("null\n");
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
    public void insertEnd(int data){
        //by default newNode will be created with next pointing to null
        ListNode newNode = new ListNode(data);
        //if there is no linked list we point head to newNode
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        //traverse till curretn.next is null
        //we are travelling till current.next is null not till current is null
        while(null != current.next){
            current = current.next;
        }
        //after traversing till null, point current next to newNode
        current.next = newNode;
    }
    public void insert(int position,int data){ //method to insert node at any position starting from 1, where head node is 1
        ListNode newNode = new ListNode(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        int count=1;
        ListNode previous = head;
        //traverse till when you point previous to postion-1
        while(count<position-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next; //where you want to add the newNode, pointing current to exact position node
        newNode.next = current;
        previous.next = newNode;
    }
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = temp.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head == null){
            return head;
        }else if(head.next == null){
            ListNode current = head;
            head = head.next;
            return current;
        }
        ListNode prev= null;
        ListNode current = head;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next =null;
        return current;
    }
    public void delete(int position){
        //we assume that position is valid postion which means it lies in the range of linkedlist
        if(position == 1){
            head = head.next;
            return;
        }else{
            ListNode prev = head;
            int count = 1;
            while(count < position-1){
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            prev.next = current.next;
            return;
        }
    }
    public boolean search(int value){
        ListNode current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public ListNode reverse(){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public ListNode getMidlleNode(ListNode head){
        if(head==null){
            return head;
        }
        ListNode slwPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next !=null){
            slwPtr = slwPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slwPtr;
    }
    public ListNode getNodeFromEnd(int position, ListNode head){
        if(head == null){
            return head;
        }
        if(position<=0){
            throw new IllegalArgumentException("given provided position is less then zero ");
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count =0;
        while(count<position){
            if(mainPtr == null){
                throw new IllegalArgumentException("given position is greater then the linked list length");
            }
            mainPtr = mainPtr.next;
            count++;
        }
        //we move mainPtr extra position ahed from head so refPtr is behind mainPtr till we want it to be
        while(mainPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return refPtr;
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
        sll.insertEnd(2);
        sll.insert(1,5);
        sll.display(sll.head);
        System.out.println("length of linkedList is: "+ sll.length());
        sll.deleteFirst();
        System.out.println("....After deleting first node...");
        sll.display(sll.head);
        sll.delete(3);
        System.out.println("After deleting node at 3 location");
        sll.display(sll.head);
        System.out.println("Searching value: 30 in linked list "+ sll.search(30));
        ListNode reversedList = sll.reverse();
        sll.display(reversedList);
        sll.insertEnd(5);
        sll.display(reversedList);
        System.out.println("Middle node data is " + sll.getMidlleNode(reversedList).data);
        System.out.println("Node from n=2 from end is " + sll.getNodeFromEnd(2,reversedList).data);
    }
}
