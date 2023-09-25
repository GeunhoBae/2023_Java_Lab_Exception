import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, m;
    while(true) {
      System.out.print("곱하고자 하는 두 수 입력 >>");
      try {
        n = scanner.nextInt();
        m = scanner.nextInt();
        break;
      }
      catch (InputMismatchException e) {
        System.out.println("정수값을 입력하세요");
        scanner.nextLine();
        continue; //continue 없어도 똑같다.
      }
    }
    System.out.println(n + "x" + m + "=" + n*m);
    scanner.close(); //원래 스캐너 쓰면 마지막에 이거 해줘야함
  }
}