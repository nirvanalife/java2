import java.util.ArrayList;

/**
 * 思路：一个快指针一个慢指针，如果两个相遇，证明有环，否则遇到null返回没有环，两个相遇后一个回到head两个都next，直到再次相遇那么相遇点是环的入口
 */
public class test97 {
//    对于一个给定的链表，返回环的入口节点，如果没有环，返回null
//    拓展：
//    你能给出不利用额外空间的解法么？
public static class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        head.next=l2;
        l2.next=l3;
        ListNode l4=new ListNode(4);
        l3.next=l4;
        l4.next=l2;
        ListNode result=detectCycle(head);

    }

    public static ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode list1=head;
        ListNode list2=head;
        while((list2!=null)&&(list2.next!=null)){
            list1=list1.next;
            list2=list2.next.next;
            if(list1==list2){
                list1=head;
                while(list1!=list2){
                    list1=list1.next;
                    list2=list2.next;
                }
                break;
            }
        }
        if(list2==null||list2.next==null){
            return null;
        }
        return list1;
    }

}
