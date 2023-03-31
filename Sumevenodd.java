import java.util.*;
public class Sumevenodd{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter values");
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
    int esum=0;
    int osum=0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]%2==0){
      esum=esum+arr[i];
    }
    else{
      osum=osum+arr[i];
    }
  }
    System.out.println("sum of even numbers are "+esum);
    System.out.println("sum of odd numbers are "+osum);
  }
}