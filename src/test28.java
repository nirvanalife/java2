public class test28 {
//    给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
//    思路：1.无右子树：向上遍历直到自己是父节点的左子树 到父节点依然不是：返回null
//         2.有右子树：右子树最左节点
    public static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

    TreeLinkNode(int val) {
         this.val = val;
    }
}
    public static void main(String []arg){
        TreeLinkNode t1=new TreeLinkNode(5);
        TreeLinkNode t2=new TreeLinkNode(3);
        TreeLinkNode t3=new TreeLinkNode(7);
        TreeLinkNode t4=new TreeLinkNode(1);
        TreeLinkNode t5=new TreeLinkNode(4);
        TreeLinkNode t6=new TreeLinkNode(6);
        TreeLinkNode t7=new TreeLinkNode(8);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.left=t6;
        t3.right=t7;
        t2.next=t1;
        t3.next=t1;
        t4.next=t2;
        t5.next=t2;
        t6.next=t3;
        t7.next=t3;
        int flag=0;
        TreeLinkNode pNode=t7;
        //无右子树
        if(pNode.right==null){
            if(pNode.next==null){
                System.out.println("null");
            }else{
               while(pNode.next!=null){
                    if(pNode.next.left==pNode){
                        System.out.println(pNode.next.val);
                        flag=1;
                        break;
                    }
                    pNode=pNode.next;

               }
               if(flag==0){
                   System.out.println("null");
               }


            }
        }else{
            pNode=pNode.right;
            while(pNode.left!=null){
                pNode=pNode.left;
            }
            System.out.println(pNode.val);
        }



    }
//public class Solution {
//    public TreeLinkNode GetNext(TreeLinkNode pNode)
//    {
//
//    }
//}
}
