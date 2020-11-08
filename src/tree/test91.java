package tree;


import java.util.ArrayList;

//n 表示环形链表的长度， m 表示每次报数到 m 就自杀。
public class test91 {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public static void main(String[] args) {
        int n=5;
        int m=2;
        System.out.println(ysf(n,m));
    }


    /**
     *
     * @param n int整型
     * @param m int整型
     * @return int整型
     */
    public static int ysf (int n, int m) {
        // write code here
        ListNode s=new ListNode(1);
        ListNode x=s;
        for(int i=1;i<n;i++){
            s.next=new ListNode(i+1);
            s=s.next;
        }
        s.next=x;
        ListNode list=x;
        int count=1;
        while(list.next!=list){
            if((count+1)%m==0){
                ListNode a=list.next;
                ListNode b=a.next;
                list.next=b;

                count=count+1;
            }
            list=list.next;
            count=count+1;
        }
      return list.val;
    }

}
