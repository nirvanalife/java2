import java.util.ArrayList;
import java.util.Arrays;

// TODO: 2020/10/17 存在溢出需要修改
public class test81 {
//    假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
//    给定两个这种链表，请生成代表两个整数相加值的结果链表。
//    例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0。
    public static class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }

}
    public static void main(String []arg){
        ListNode listNode1=new ListNode(9);
        listNode1.next=new ListNode(3);
        listNode1.next.next=new ListNode(7);
        ListNode listNode2=new ListNode(6);
        listNode2.next=new ListNode(3);
        ListNode l=addInList(listNode1,listNode2);
        System.out.println(l);
    }
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public static ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if(head1==null&&head2==null){
            return null;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        while(head1!=null){
            list1.add(head1.val);
            head1=head1.next;
        }
        while(head2!=null){
            list2.add(head2.val);
            head2=head2.next;
        }
        int x=0;
        int y=0;
        for(int i=0;i<list1.size();i++){
            x=x*10+list1.get(i);
        }
        for(int i=0;i<list2.size();i++){
            y=y*10+list2.get(i);
        }
        int sum=x+y;
        String s=String.valueOf(sum);
        char []c=s.toCharArray();
        int []p=new int[c.length];
        for(int i=0;i<c.length;i++){
            int num = Integer.parseInt(String.valueOf(c[i]));
            p[i]=num;
        }
        ListNode l=new ListNode(0);
        ListNode m=l;
        l.val=p[0];
        int count=1;
        while(count<c.length){
            l.next=new ListNode(p[count++]);
            l=l.next;

        }
        return m;
    }
}
