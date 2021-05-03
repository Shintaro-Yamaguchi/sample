public class Homework17 {
  public static void main (String[] args) {
    // ※17-1
    int i = 50;

    while (i <= 100) {
      System.out.println(i);
      i++;
    }
    
    // ※17-2
    int i_2 = 100;

    while (i_2 >= 50) {
      System.out.println(i_2);
      i_2--;
    }
    
    // ※17-3
    int i_3 = 50;
    int sum = 0;

    while (i_3 <= 100) {
      sum += i_3;
      i_3++;
      if (i_3 == 100) {
        System.out.println(sum);
      }
    }
    
  }
}