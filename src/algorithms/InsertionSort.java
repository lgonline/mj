package algorithms;

/**
 * Created by liugang5 on 2016/2/3.
 */

/*
 《插入排序 》，对少量元素进行排序的有效算法。
 伪代码如下：
 * for j<- 2 to length[A]
 *  do key <- A[j]
 *      >Insert A[j] into the sorted sequence A[1..j-1] （>符号代表后面的部分是注释）
 *      i <- j-1
 *      while i>0 and A[i]>key
 *          do A[i+1] <- A[i]
 *          i <- i-1
 *      A[i+1] <- key
 * 算法复杂度：n^2
 */
public class InsertionSort {
    public static int[] input = new int[]{2,1,5,4,9,8,6,7,10,3};

    public static void main(String[] args) {
        //从数组第二个元素开始排序，因为第一个元素本身肯定是已经排好序的
        for (int j = 1; j < input.length; j++) {
            int key = input[j];
            int i = j - 1;
            //依次跟之前的元素进行比较，如果发现比前面的原素小，则交换位置，最终完成排序。
            while (i >= 0 && input[i] > key) {
                input[i+1] = input[i];
                input[i] = key;
                i--;
                //System.out.println("");
            }
            printArray();
        }
    }
    private static void printArray(){
        for(int i : input){
            System.out.print(i+"");
        }
    }
}
