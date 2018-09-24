public class Q3ListNode {
    int val;
    Q3ListNode next = null;

    Q3ListNode(int val) {
        this.val = val;
    }

    public static void insertFromTail(Q3ListNode head1, Q3ListNode newNode){
        if(head1 == null){ //如果是个空链表，直接把新节点赋值给head，然后结束，要先判断null的情况    其实这是一段错误代码，大家可以查看我另外一篇文章，Java参数引用传递之例外：null
            head1 =newNode;
            return;
        }
        Q3ListNode temp = head1; //用temp代替head去遍历找到最后一个节点，一定不要用head自己去遍历，不然就找不到链表头了
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public static void printList(Q3ListNode head){
        Q3ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
