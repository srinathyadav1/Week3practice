//prime
import java.util.Scanner;
public class Prime{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter values");
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  for(int i=0;i<arr.length;i++){
    int c=0;
    int j=1;
    while(j<=(arr[i]/2)){
      if(arr[i]%j==0){
        c++;
      }
      j++;
      }
    if(c==1){
      System.out.println(arr[i]+"is prime number");
    }
  }
    }
  }
  

