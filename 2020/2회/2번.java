//다음 Java 언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
class Parent {
  void show() { System.out.println("parent"); }
}
class Child extends Parent {
  void show() { System.out.println("child"); }
}
public class Test {
  public static void main(String[] args) {
    Parent pa = (   ) Child();
    pa.show();
  }
}

//답
//new
