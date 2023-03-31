import java.util.*;
public class Sorting {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   int [] arr=new int[7];
    System.out.println("Enter Numbers");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt(); 
    }
    int t=0;
    for(int i=0;i<arr.length;i++){  //arr[0]
      for(int j=i+1;j<arr.length;j++){  //arr[1]
        if(arr[i]>arr[j]){            //arr[0]>arr[1]
          t=arr[i];                  //t=arr[0]
          arr[i]=arr[j];            //arr[0]=arr[1]
          arr[j]=t;                 //arr[1]=t  
        }
      }
    }
    System.out.println("Ascending order of array");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    for(int i=0;i<arr.length;i++){  //arr[0]
      for(int j=i+1;j<arr.length;j++){  //arr[1]
        if(arr[i]<arr[j]){            //arr[0]<arr[1]
          t=arr[i];                  //t=arr[0]
          arr[i]=arr[j];            //arr[0]=arr[1]
          arr[j]=t;                 //arr[1]=t  
        }
      }
    }
    System.out.println("Descending order of array");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}