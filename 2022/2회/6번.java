//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
class Test {
  public static void main(String[] args) {
    cond obj = new cond(3);
    obj.a = 5;
    int b = obj.func();
    System.out.print(obj.a + b);
  }
}
class cond {
  int a;
  public cond(int a) {
    this.a = a;
  }
  public int func() {
    int b = 1;
    for (int i = 1; i < a; i++) {
      b += a * i;
    }
    return a + b;
  }
}

//답
//61
