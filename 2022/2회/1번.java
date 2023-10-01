//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  public static void main(String[] args) {
    int i = 3, k = 1;
    switch(i) {
      case 1: k++;
      case 2: k -= 3;
      case 3: k = 0;
      case 4: k += 3;
      case 5: k -= 10;
      dafault: k--;
    }
    System.out.print(k);
  }
}

//답
//-8
