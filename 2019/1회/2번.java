//다음 Java 언어로 구현한 프로그램을 분석하여 그 실행 결과를 쓰시오.
public class Main {    
  public static void main(String[] args) {
    int i, sum = 0;
    for (i = 1; i <= 110; i++) {
      if(i%4 == 0)
        sum = sum + 1;
    }
    System.out.printf("%d", sum);
  }
}

//답
//27
