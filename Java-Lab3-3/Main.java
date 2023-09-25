class Main {
  public static void main(String[] args) {
    int sum =0;
    for(String arg : args) {
      try {
        int n = Integer.parseInt(arg);
        sum += n;
      }
      catch(NumberFormatException e) {}//오류가 나는 부분은 무시하고 진행해라
    }
    System.out.println("합:"+sum);
  }
}