package tree;


import java.util.ArrayList;

//给定一个二叉树和一个值\ sum sum，请找出所有的根节点到叶子节点的节点值之和等于\ sum sum 的路径，
public class test1 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode tr=new TreeNode(1);
        tr.left=new TreeNode(2);

        ArrayList<ArrayList<Integer>> list=pathSum(tr,1);
        int x=0;
    }
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return int整型ArrayList<ArrayList<>>
     */
    public static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        if(root==null){
            return new ArrayList<>();
        }
        helper(root,sum,0,new ArrayList<>());
        return list;
    }
    public static void helper(TreeNode root,int sum,int cur,ArrayList<Integer> l){
        if(root==null||root.left==null&&root.right==null){
            if(root==null){
//                if(cur==sum){
//                    list.add(new ArrayList<>(l));
//                    l.remove(l.size()-1);
//                }
                return;
            }
            if(cur+root.val==sum){
                l.add(root.val);
                list.add(new ArrayList<>(l));
                l.remove(l.size()-1);
            }

            return;
        }
        cur=cur+root.val;
        l.add(root.val);
        helper(root.left,sum,cur,l);
        helper(root.right,sum,cur,l);
        if(l.size()>0){
            l.remove(l.size()-1);
        }else{
            return;
        }


    }
}
