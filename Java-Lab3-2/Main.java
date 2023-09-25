import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] unit = {50000, 10000, 5000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
    System.out.print("금액 : ");
    int money = scanner.nextInt();
    for(int u: unit) {
      int res = money / u;
      if( res > 0) {
        System.out.println(u + "원 짜리 : " + res + "개");
        money = money % u;
      }
    }
  }
}