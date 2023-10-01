//다음 JAVA 코드에서 알맞는 출력 값을 작성하시오.
abstact class Vehicle {
  String name;
  abstract public String getName(String val);
  public String getName() {
    return "Vehicle name: " + name;
  }
}
class Car extends Vehicle {
  public Car(String val) {
    name=super.name=val;
  }
  public String getName(String val) {
    return "Car name:" + val;
  }
  public String getName(byte val[]) {
    return "Car name:" + val;
  }
}
public class Main {
  public static void main(String[] args) {
    Vehicle obj = new Car("Spark");
    System.out.println(obj.getName());
  }
}

//답
//Vehicle name: Spark
