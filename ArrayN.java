import java.util.Scanner;
public class ArrayN
{
public void removeFirstElement(int[] arr1,int pos)
  {
int j=0;
int[] newArr=new int[4];
for( j=0;j<newArr.length-1;j++){
if(j>=pos){     //(pos-1)
newArr[j]=arr1[j+1];
}
else{
newArr[j]=arr1[j];
}
}
newArr[j]=arr1[j+1];
System.out.println("Array after removing element");
for(int i=0;i<newArr.length;i++){
System.out.println(newArr[i]);
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int j=0;j<arr.length;j++){
System.out.println("Enter number "+ (j+1));
arr[j]=sc.nextInt();
}
System.out.println("Enter index postion to remove element");
int pos=sc.nextInt();
ArrayN obj=new ArrayN();
obj.removeFirstElement(arr,pos);
}
}