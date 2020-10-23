package com.xjhu.study.week1;

import java.util.Arrays;

/**
 * @author huxinjie
 * @date 2020/10/11 12:15
 */
public class Array {
    public static void main(String[] args){
        int[] array={1,3,67,34,23,89,56,34,21};//定义静态数组
        int max=array[0];//默认第一个最大
        int min=array[0];//默认第一个最小
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];//如果有比max大的数就让max记录下大的数
            }
            if(array[i]<min)
            {
                min=array[i];//如果有比min小的数就让min记录下小的数
            }

        }
        System.out.println("max="+max);
        System.out.println("min="+min);
        System.out.println("最大值最小值和为：" + (max + min));
        //第一种对数组排序：用sort排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        for (int i : array){
//            System.out.print(i + ",");
//        }
        //冒泡排序对数组进行排序
        int temp;
        for (int i = 0;i < array.length;i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = array[j];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
