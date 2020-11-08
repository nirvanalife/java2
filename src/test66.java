import java.util.ArrayList;
//删除链表重复元素
public class test66 {
    public static ArrayList<Integer> list=new ArrayList<>();
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public static void main(String arg[]){
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        ListNode ll=deleteDuplicates(l);
        int t=1;
    }

    public static ListNode deleteDuplicates (ListNode head) {
        if(head==null){
            return null;
        }
        while(head!=null){
            if(!list.contains(head.val)){
                list.add(head.val);
            }
            head=head.next;
        }
        ListNode newL =new ListNode(list.get(0)) ;
        ListNode cL=newL;
        for(int i=1;i<list.size();i++){
            newL.next=new ListNode(list.get(i));
            newL=newL.next;
        }

        // write code here
        return cL;
    }
}
