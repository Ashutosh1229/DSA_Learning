package LinkedListKK;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size+=1;
        if(tail == null){
            tail = head;
        }
    }

    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insertByPos(int loc, int val){
        if(loc == 0){
            insertFirst(val);
        } else if (loc == size) {
            insertLast(val);
        } else if (loc > size || loc < 0) {
            throw new RuntimeException("Unexpected index");
        }else{
            Node node = new Node(val);
            Node prev = getNode(loc-1);
            node.next = prev.next;
            prev.next = node;
            size+=1;
        }
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size-=1;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node node = getNode(size-2);
        int val = tail.val;
        node.next = null;
        tail = node;
        return val;
    }

    public int deleteByPos(int loc){
        if(loc == 0){
            return deleteFirst();
        }else if(loc == size-1){
            return deleteLast();
        }else {
            Node prev = getNode(loc - 1);
            int val = prev.next.val;
            prev.next = prev.next.next;
            return val;
        }
    }

    private class Node{
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

    private Node getNode(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    private Node findNode(int val){
        Node node = head;

        while (node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
