//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
class Connection {
  private static Connection _inst = null;
  private int count = 0;
  public static Connection get() {
    if (_inst == null) {
      _inst = new Connection();
      return _inst;
    }
    return _inst;
  }
  public void count() { count++; }
  public int getCount() { return count; }
}
public class Test {
  public static void main(String[] args) {
    Connection conn1 = Connection.get();
    conn1.count();
    Connection conn2 = Connection.get();
    conn2.count();
    Connection conn3 = Connection.get();
    conn3.count();
    System.out.println(conn1.getCount());
  }
}

//답
//3
//count() 메서드는 인스턴스의 count 변수가 호출될 때마다 1 증가
//마지막 conn1.getCount()는 count의 현재 값을 출력
