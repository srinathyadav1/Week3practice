// Mid
import java.util.*;
public class Mid{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter values");
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
    System.out.println("Mid values are");
if(n%2==0){
  int a=(n/2);
  int b=(n/2)-1;
  System.out.println(arr[b]);
  System.out.println(arr[a]);
}
    else{
     int a=(n/2);
      System.out.println(arr[a]);
    }
  }
}