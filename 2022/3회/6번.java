//다음 JAVA로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  public static void main(String[] args) {
    int r = 0;
    for (int i = 1; i < 999; i++) {
      if (i % 3 == 0 && i % 2 == 0) {
        r = i;
      }
    }
    System.out.print(r);
  }
}

//답
//996
