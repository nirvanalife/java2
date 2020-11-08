import java.util.ArrayList;
import java.util.Stack;

public class test71 {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public static void main(String []arg){
//        给定一个链表，删除链表的倒数第n个节点并返回链表的头指针
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);
        l.next.next.next.next=new ListNode(5);
        removeNthFromEnd(l,2);
    }
    public static ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int length=list.size();
        int x=length-n;
        for (int i=x;i<length-1;i++){
            list.set(i,list.get(i+1));
        }
        list.remove(list.size()-1);
        length=list.size();
        ListNode h=new ListNode(list.get(0));
        ListNode l=h;
        int count=1;
        while(count<length){
            h.next=new ListNode(list.get(count++));
            h=h.next;
        }
        return l;
    }

}
