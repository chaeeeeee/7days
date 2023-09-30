//다음은 피보나치 수열의 합계를 구하는 프로그램을 Java 언어로 구현한 것이다. 프로그램을 분석하여 그 실행 결과를 쓰시오.
public class Main {
	public static void main(String[] args) {
    int a, b, c, sum;
    a = b = 1;
    sum = a + b;
    for(int i = 3; i <=5; i++) {
      c = a + b;
      sum += c;
      a = b;
      b = c;
    }
    System.out.println(sum);
  }
}

//답
//12
