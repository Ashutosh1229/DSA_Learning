package LinkedListKK;

import java.util.Scanner;

public class learningLL {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//
//        list.traverse();

//        list.deleteFirst();
//        list.insertByPos(3, 6);
//
//        System.out.println();
//        list.traverse();

//        DLL list = new DLL();
//
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(6);

//        list.traverse();
//        list.traverseRev();
//        list.traverseRevUsingTail();

//        list.insertByPos(7,1);
//        list.traverse();

        CLL list = new CLL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.traverse();
        list.deleteByVal(3);
        list.traverse();
    }
}
