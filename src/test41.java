import java.util.ArrayList;

public class test41 {
//    输入一个链表，输出该链表中倒数第k个结点。

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String []arg){
        ArrayList<ListNode> list=new ArrayList<>();
        for (int i=0;i<5;i++){
            list.add(new ListNode(i));
        }
        for (int i=0;i<5;i++){
            if(i==4){
                list.get(i).next=null;
            }else{
                list.get(i).next=list.get(i+1);
            }
        }
        FindKthToTail(list.get(0),2);

    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        int count=0;
        ListNode temp=head;
        while(head!=null){
            count++;
            head=head.next;
        }
        if(k>count){
            return null;
        }
        int index=count-k;
        ListNode l=null;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }

        return temp;
    }

}
