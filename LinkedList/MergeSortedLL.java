package LinkedList;

import java.util.Scanner;

public class MergeSortedLL {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListNode head1 = null;
        ListNode rear1 = null;

        ListNode head2 = null;
        ListNode rear2 = null;


        while (true) {
            System.out.println("1. Create 1 \n2. Create 2\n3. Read 1\n4. Read 2\n5. Exit\n6. Merge");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    head1 = createLL(head1, rear1);
                    break;
                }
                case 2: {
                    head2 = createLL(head2, rear2);
                    break;
                }
                case 3: {
                    readLL(head1);
                    break;
                }
                case 4: {
                    readLL(head2);
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                case 6: {
                    head1 = mergeLL(head1, head2);
                    break;
                }
                case 7: {
                    head1 = null;
                    head2 = null;
                    break;
                }
            }
        }

    }

    private static ListNode createLL(ListNode head, ListNode rear) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter val:");
            int val = sc.nextInt();
            ListNode newNode = new ListNode(val, null);

            if (head == null) {
                head = newNode;
                rear = head;
            } else {
                rear.next = newNode;
                rear = rear.next;
            }
        }
        return head;
    }

    private static void readLL(ListNode head) {
        ListNode iter = head;
        while (iter != null) {
            System.out.println(iter.val);
            iter = iter.next;
        }
    }

    private static ListNode mergeLL(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode tail = head;

        ListNode iter1 = list1;
        ListNode iter2 = list2;

        while (iter1 != null && iter2 != null) {

            if (iter1.val < iter2.val) {
                tail.next = iter1;
                iter1 = iter1.next;
            } else {
                tail.next = iter2;
                iter2 = iter2.next;
            }

            tail = tail.next;
        }

        if (iter1 != null) {
            tail.next = iter1;
        } else {
            tail.next = iter2;
        }

        return head.next;
    }
}
