public class Homework16 {
  public static void main (String[] args) {
    // ※16-1
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
    
    // ※16-2
    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }
    
    // ※16-3
    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      sum += i;
      if (i == 10) {
        System.out.println(sum);
      }
    }
  }
}