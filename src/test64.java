public class test64 {
//    合并两个链表
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public static void main(String []arg){
        ListNode L1=new ListNode(1);
        L1.next=new ListNode(2);
        L1.next.next=new ListNode(4);
        L1.next.next.next=new ListNode(8);
        ListNode L2=new ListNode(1);
        L2.next=new ListNode(3);
        L2.next.next=new ListNode(5);
        L2.next.next.next=new ListNode(7);
        ListNode l3=mergeTwoLists(L1,L2);
        int t=1;
    }
    public static ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1==null&&l2==null){
            return null;
        }else if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }
        ListNode l3;
        if(l1.val<=l2.val){
            l3=new ListNode(l1.val);
            l3.next=mergeTwoLists(l1.next,l2);
        }else{
           l3=new ListNode(l2.val);
            l3.next=mergeTwoLists(l1,l2.next);
        }

        return l3;
    }
}
