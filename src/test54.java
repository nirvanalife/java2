public class test54 {
//    输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
//    思路：1.hasTree中如果两个树都空 不是子树，否则进入isTree，以及root1左移一个节点继续判断是否子树，root1右移一个节点继续判断
//         2.isTree 中如果tree2为空，匹配成功，tree1为空tree2不为空，匹配失败 如果根节点相同，root1和root2分别左移和右移一个节点 继续判断isTree
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

}

    public static void main(String []arg){
        TreeNode tr=new TreeNode(8);
        tr.left=new TreeNode(8);
        tr.right=new TreeNode(7);
        tr.left.left=new TreeNode(9);
        tr.left.right=new TreeNode(2);
        tr.left.right.left=new TreeNode(4);
        tr.left.right.right=new TreeNode(7);

        TreeNode t=new TreeNode(8);
        t.left=new TreeNode(9);
        t.right=new TreeNode(2);
        System.out.println(HasSubtree(tr,t));

    }
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return isSubTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    public static boolean isSubTree(TreeNode root1,TreeNode root2){


        if(root2==null){
            return true;
        }
        if(root1==null)
            return false;
        if(root1.val==root2.val){
            return isSubTree(root1.left,root2.left)&&isSubTree(root1.right,root2.right);
        }
        return false;
    }


}
