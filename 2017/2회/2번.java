//다음 Java 언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.
public class Main {
  public static void main(String[] args) {
    int a = 0, sum = 0;
    while (a < 10) {
      a++;
      if (a % 2 == 1) {
        continue;
      }
      sum += a;
    }
    System.out.println(sum);
  }
}

//답
//30
