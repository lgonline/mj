package algorithms;

/**
 * Created by liugang5 on 2016/2/3.
 */

/*
 ���������� ����������Ԫ�ؽ����������Ч�㷨��
 α�������£�
 * for j<- 2 to length[A]
 *  do key <- A[j]
 *      >Insert A[j] into the sorted sequence A[1..j-1] ��>���Ŵ������Ĳ�����ע�ͣ�
 *      i <- j-1
 *      while i>0 and A[i]>key
 *          do A[i+1] <- A[i]
 *          i <- i-1
 *      A[i+1] <- key
 * �㷨���Ӷȣ�n^2
 */
public class InsertionSort {
    public static int[] input = new int[]{2,1,5,4,9,8,6,7,10,3};

    public static void main(String[] args) {
        //������ڶ���Ԫ�ؿ�ʼ������Ϊ��һ��Ԫ�ر���϶����Ѿ��ź����
        for (int j = 1; j < input.length; j++) {
            int key = input[j];
            int i = j - 1;
            //���θ�֮ǰ��Ԫ�ؽ��бȽϣ�������ֱ�ǰ���ԭ��С���򽻻�λ�ã������������
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
