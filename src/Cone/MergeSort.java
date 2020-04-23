package Cone;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {

        int[] data = {7,2,9,4,3,8,6,1};

        System.out.println("排序之前：" + Arrays.toString(data));//Arrays.toString(data)方法输出这个串数

        mergeSort(data);

        System.out.println("排序之后:" + Arrays.toString(data));
    }

    public static void mergeSort(int[] data) {

        //归并排序.声明
        sort(data, 0, data.length - 1);
    }

    //将索引从left到right范围的数组元素进行归并排序
    public static void sort(int[] data, int left, int right) {

        if (left < right) {//找到只剩一个数，才停止递归

            //找出中间索引
            int center = (left + right) / 2;
            //分
            sort(data, left, center);
            sort(data, center + 1, right);
            //合并
            merge(data, left, center, right);
        }                //实现递归的调用
    }

    // 将两个数组进行归并，归并前两个数组已经有序，归并后依然有序
    public static void merge(int[] data, int left, int center, int right) {

        int[] tempArr = new int[data.length];  //定义一个tempArr数组长度为输入的数字个数
        int mid = center + 1;
        int third = left;
        int temp = left;
        while (left <= center && mid <= right) {
            if (data[left] - data[mid] <= 0) {
                tempArr[third++] = data[left++];
            }else {
                tempArr[third++] = data[mid++];
            }
        }

        while (mid <= right) {
            tempArr[third++] = data[mid++];
        }

        while (left <= center) {
            tempArr[third++] = data[left++];
        }

        while (temp <= right) {
            data[temp] = tempArr[temp++];
        }
    }
}


