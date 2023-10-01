//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오._)
public class Test {
  public static void main(String[] args) {
    int j, i;
    for (j = 0, i = 0; i <= 5; i++) {
      j += i;
      System.out.print(i);
      if (i == 5) {
        System.out.print("=");
        System.out.print(j);
      }
      else {
        System.out.print("+");
      }
    }
  }
}

//답
//0+1+2+3+4+5=15
