//다음 Java로 구현된 프로그램을 분석하여 괄호에 들어갈 알맞은 답을 쓰시오.
class Car implements Runnable {
  int a;
  public void run() {
    try {
      while (++a < 1000) {
        System.out.println("mile travled: " + a);
        Thread.sleep(100);
      }
    } catch(Exception E) {  }
  }
}
public class Test {
  public static void main(String[] args) {
    Thread t1 = new Thread(new (     )());
    t1.start();
  }
}

//답
//Car
