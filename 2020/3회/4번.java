//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  public static void main(String[] args) {
    int a = 0, num = 0;
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
