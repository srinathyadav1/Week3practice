import java.util.*;
public class Arraymin {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   int [] arr=new int[7];
    System.out.println("Enter Numbers");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt(); 
    }
    int min=arr[1];
    for(int i=0;i<7;i++){
      if(min>arr[i]){
        min=arr[i];
      }
    }
    System.out.println(min);
  }
}