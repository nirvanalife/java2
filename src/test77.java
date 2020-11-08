import java.util.ArrayList;

public class test77 {
//    给定一个单链表，请设定一个函数，讲链表的奇数位节点和偶数位节点分别放在一起，重排后输出。
//    注意是节点的编号而非节点的数值。
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
             this.val = val;
        }

}
    public static void main(String []arg){
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        list.next.next.next.next.next=new ListNode(6);
        ListNode l=oddEvenList(list);
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public static ListNode oddEvenList (ListNode head) {
        // write code here
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
//        ArrayList<Integer> list1=new ArrayList<>();
//        ArrayList<Integer> list2=new ArrayList<>();
//        while(head!=null&&head.next!=null){
//            list1.add(head.val);
//            list2.add(head.next.val);
//            head=head.next.next;
//        }
//        if(head!=null){
//            list1.add(head.val);
//        }
//        ListNode ln=new ListNode(list1.get(0));
//        int x=list1.size();
//        int y=list2.size();
//        ListNode ll=ln;
//        for (int i=1;i<x;i++){
//
//            ln.next=new ListNode(list1.get(i));
//            ln=ln.next;
//        }
//        for (int i=0;i<y;i++){
//            ln.next=new ListNode(list2.get(i));
//            ln=ln.next;
//        }
//        return ll;
//    }

        ListNode oushuH=head.next;
        ListNode jishu=head;
        ListNode oushu=head.next;
        while(jishu!=null&&jishu.next!=null){
            jishu.next=oushu.next;
            oushu=oushu.next;

        }
        jishu.next=oushuH;
        return jishu;
    }


}
