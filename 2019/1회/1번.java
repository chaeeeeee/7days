//다음 Java 언어로 구현한 프로그램을 분석하여 그 실행 결과를 쓰시오.
class SuperObject {
	public void print() {
    draw();
  }
  public void draw() {
    draw();
    System.out.println("Super Object");
  }
}
class SubObject extends SuperObject {
	public void paint() {
    super.draw();
  }
  public void draw() {
    System.out.println("Sub Object");
  }
}
public class Main {
	public static void main(String[] args) {
    SuperObject a = new SubObject();
    a.paint();
  }
}

//답
//Sub Object
//Super Object
