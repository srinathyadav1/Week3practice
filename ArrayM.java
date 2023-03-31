import java.util.Scanner;
public class ArrayM{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int [] arr=new int[7];
    for(int i=0;i<arr.length;i++){
    System.out.println("Enter number "+(i+1));
      arr[i]=sc.nextInt();
    }
    int [] newarr=new int[3];
    for(int i=0;i<newarr.length;i++){
      newarr[i]=arr[i];
    }
    int [] newarr1=new int[3];
    for(int i=0;i<newarr1.length;i++){
      newarr1[i]=arr[i+4];
    }
    for(int i=0;i<newarr.length;i++){
      System.out.println(newarr[i]);
    }
    for(int i=0;i<newarr1.length;i++){
      System.out.println(newarr1[i]);
    }
    
  }
}