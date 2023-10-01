//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
class A {
  int a;
  public A(int a) { this.a = a; }
  void display() { System.out.println("a=" + a"); }
}
class B extends A {
  public B(int a) {
    super(a);
    super.display();
  }
}
public class Test {
  public static void main(String[] args){
    B obj = new B(10);
  }
}

//답
//a=10
