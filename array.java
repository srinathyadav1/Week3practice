import java.util.Scanner;
public class array{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int [] arr=new int[5];
    for(int j=0;j<arr.length;j++){
    System.out.println("Enter number "+(j+1));
      arr[j]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    
  }
}