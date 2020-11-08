public class test63 {
    //给出两个有序的整数数组A和B，请将数组b合并到数组A中，变成一个有序的数组
//注意：
//可以假设a数组有足够的空间存放b数组的元素，a和b中初始的元素数目分别为m和n
    //从大到小，从后到前，不能new新的，不然空的A无法复制过来
    public static void main(String[] arg) {

    }

    public static void merge(int A[], int m, int B[], int n) {


        int i = m - 1;
        int j = n - 1;
        int x = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[x--]=A[i--];
            }else{
                A[x--]=B[j--];
            }
        }
        while(i>=0){
            A[x--]=A[i--];
        }
        while(j>=0){
            A[x--]=B[j--];
        }
    }
}