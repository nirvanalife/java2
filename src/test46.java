import java.util.ArrayList;

public  class test46 {
//    在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        ArrayList<ListNode> list=new ArrayList<>();

        while(pHead!=null){
            list.add(pHead);
            pHead=pHead.next;

        }


        return null;
    }
    public static void main(String []arg){
        ArrayList<ListNode> list=new ArrayList<>();
        for(int i=0;i<7;i++){
            list.add(new ListNode(i));
        }
        for (int i=0;i<7;i++){
            if(i==6){
                list.get(i).next=null;
            }else{
                list.get(i).next=list.get(i+1);
            }
        }
        list.get(0).val=1;
        list.get(1).val=2;
        list.get(2).val=3;
        list.get(3).val=3;
        list.get(4).val=4;
        list.get(5).val=4;
        list.get(6).val=5;
        deleteDuplication(list.get(0));

    }
}

}
