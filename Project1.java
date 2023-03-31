import java.util.*;
public class Project1{
Scanner s=new Scanner(System.in);
public void insertfirst(int [] arr,int n) {
  System.out.println("Enter the element you want insert at first position");
  int e=s.nextInt();
  int[] arr1=new int[n+1];
  for(int i=1;i<n+1;i++){
    arr1[i]=arr[i-1];
  }
  arr1[0]=e;
  System.out.println("Inserting element at first position");
  for(int i=0;i<n+1;i++){
    System.out.println(arr1[i]);
  }
}
public void insertlast(int [] arr,int n){
 System.out.println("Enter the element you want insert at last position");
  int e=s.nextInt();
  int[] arr1=new int[n+1];
  for(int i=0;i<n;i++){
    arr1[i]=arr[i];
  }
  arr1[n]=e;
  System.out.println("Inserting element at last position");
  for(int i=0;i<n+1;i++){
    System.out.println(arr1[i]);
  }
}
public void insertspecific(int [] arr,int n){
  System.out.println("Enter the index position you want insert the element");
  int p=s.nextInt();
  System.out.println("Enter the element you want insert at "+p+" position");
  int e=s.nextInt();
  int [] arr1=new int [n+1];
  for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        arr1[p] = e;
        for (int i = p + 1; i < n + 1; i++) {
            arr1[i] = arr[i - 1];
        }
  System.out.println("Inserting the element you want insert at "+p+" position");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr1[i]);
        }
}
public void removefirst(int [] arr,int n){
  int[] arr1=new int[n];
  for(int i=0;i<arr.length;i++){
    arr1[i]=arr[i];
  }
  System.out.println("Removing first element");
  for(int i=1;i<arr.length;i++){
    System.out.println(arr1[i]);
  }
}
public void removelast(int [] arr,int n){
  int[] arr1=new int[n];
  for(int i=0;i<arr.length;i++){
    arr1[i]=arr[i];
  }
  System.out.println("Removing last element");
  for(int i=0;i<arr.length-1;i++){
    System.out.println(arr1[i]);
  }
}
public void removespecific(int [] arr,int n){
  System.out.println("Enter index position you want remove");
  int p=s.nextInt();
  int i=0;
  for(i=p;i<n-1;i++){
    arr[i]=arr[i+1];
  }
  System.out.println("Removing specific position element");
  for(i=0;i<arr.length-1;i++){
    System.out.println(arr[i]);
  }
}
public void firstoccurance(int [] arr,int n){
  System.out.print("Enter the search element : ");
  int search = s.nextInt();
  for (int i = 0; i < n; i++) {
  if (arr[i] == search) {
  arr[i] = 0;
  break;
}
}
  for (int i = 0; i < n - 1; i++) {
  if (arr[i] == 0) {
  arr[i] = arr[i + 1];
  arr[i + 1] = 0;
  }
}
  System.out.println("Removing first occurance of your search element");
  for (int i = 0; i < n - 1; i++) {
  System.out.println(arr[i]);
  }
}
public void lastoccurance(int [] arr,int n){
  System.out.print("Enter the search element : ");
        int search = s.nextInt();  //1
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == search) {
                arr[i] = 0;
                break;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i + 1];
                arr[i + 1] = 0;
            }
        }
 System.out.println("Removing last occurance of your search element");  
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }
}
public void specificoccurance(int [] arr,int n){
  System.out.print("Enter the search element : ");
        int search = s.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                arr[i] = 0;
                count++;
            }
        }
   System.out.println("Removing occurance of your search element");
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }

        }
}
public void options(int [] arr,int n){
        System.out.println("1. Insert an element at first position");
        System.out.println("2. Insert an element at last position");
        System.out.println("3. Insert an element at specific position");
        System.out.println("4. Remove an element at first position");
        System.out.println("5. Remove an element at last position");
        System.out.println("6. Remove an element at specific position");
        System.out.println("7. Remove first occurance of search element");
        System.out.println("8. Remove last occurance of search element");
        System.out.println("9. Remove specific occurance of search element");
        int option=0;
        System.out.println("Choose option");
        option=s.nextInt();
        switch(option) {
          case 1:{
            insertfirst(arr, n);
           break; 
          }
          case 2:{
            insertlast(arr, n);
           break; 
          }
          case 3:{
            insertspecific(arr, n);
           break; 
          }
          case 4:{
            removefirst(arr, n);
           break; 
          }
          case 5:{
            removelast(arr, n);
           break; 
          }
          case 6:{
            removespecific(arr, n);
           break; 
          }
          case 7:{
            firstoccurance(arr, n);
           break; 
          }
          case 8:{
            lastoccurance(arr, n);
           break; 
          }
          case 9:{
            specificoccurance(arr, n);
           break; 
          }
          default:{
            System.out.println("Invalid option");
          }
        }
}
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
  System.out.println("Enter the size of array");
int n=s.nextInt();
int [] arr= new int[n];
System.out.println("Enter values of array");
for(int i=0;i<arr.length;i++){
  arr[i]=s.nextInt();
}
Project1 obj=new Project1();
   obj.options(arr, n); 
}
}