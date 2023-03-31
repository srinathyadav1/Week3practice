import java.util.Scanner;
public class ArrayL{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int [] arr=new int[6];
    for(int i=0;i<arr.length;i++){
    System.out.println("Enter number "+(i+1));
      arr[i]=sc.nextInt();
    }
    int [] newarr=new int[5];
    for(int i=0;i<newarr.length;i++){
      newarr[i]=arr[i];
    }
    for(int i=0;i<newarr.length;i++){
      System.out.println(newarr[i]);
    }
    
  }
}