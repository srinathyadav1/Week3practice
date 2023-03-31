import java.util.*;
public class Reverse {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   int [] arr=new int[7];
    System.out.println("Enter Numbers");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt(); 
    }
   /* int [] arr1=new int[7];
    arr1[0]=arr[6];
    arr1[1]=arr[5];
    arr1[2]=arr[4];
    arr1[3]=arr[3];
    arr1[4]=arr[2];
    arr1[5]=arr[1];
    arr1[6]=arr[0];
    for(int i=0;i<arr1.length;i++){
      System.out.println(arr1[i]);
    }
    */System.out.println("Reverse of array");
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
  }
}