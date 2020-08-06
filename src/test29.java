public class test29 {
//    我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
//
//    比如n=3时，2*3的矩形块有3种覆盖方法：
//    public int RectCover(int target) {
//        return 0;
//    }
//    1.target=0
//
//0
//
//2.target=1
//
//1
//
//3.target=2
//
//2
//
//4.target>2
//
//1.2*1竖着放，剩余的有f(target-1)种方法
//
//2.2*1横着放,下面剩余的一块固定，剩下的有f(target-2）种方法
//
//f(target)=f(target-1)+f(target-2)

    public static void main(String []arg){
        int target=3;
        int count=RectCover(target);
        System.out.println(count);
    }

    public static int RectCover(int target) {
        if(target<=1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }
    }
}
