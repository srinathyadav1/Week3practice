import java.util.Scanner;
public class Strong {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int a=n;
    int sum=0;
    int b=0;
    int c=1;
    while(a!=0){
      b=a%10;
      System.out.println(b);
       for (int i = 1; i < b; i++) {
                c=c*i;
            }
      sum=sum+c;
      a=a/10 ;
    }
    if(sum==n){
      System.out.println("Given num is strong number"+n+sum);
    }
    else{
      System.out.println("Given num is not strong number"+n+sum+b);
    }
    }
}