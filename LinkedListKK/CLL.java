package LinkedListKK;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        size++;

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;

    }

    public void insertLast(int val){
        Node node = new Node(val);
        size++;

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;

    }


    public void traverse(){
        Node iter = head;
        do{
            System.out.print(iter.val + " -> ");
            iter = iter.next;
        }while(iter != head);
        System.out.println("End");
    }

    public void deleteByVal(int val){
        if(head == null){
            return;
        }
        Node node = head;
        if(node.val == val){
            head = head.next;
            tail.next = head;
        }
        do{
            if(node.next.val == val){
                int res = node.next.val;
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }while (node != head);
        System.out.println("Number doesn't exist");
        return;
    }
    public CLL(){
        this.size = 0;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
