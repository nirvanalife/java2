
public class test16 {
//    输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，
//    所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
//    思路：一个不动另一个指针依次next到末尾，初始化第二个，第一个到next直到全部末尾

public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        return null;
}

    public static void main(String []arg){
        ListNode pHead1=new ListNode(3);
        pHead1.next=new ListNode(4);
        pHead1.next.next=new ListNode(5);

        ListNode pHead2=new ListNode(5);
        pHead2.next=new ListNode(4);
        pHead2.next.next=new ListNode(6);

        ListNode p1=pHead1;
        ListNode p2=pHead2;

        ListNode c;

        int flag=0;
        if(pHead1!=null||pHead2==null){
            System.out.println("无");
        }
        while(pHead1.val!=pHead2.val){
            if(pHead1.next!=null){
                pHead1=pHead1.next;
            }else{
                if(pHead2.next!=null){
                    pHead2=pHead2.next;
                    pHead1=p1;
                }else{
                    System.out.println("无");
                    flag=1;
                    break;
                }

            }
        }
        if(flag==0){
            c=pHead1;
        }else{
            c=null;
        }
        System.out.println(c);




    }
}
