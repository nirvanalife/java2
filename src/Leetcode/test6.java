package Leedcode;

import java.util.ArrayList;

/**
 *实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值
 */
public class test6 {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        System.out.println(kthToLast(list,2));
    }
    public static int kthToLast(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int x=list.size();
        int index=x-k;

        return list.get(index);
    }

}
