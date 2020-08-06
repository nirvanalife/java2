import java.util.ArrayList;
//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
public class test22 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}

    public static void main(String []arg){
        ListNode l1=new ListNode(5);
        ListNode lll=new ListNode(6);
        l1.next=lll;
        lll.next=new ListNode(9);
        lll.next.next=new ListNode(7);
        lll.next.next.next=new ListNode(8);
        lll.next.next.next.next=lll;
        ListNode temp=null;
        int flag=0;
//        ArrayList<ListNode> l2=new ArrayList<>();
        ArrayList<ListNode> list=new ArrayList<>();
        while(l1!=null){
            if(list.contains(l1)){

                flag=1;
                break;
            }else{

                list.add(l1);
                l1=l1.next;
            }
        }
        if(flag==1){
            temp=l1;
        }else{
            temp=null;
        }
        int t=1;

    }





//        public ListNode EntryNodeOfLoop(ListNode pHead)
//        {
//
//        }

}
