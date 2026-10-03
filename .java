import java.util.*;

public class Main {
  public static void main(String args[]) {
    int n = 4; // Number of rows
    int m = 5; // Number of columns

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= m; j++){
        // Print star if it's on the border (first row, last row, first col, last col)
        if(i == 1 || i == n || j == 1 || j == m) {
          System.out.print("* ");
        } else {
          System.out.print("  "); // Print spaces for the inside
        }
      }
      System.out.println();
    }
  }
}
