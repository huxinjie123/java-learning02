package com.xjhu.study.week1;

import java.util.Arrays;

/**
 * @author huxinjie
 * @date 2020/10/11 12:15
 */
public class Array {
    public static void main(String[] args){
        int[] array={1,3,67,34,23,89,56,34,21};//���徲̬����
        int max=array[0];//Ĭ�ϵ�һ�����
        int min=array[0];//Ĭ�ϵ�һ����С
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];//����б�max���������max��¼�´����
            }
            if(array[i]<min)
            {
                min=array[i];//����б�minС��������min��¼��С����
            }

        }
        System.out.println("max="+max);
        System.out.println("min="+min);
        System.out.println("���ֵ��Сֵ��Ϊ��" + (max + min));
        //��һ�ֶ�����������sort����
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        for (int i : array){
//            System.out.print(i + ",");
//        }
        //ð������������������
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
