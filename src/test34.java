import java.util.ArrayList;

public class test34 {

//    输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public static void main(String []a){
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(6);
        ListNode l4=new ListNode(9);
        ListNode l5=new ListNode(1);
        ListNode l6=new ListNode(4);
        ListNode l7=new ListNode(8);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        l5.next=l6;
        l6.next=l7;

        ListNode nl=Merge(l1,l5);
        int t=1;
    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ArrayList<ListNode> list=new ArrayList<>();
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode mL;
        if(list1.val>list2.val){
            list.add(list2);
            list2=list2.next;
        }else{
            list.add(list1);
            list1=list1.next;
        }



        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                ListNode l=new ListNode(list2.val);
                list2=list2.next;
                list.add(l);

            }else{
                ListNode l=new ListNode(list1.val);
                list1=list1.next;
                list.add(l);

            }

        }
        if(list1==null&&list2==null){

        }
        else if(list1==null){
            while(list2!=null){
                list.add(list2);

                list2=list2.next;
            }

        }
        else{
            while(list1!=null){
                list.add(list1);
                list1=list1.next;
            }

        }

        for (int i=0;i<list.size();i++){

            if(i==list.size()-1){
                list.get(i).next=null;
            }else{
                list.get(i).next=list.get(i+1);
            }
        }
        return list.get(0);


    }
}
