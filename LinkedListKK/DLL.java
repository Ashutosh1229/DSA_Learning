package LinkedListKK;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        size+=1;
        if(head != null){
            head.prev = node;
        }
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }

    public void insertLast(int val){ //without using tail
        Node node = new Node(val);
        size+=1;
        if(head == null){
            insertFirst(val);
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
            tail = node; // maintaining only no using
        }

    }

    public void insertLastUsingTail(int val){ //using tail
        Node node = new Node(val);
        size+=1;
        if(head == null){
            insertFirst(val);
        }else{
            node.prev = tail;
            tail.next = node;
            tail = node;
        }

    }

    public void insertByPos(int val, int idx){
        if(idx == 0){
            insertFirst(val);
        }else if (idx == size-1){
            insertLast(val);
        } else if (idx >= size) {
            System.out.println("Invalid index");
        } else {
            Node node = new Node(val);
            Node prevNode = getNode(idx-1);
            node.next = prevNode.next;
            node.prev = prevNode;
            prevNode.next = node;
            if(node.next.prev != null){
                node.next.prev = node;
            }
        }
    }

    public void traverse(){
        Node node = head;
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void traverseRevUsingTail(){
        Node node = tail;
        while (node != null){
            System.out.print(node.val + " <- ");
            node = node.prev;
        }
        System.out.println("Start");
    }

    public void traverseRev(){
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        while (node != null){
            System.out.print(node.val + " <- ");
            node = node.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node prev, Node next){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node getNode(int idx){
        if(idx == 0){
            return head;
        }else {
            Node temp = head;
            for(int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp;
        }
    }
}
