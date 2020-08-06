import java.lang.annotation.Target;
import java.util.ArrayList;

public class test47 {
    //    输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下
    //    一直到叶结点所经过的结点形成一条路径。
//    思路：1.空node直接返回    每次向下将节点数值加入，记录节点数量 2.当前加和等于target且是叶子节点，把所有的number加入list，list加入result3.当前小于target，
//    有左节点，继续递归左节点  4.右节点同理  叶子节点路径和不等于


     public static class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
//    static ArrayList<Integer> list=new ArrayList<>();
     static ArrayList<ArrayList<Integer>> alist=new ArrayList<>();
    public static void main(String[] arg) {
         TreeNode t=new TreeNode(4);
         t.left=new TreeNode(3);
         t.right=new TreeNode(5);
         t.left.left=new TreeNode(2);
         t.left.right=new TreeNode(6);
         t.right.left=new TreeNode(7);
         t.right.right=new TreeNode(9);

        System.out.println(FindPath(t,13));

    }


    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
         ArrayList<Integer> pathList=new ArrayList<>();
         if(root==null){
             return alist;
         }
         int curSum=0;
         int index=0;
         int []path=new int[1000];
         isTargetPath(root,target,curSum,path,index);
         return alist;

    }

    public static void isTargetPath(TreeNode curNode,int target, int curSum,int []path,int index){
        if(curNode==null){
            return;
        }
        curSum+=curNode.val;
        path[index]=curNode.val;
        index++;
        if((curSum==target)&&(curNode.left==null)&&(curNode.right==null)){
            ArrayList<Integer> pathList=new ArrayList<>();
            for(int i=0;i<index;i++){
                pathList.add(path[i]);
            }
            alist.add(pathList);
            return;
        }
        if(curSum<target&&curNode.left!=null){
            isTargetPath(curNode.left,target,curSum,path,index);
        }
        if(curSum<target&&curNode.right!=null){
            isTargetPath(curNode.right,target,curSum,path,index);
        }

    }
}
