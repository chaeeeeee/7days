//다음 Java로 구현된 프로그램을 분석하여 괄호에 들어갈 알맞은 예약어를 쓰시오.
public class Test {
  public static void main(String[] args) {
    System.out.print(Test.check(1));
  }
  (    ) String check(int num) {
    return (num >= 0) ? "positive" : "negative" ;
  }
}

//답
//static
//static은 클래스 이름으로 메소드에 접근하기 위해 사용하는 예약어이다.
//메소드를 사용하기 위해서는 메소드가 포함된 클래스의 객체 변수를 선언한 후 [객체변수].[메소드] 방식으로 접근해야 하지만
//static을 이용하면 객체변수 없이 [클래스이름].[메소드]의 방식으로 접근 가능하기 때문.
