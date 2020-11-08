public class test75 {
//    给定彼此独立的两棵二叉树，判断 t1 树是否有与 t2 树拓扑结构完全相同的子树。
//    设 t1 树的边集为 E1，t2 树的边集为 E2，若 E2 等于 E1 ，则表示 t1 树和t2 树的拓扑结构完全相同。
    public static void main(String []arg){
        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(2);
        t.right=new TreeNode(3);
        t.left.left=new TreeNode(4);
        t.left.right=new TreeNode(5);
        t.right.left=new TreeNode(6);
        t.right.right=new TreeNode(7);
        t.left.left.right=new TreeNode(8);
        t.left.right.left=new TreeNode(9);
        TreeNode tr=t.left;
        System.out.println(isContains(t,tr));
    }
    /**
     *
     * @param root1 TreeNode类
     * @param root2 TreeNode类
     * @return bool布尔型
     */
    public static boolean isContains (TreeNode root1, TreeNode root2) {
        // write code here
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val==root2.val){
            return isEqual(root1.left,root2.left)&&isEqual(root1.right,root2.right);
        }else{
            return isContains(root1.left,root2)||isContains(root1.right,root2);
        }

    }
    public static boolean isEqual(TreeNode root1, TreeNode root2){
        if((root1==null&&root2!=null)||(root2==null&&root1!=null)){
            return false;
        }
        if(root1==null){
            return true;
        }
        if(root1.val==root2.val){
            return isEqual(root1.left,root2.left)&isEqual(root1.right,root2.right);
        }else{
            return false;
        }

    }

}
