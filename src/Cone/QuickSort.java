package Cone;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] data = {7, 2, 9, 4, 3, 8, 6, 1};

        System.out.println("排序之前：" + Arrays.toString(data));//Arrays.toString(data)方法输出这个串数

        QuickSort(data);

        System.out.println("排序之后:" + Arrays.toString(data));
    }

    public static void QuickSort(int[] data) {
        sort(data, 0, data.length-1 );
    }

    public static void sort(int[] data, int left, int right) {
        if(left<right){
        int q = Partition(data, left, right);
        sort(data, left, q);
        sort(data, q + 1, right);}
    }
    public static int Partition(int[] data, int p, int r) {
        int i = p, j = r + 1;
        int x = data[p];
        while (true) {
            while (data[++i] < x) {

            }
            while (data[--j] > x) {
            }
            if (i < j) {
                swap(data,i, j);
            } else {
                break;
            }
        }
        data[p] = data[j];
        data[j] = x;
        return j;
    }
    public static void swap(int[]data,int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
