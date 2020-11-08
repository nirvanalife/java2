import java.util.ArrayList;

public class test82 {
//    给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
public static class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }

}
    public static void main(String []arg){
       ListNode l=new ListNode(1);
       l.next=new ListNode(2);
       l.next.next=new ListNode(3);
       l.next.next.next=new ListNode(3);
       l.next.next.next.next=new ListNode(4);
       l.next.next.next.next.next=new ListNode(4);
       l.next.next.next.next.next.next=new ListNode(5);
       ListNode m=new ListNode(1);
       m.next=new ListNode(1);
       m.next.next=new ListNode(1);
       ListNode x=deleteDuplicates(m);
    }
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public static ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head==null){
            return null;
        }

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> olist=new ArrayList<>();
        int q=0;
        while(head!=null){
            if(!list.contains(head.val)){
                list.add(head.val);
            }else{
                if(!olist.contains(head.val)){
                    olist.add(head.val);
                }

            }
            head=head.next;
        }

        for(int i=0;i<olist.size();i++){
            if(list.contains(olist.get(i))){
                q=list.indexOf(olist.get(i));
                list.remove(q);
            }
        }
        if(list.size()==0){
            return null;
        }

        ListNode l=new ListNode(list.get(0));
        ListNode x=l;
        for(int i=1;i<list.size();i++){
            l.next=new ListNode(list.get(i));
            l=l.next;
        }

        return x;
    }

}
