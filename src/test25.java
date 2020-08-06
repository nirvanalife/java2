import java.util.ArrayList;

public class test25 {
//    输入一个链表，反转链表后，输出新链表的表头。
//    /*
public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
//public class Solution {
//    public ListNode ReverseList(ListNode head) {
//
//    }
//}
    public static void main(String []arg){
        ListNode l=new ListNode(5);
        l.next=new ListNode(6);
//        l.next.next=new ListNode(7);
        ArrayList<ListNode> list=new ArrayList<>();
        if(l==null){
            System.out.println();
        }
        while(l!=null){
            list.add(l);
            l=l.next;
        }

        int len=list.size();

        for (int i=len-2;i>=-1;i--){
            if(i==-1){
                list.get(i+1).next=null;
            }else{
                list.get(i+1).next=list.get(i);
            }

        }

        System.out.println(list.get(len-1));
    }
}
