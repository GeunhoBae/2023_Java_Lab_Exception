import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수: ");
    int n;
    while(true) {
      try{
      n = scanner.nextInt();
      //break; 여기다 넣어도됨
      }
      catch(InputMismatchException e) {
        System.out.println("정수값 입력");
        scanner.next();
        continue;
      }
      break;
    }
    for(int i=n; i>0; i--) {
      for(int j=0; j<i; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}