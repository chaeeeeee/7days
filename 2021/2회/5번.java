//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class ovr1 {
  public static void main(String[] args) {
    ovr1 a1 = new ovr1();
    ovr2 a2 = new ovr2();
    System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
  }
  int sun(int x, int y) {
    return x + y;
  }
}
class ovr2 extends ovr1 {
  int sun(int x, int y) {
    return x - y + super.sun(x, y);
  }
}

//답
//11
