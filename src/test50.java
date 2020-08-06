import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class test50 {
//    请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。

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
        t.left=new TreeNode(5);
        t.right=new TreeNode(5);
        t.left.left=new TreeNode(5);
        t.left.left.left=new TreeNode(5);
        t.right.right=new TreeNode(5);
        t.right.right.left=new TreeNode(5);

        System.out.println(isSymmetrical(t));
    }

    static boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null){
            return false;
        }
        if(pRoot.left==null&&pRoot.right==null){
            return true;
        }
        TreeNode origin=copyTree(pRoot);
        TreeNode temp=getTree(pRoot);
        return isEqual(temp,origin);
    }
    static TreeNode getTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=getTree(root.right);
        root.right=getTree(temp);
        return root;
    }

    static TreeNode copyTree(TreeNode root){
        if(root==null){
            return null;
        }
//        TreeNode temp=root.right;
        TreeNode t=new TreeNode(root.val);
        t.left=copyTree(root.left);
        t.right=copyTree(root.right);
        return t;
    }

    static boolean isEqual(TreeNode root1,TreeNode root2){
          if(root1==null&&root2==null){
              return true;
          }
          if((root1==null&&root2!=null)||(root1!=null&&root2==null))
              return false;
          if(root1.val==root2.val){
              return isEqual(root1.left,root2.left)&&isEqual(root1.right,root2.right);
          }
          return false;
//        ArrayList<Integer> list1=PrintFromTopToBottom(root1);
//        ArrayList<Integer> list2=PrintFromTopToBottom(root2);
//        if(list1.size()!=list2.size()){
//            return false;
//        }
//        for(int i=0;i<list1.size();i++){
//            if(!list1.get(i).equals(list2.get(i))){
//                return false;
//            }
//        }
//        return true;

    }
//    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        Queue<TreeNode> query=new LinkedList<>();
//        if(root==null){
//            return new ArrayList<>();
//        }
//        ArrayList<Integer> list=new ArrayList<>();
//        query.add(root);
//        while(!query.isEmpty())
//        {
//            TreeNode t=query.poll();
//            list.add(t.val);
//            if(t.left!=null)
//                query.add(t.left);
//            else
//                list.add(-1);
//            if(t.right!=null)
//                query.add(t.right);
//            else
//                list.add(-1);
//
//        }
//        return list;
//    }






}
