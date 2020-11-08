package tree;

public class test95 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(0);
        tree.left=new TreeNode(1);
//        tree.right=new TreeNode(3);
        System.out.println(sumNumbers(tree));
    }
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    public static int sum=0;
    public static int sumNumbers (TreeNode root) {
        // write code here
        int sum=0;
        if(root==null){
            return 0;
        }else
           return getSum(root,0);



    }
    public static int getSum(TreeNode root,int sum){

        if(root==null){
            return 0;
        }
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }
        return getSum(root.left,sum)+getSum(root.right,sum);


    }
}
