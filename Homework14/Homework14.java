import java.util.Scanner;

public class Homework14 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("1つ目の点数を入力してください。");
    int exam_score1 = scan.nextInt();;
    System.out.println("2つ目の点数を入力してください。");
    int exam_score2 = scan.nextInt();;
    int total_score = exam_score1 + exam_score2;

    if (exam_score1 >= 75 && exam_score2 >= 75) {
      System.out.println("合格");
    } else if (total_score >= 140) {
      System.out.println("合格");
    } else if (total_score >= 100 && exam_score1 >= 90 || total_score >= 100 && exam_score2 >= 90) {
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }
    scan.close();
  }
}