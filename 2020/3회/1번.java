//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  public static void main(String[] args) {
    int i = 0, c = 0;
    while (i < 10) {
      i++;
      c *= i;
    }
    System.out.println(c);
  }
}

//답
//0
