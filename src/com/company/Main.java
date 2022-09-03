
package com.company;
import java.util.Scanner;
public class Main {
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=arr[start];
           start++;
           end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);}


    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
      reverse(arr);

}}
