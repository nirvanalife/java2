import java.util.ArrayList;

public class test96 {
//    将一个链表\ m m 位置到\ n n 位置之间的区间反转
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
        this.val = val;
    }

    }
    public static void main(String[] args) {
//        ListNode head=new ListNode(1);
//        head.next=new ListNode(2);
//        head.next.next=new ListNode(3);
//        head.next.next.next=new ListNode(4);
//        head.next.next.next.next=new ListNode(5);
        ListNode head=new ListNode(3);
        head.next=new ListNode(5);
        ListNode result=reverseBetween(head,1,1);
    }

    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public static ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode temp=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int count=1;
        while(head!=null){
            list.add(head.val);
            count++;
            head=head.next;
        }
        ArrayList<Integer> list2=new ArrayList<>();
        list2= (ArrayList<Integer>) list.clone();
        int sum=m-1+n-1;
        for(int i=m-1;i<=n-1;i++){
            list2.set(i,list.get(sum-i));
        }
        ListNode x=new ListNode(list2.get(0));
        ListNode y=x;
        for(int i=1;i<list2.size();i++){
            x.next=new ListNode(list2.get(i));
            x=x.next;
        }
        return y;
    }

}
