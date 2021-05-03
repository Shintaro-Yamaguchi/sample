public class Homework12 {
  public static void main (String[] args) {
    // ※12-1
    int num1 = 12;
    int num2 = 2;

    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);

    // ※12-2
    String[] last_name = {"佐藤", "田中", "鈴木", "山田"};
    String[] first_name = {"太郎", "花子", "次郎", "三郎"};

    for (int i = 0; i < 4; i++) {
      System.out.println(last_name[i] + "　" + first_name[i]);
    }

  }
}