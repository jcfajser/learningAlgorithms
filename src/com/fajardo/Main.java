package com.fajardo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//      arraysOperations();
//      stacksOperations();
//      queueOperations();

        linkedListOperations();

    }

    private static void linkedListOperations() {
        LinkList theLinkedList = new LinkList();
        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings", 150);
        theLinkedList.insertFirstLink("Harry Potter ant the Sorcerer's Stone", 107);
        theLinkedList.display();
        theLinkedList.removeFirst();
        theLinkedList.display();
        System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found\n");
        theLinkedList.removeLink("The Lord of the Rings");
        theLinkedList.display();
    }

    private static void queueOperations() {
        TheQueue theQueue = new TheQueue(10);

        theQueue.insert("10");
        theQueue.insert("6");
        theQueue.insert("9");
        theQueue.insert("2");

        theQueue.priorityInsert("10");
        theQueue.priorityInsert("19");
        theQueue.priorityInsert("15");
        theQueue.priorityInsert("11");

        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();
        theQueue.displayQueue();
        theQueue.peek();
    }

    private static void stacksOperations() {
        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("15");
        theStack.peek();
        theStack.pop();
        theStack.pushMany("12 13 14 15");
        theStack.popAll();
        theStack.displayTheStack();
    }

    private static void arraysOperations() {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.generateRandomArray();
        arrayStructures.printArray();
        System.out.println(arrayStructures.getValueIndex(3));
        System.out.println(arrayStructures.doesArrayContainThisValue(18));
        arrayStructures.deleteIndex(4);
        arrayStructures.printArray();
        arrayStructures.insertValue(55);
        arrayStructures.printArray();
        arrayStructures.linearSearchForValue(17);
        arrayStructures.bubbleSort();
        arrayStructures.selectionSort();
        arrayStructures.binarySearchForValue(11);
        arrayStructures.insertionSort();
    }
}
