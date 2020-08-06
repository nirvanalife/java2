import java.util.ArrayList;

public class test38 {
//    输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

        public static class ListNode {
            int val;
             ListNode next = null;

             ListNode(int val) {
                 this.val = val;
             }
        }



    public static void main(String []arg){
        ListNode listNode=new ListNode(1);
        ArrayList<ListNode> a=new ArrayList<>();
        for(int i=0;i<6;i++){
            ListNode l=new ListNode(i);
            a.add(l);

        }
        for (int i=0;i<5;i++){
            a.get(i).next=a.get(i+1);
        }
        printListFromTailToHead(a.get(0));
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if(listNode==null){
            return new ArrayList<>();
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> flist=new ArrayList();
        for (int i=list.size()-1;i>=0;i--){
            flist.add(list.get(i));
        }
        return flist;
    }
}
