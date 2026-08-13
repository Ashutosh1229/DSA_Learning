package LinkedList;

import java.util.Scanner;

public class SimpleLinkedList {

    static class Node{
        int val;
        Node next;

        public Node() {
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Create - done
        // Read - done
        // Update - TODO
        // Delete - TODO
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node rear =  null;
        while (true){
            System.out.println("1. Create \n2. Read\n3. Update\n4. Delete\n5. exit\n6. reverse\n7. clean");
            int choice = sc.nextInt();
            switch (choice){
                case 1: {
                    head = createLL(head,rear);
                    break;
                }
                case 2: {
                    readLL(head);
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                case 6: {
                    head = reverseLL(head);
                    break;
                }
                case 7: {
                    head = null;
                    break;
                }
            }
        }

    }

    private static Node createLL(Node head, Node rear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.println("Enter val:");
            int val = sc.nextInt();
            Node newNode = new Node(val,null);

            if(head == null){
                head = newNode;
                rear = head;
            } else{
                rear.next = newNode;
                rear = rear.next;
            }
        }
        return head;
    }

    private static void readLL(Node head){
        Node iter = head;
        while (iter != null){
            System.out.println(iter.val);
            iter = iter.next;
        }
    }

    private static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;

            curr.next = prev;
            
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
