
//    题目描述
//    输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

import java.util.ArrayList;
public class Q3 {
    public ArrayList<Integer> printListFromTailToHead(Q3ListNode listNode) {
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = 0;
        Q3ListNode temp = listNode;
        while (temp!=null){
            arrayList1.add(temp.val);
            length = length+1;
            temp = temp.next;
        }
        for(int i =length-1; i>=0; i--){
            arrayList2.add(arrayList1.get(i));
        }
        return arrayList2;
    }
}