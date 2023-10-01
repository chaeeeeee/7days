//다음 Java 언어로 구현한 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Main {
  static int[] arr() {
    int a[] = new int[4];
    int b = a.length;
    for (int i = 0; i < b; i++) {
      a[i] = i;
    }
    return a;
  }
  public static void main(String[] args) {
    int a[] = arr();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

//답
//0 1 2 3
