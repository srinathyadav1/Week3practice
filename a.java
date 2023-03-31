import java.util.Scanner;
  public class a {
  public static void Find(int arr[], int z) {
  int sum = 0;
 int x=0;
int y=0;
 boolean t = false;
for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
if (arr[i] + arr[j] == z) {
x=i;
y=j;
}
}
}
System.out.println("Element adding is "+x);
System.out.println("Element adding is "+y);
}
  public static void main(String[] args) {
Scanner S = new Scanner(System.in);
System.out.println("Enter the number of elements");
int n = S.nextInt();
 System.out.println("Enter the target element");
int z = S.nextInt();
int[] arr = new int[n];
 System.out.println("enter the elements of array");
for (int i = 0; i < n; i++) {
arr[i] = S.nextInt();
}
a.Find(arr, z);
  }
}