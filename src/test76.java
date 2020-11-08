import java.util.ArrayList;

public class test76 {
//    给定一个链表，请判断该链表是否为回文结构。
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
        list.next.next=new ListNode(2);
        list.next.next.next=new ListNode(1);
        System.out.println(isPail(list));
    }
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public static boolean isPail (ListNode head) {
        // write code here
        if(head==null){
            return true;
        }
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        for(int i=0;i<list.size();i++){
            if(!list.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;
    }
}
