import java.util.Scanner;

public class Homework15 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int month = scan.nextInt();

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("2020年" + month + "月は、31日までです。");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("2020年" + month + "月は、30日までです。");
        break;
      case 2:
        System.out.println("2020年" + month + "月は、29日までです。");
        break;
      default:
        System.out.println("対応していない数値です。");
        break;
    }
    scan.close();
  }
}