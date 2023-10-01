//다음 Java 언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
class Parent {
  int compute(int num) {
    if (num <= 1) return num;
    return compute(num - 1) * compute(num - 2);
  }
}
class Child extends Parent {
  int compute(int num) {
    if (num <= 1) return num;
    return compute(num - 1) + compute(num - 3);
  }
}
public class Test {
  public static void main(String[] args) {
    Parent obj = new Child();
    System.out.print(obj.compute(4));
  }
}

//답
//1
//main 함수에서 Child 클래스의 compute 메서드가 호출됨.
//compute(4) = compute(3) + compute(1) = 0 + 1 = 1
//compute(3) = compute(2) + compute(0) = 0 + 0 = 0   
//compute(2) = compute(1) + compute(-1) = 1 + (-1) = 0
