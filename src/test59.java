import java.util.ArrayList;
import java.util.Collections;

public class test59 {

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public static ListNode sortInList (ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer>list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        int len=list.size();

        ListNode temp = new ListNode(list.get(0));
        ListNode l=temp;
        for(int i=1;i<len;i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return l;
    }
    public static void main(String []arg){
        ListNode list=new ListNode(1);
        list.next=new ListNode(3);
        list.next.next=new ListNode(2);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        System.out.println(sortInList(list));
    }
}
