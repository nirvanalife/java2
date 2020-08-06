import java.util.ArrayList;

public class test52 {
//    输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
//    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public static void main(String []arg){
        int []pre={1,2,4,7,3,5,6,8};
        int []in={4,7,2,1,5,3,8,6};
        TreeNode t=reConstructBinaryTree(pre,in);
        int x=0;
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        if(pre.length!=in.length){
            return null;
        }

        TreeNode root=new TreeNode(pre[0]);
        int length=pre.length;

        int count=0;
        for(int i=0;i<length;i++){
            if(in[i]!=pre[0]){
                count++;
            }else{
                break;
            }
        }
        int []lpre=new int[count];
        int []rpre=new int[length-count-1];
        int []lin=new int[count];
        int []rin=new int[length-count-1];
        for (int i=1;i<=count;i++){
            lpre[i-1]=pre[i];
            lin[i-1]=in[i-1];
        }
        for(int i=count+1;i<length;i++){
            rpre[i-count-1]=pre[i];
            rin[i-count-1]=in[i];
        }
        root.left=reConstructBinaryTree(lpre,lin);
        root.right=reConstructBinaryTree(rpre,rin);
        return root;
    }

}
