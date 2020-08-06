import java.util.*;

public class test53 {
//    给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
    public static void main(String []arg){
        TreeNode t=new TreeNode(5);
        t.left=new TreeNode(3);
        t.right=new TreeNode(7);
        t.left.left=new TreeNode(2);
        t.left.right=new TreeNode(4);
        t.right.left=new TreeNode(6);
        t.right.right=new TreeNode(8);
        TreeNode tr=KthNode(t,3);
        int x=0;
    }
    static TreeNode KthNode(TreeNode pRoot, int k)
    {

        ArrayList<TreeNode> list=PrintFromTopToBottom(pRoot);
        if(k>list.size()){
            return null;
        }
        if(pRoot==null){
            return null;
        }
        if(k==0){
            return null;
        }
        ArrayList<Integer> vlist=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            vlist.add(list.get(i).val);
        }
        Collections.sort(vlist);
        int kth=vlist.get(k-1);
        for (int i=0;i<list.size();i++){
            if(list.get(i).val==kth){
                return list.get(i);
            }
        }

        return null;
    }
    public static ArrayList<TreeNode> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> query=new LinkedList<>();
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<TreeNode> list=new ArrayList<>();
        query.add(root);
        while(!query.isEmpty())
        {
            TreeNode t=query.poll();
            list.add(t);
            if(t.left!=null) query.add(t.left);
            if(t.right!=null) query.add(t.right);

        }
        return list;
    }

}
