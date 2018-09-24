public class Main {
    public static void main(String[] args){
        Q3 q3 = new Q3();
//        {67,0,24,58}
        Q3ListNode listNode = new Q3ListNode(67);
        Q3ListNode listNode0 = new Q3ListNode(0);
        Q3ListNode listNode1 = new Q3ListNode(24);
        Q3ListNode listNode2 = new Q3ListNode(58);
        Q3ListNode.insertFromTail(listNode,listNode0);
        Q3ListNode.insertFromTail(listNode,listNode1);
        Q3ListNode.insertFromTail(listNode,listNode2);
        Q3ListNode.printList(listNode);
        System.out.println(q3.printListFromTailToHead(listNode));
    }
}
