//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
class A {
  int a;
  int b;
}
public class Main {
  static void func1(A m) {
    m.a *= 10;
  }
  static void func2(A m) {
    m.a += m.b;
  }
  public static void main(String[] args) {
    A m = new A();
    m.a = 100;
    func1(m); 
    m.b = m.a;
    func2(m); 
    System.out.printf("%d", m.a);
  }
}

//답
//2000
