import java.util.*;
public class Occurance {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   int [] arr=new int[7];
    System.out.println("Enter Numbers");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt(); 
    }
    System.out.println("Enter the value of array");
    int n=sc.nextInt();
    int c=0;
    for(int i=0;i<arr.length;i++){
      if(n==arr[i]){
        c++;
      }
    }
    System.out.println("Occurance : "+c);
  }
}