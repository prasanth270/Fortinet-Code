package com.prasanth.reverselist;

public class ReverseList {


    static class Node {
        Node next;
        int value;

        public Node(int value, Node head){
            this.next = head;
            this.value = value;
        }
    }

    /*
     * Test Cases
     * INPUT - OUTPUT
     * - null => null
     * - 1 -> nul; => 1 -> null
     * - 2 -> 4 -> 5 -> null => 5 -> 4 -> 2 -> null
     * - 1 -> 1 -> 1 -> null => 1 -> 1 -> 1 -> null
     */

    public Node reverseList(Node head) {

        if(head == null || head.next == null)
            return head;

        Node newHead = head;
        Node reverseNode = null;

        while(newHead != null){
            Node tempNode = newHead;
            newHead = newHead.next;
            tempNode.next = reverseNode;

            reverseNode = tempNode;
        }

        return reverseNode;
    }

    public void printList(Node head){

        if (head == null)
            System.out.println("List is Empty!!");

        while (head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        ReverseList obj = new ReverseList();

        //Node head = new Node(2, new Node(4, new Node(5, null)));
        //Node head = null;
        Node head = new Node(1, new Node(1, null));
        obj.printList(obj.reverseList(head));

    }

}

