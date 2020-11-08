package links;

import java.util.List;

/**
 * 思路：递归每一个k块，每次指针移动到下一块起点开始新一轮倒转
 *      每一块内，首先存储当前的后面的串和当前串pre，前一个做指针移动后当前的后一个，pre不断存贮倒转后的，到当前块移动到下一个的开头，开始新一轮递归
 */
public class test1 {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

    }
    /**
     * 将给出的链表中的节点每\ k k 个一组翻转，返回翻转后的链表
     * 如果链表中的节点数不是\ k k 的倍数，将最后剩下的节点保持原样
     * 你不能更改节点中的值，只能更改节点本身。
     */
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        ListNode result=reverseKGroup(list,2);
        int x=0;
    }
    /**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public static ListNode reverseKGroup (ListNode head, int k) {
        // write code here

        if(head==null){
            return null;
        }
        ListNode temp=head;
        int count=0;

        while(temp!=null&&count<k){
            count++;
            temp=temp.next;
        }
        if(count<k){
            return head;
        }

        ListNode pre=null, curr=head;
        while(curr!=temp){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head.next=reverseKGroup(temp,k);
        return pre;
    }
}
