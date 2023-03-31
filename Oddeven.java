//odd even
import java.util.*;
public class Oddeven{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter values");
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
    int a=0;
    int b=0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]%2==0){
      a++;
    }
    else{
      b++;
    }
  }
    System.out.println("No of odd numbers are "+b);
    System.out.println("No of even numbers are "+a);
  }
}