//아래 자바 코드에서 출력되는 값을 작성하시오.
class Static {
  public int a = 20;
  static int b = 0;
}
public class Main {
  public static void main(String[] args) {
    int a;
    a = 10;
    Static.b = a;
    Static st = new Static();
    
    System.out.println(Static.b++);
    System.out.println(st.b);
    System.out.println(a);
    System.out.print(st.a);
    }
}

//답
//10 -> Static.b의 값은 10인데 Static.b++은 출력된 후 1 증가여서 10 출력
//11 -> st.b는 Static.b를 참조함. 따라서 11
//10
//20
