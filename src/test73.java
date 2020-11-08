public class test73 {
//    判断给定的链表中是否有环

    /**
     * 基本思路：如果存在回路，快指针和慢指针一定会相遇
     * 不存在则遇见null返回false
     */
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
        this.val = val;
    }

}
    public static void main(String []a){
        ListNode l=new ListNode(1);

        ListNode l2=new ListNode(2);
        l.next=l2;
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        l2.next.next.next=new ListNode(5);
        l2.next.next.next.next=l2;
        System.out.println(hasCycle(l2));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode p=head;
        ListNode q=head;
        while(p!=null&&p.next!=null){
            p=p.next.next;
            q=q.next;
            if(p==q){
                return true;
            }
        }
        return false;
    }
}
