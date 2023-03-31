//Max and min 
import java.util.Scanner;
public class Secondmax{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  int n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter values");
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  int max=0;
  int smax=0;
  for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
      smax=max;
      max=arr[i];
    }
    else if(smax<arr[i]){
    
      smax=arr[i];
    }
  }
  System.out.println("Max num is "+max);
    System.out.println("Second max num is "+smax);
 /* int min=arr[0];
  int smin=arr[0];
  for(int i=1;i<arr.length;i++){
    if(min>arr[i]){
      smin=min;
      min=arr[i];
    }
    else if(smin>arr[i]){
      smin=arr[i];
    }
  }
  System.out.println("Min num is "+min);
  System.out.println("Second min num is "+smin);*/
  int t=0;
  for(int i=0;i<arr.length;i++){  //arr[0]
      for(int j=i+1;j<arr.length;j++){  //arr[1]
        if(arr[i]>arr[j]){            //arr[0]<arr[1]
          t=arr[i];                  //t=arr[0]
          arr[i]=arr[j];            //arr[0]=arr[1]
          arr[j]=t;                 //arr[1]=t  
        }
      }
    }
  System.out.println("Min num is "+arr[0]);
  System.out.println("Second min num is "+arr[1]);
}
}