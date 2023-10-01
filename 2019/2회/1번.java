//다음 Java 언어로 구현한 프로그램을 분석하여 그 실행 결과를 쓰시오.
public class Main {
	public static void main(String[] args) {
    int numAry[] = new int[5];
    int result = 0;   
    for(int i = 0; i < 5; i++)
      numAry[i] = i+1;     
    for(int i:numAry)
      result += i; 
    System.out.printf("%d", result);
  }
}

//답
//15
