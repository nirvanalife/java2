import java.util.ArrayList;

public class test49 {
//    在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->

 public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    public static void main(String []arg){
        ArrayList<ListNode> list=new ArrayList<>();
//        ListNode pHead=new ListNode(1);
        for (int i=1;i<=3;i++){
            list.add(new ListNode(i));
        }
        list.add(new ListNode(3));
        list.add(new ListNode(4));
        for (int i=4;i<=5;i++){
            list.add(new ListNode(i));
        }
        for (int i=0;i<=6;i++){
            if(i==6){
                list.get(i).next=null;
            }else{
                list.get(i).next=list.get(i+1);
            }

        }
        deleteDuplication(list.get(0));

    }


    public static ListNode deleteDuplication(ListNode pHead)
    {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> k=new ArrayList<>();
        ArrayList<ListNode> l=new ArrayList<>();
        while(pHead!=null){

            if(list.contains(pHead.val)){
                k.add(pHead.val);

            }else{
                list.add(pHead.val);
            }
            pHead=pHead.next;
        }
        for(int i=0;i<k.size();i++){
            list.remove(k.get(i));
        }
        for(int i=0;i<list.size();i++){
           l.add(new ListNode(list.get(i)));
        }
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                l.get(i).next=null;
            }else{
                l.get(i).next=l.get(i+1);
            }
        }
        if(l.size()==0){
            return null;
        }
        return l.get(0);
    }






}
