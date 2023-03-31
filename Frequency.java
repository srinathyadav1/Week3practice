import java.util.*;

public class Frequency {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter the size of array");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter values of array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int[] visted = new int[s];

    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          visted[j] = -1;
        }
      }
      if (visted[i] != -1) {
        visted[i] = count;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (visted[i] != -1) {
        System.out.println(arr[i] + " Frequency is " + visted[i]);
      }
    }

  }
}