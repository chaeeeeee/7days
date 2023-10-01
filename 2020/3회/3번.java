//다음 Java 언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
abstract class Vehicle {
  String name;
  abstract public String getName(String val);
  public String getName() {
    return "Vehicle name : " + name;
  }
}
class Car extends Vehicle {
  private String name;
  public Car(String val){  //생성자
    name = super.name = val;
  }
  public String getName(String val){
    return "Car name : " + val;
  }
  public String getName(byte[] val){
    return "Car name : " + val;
  }
}
public class Test{
  public static void main(String[] args){
    Vehicle obj = new Car("Spark");
    System.out.print(obj.getName());
  }
}

//답
//Vehicle name : Spark
//Car 클래스의 생성자에서 super.name에 Spark를 할당 -> name = Spark
//obj.getName()을 호출하면 Vehicle 클래스의 getName()이 호출됨
