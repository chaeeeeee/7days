//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  public static void main(String[] args) {
    int result[] = new int[5];
    int arr[] = { 77, 32, 10, 99, 50 };
    for (int i = 0; i < 5; i++) {
      result[i] = 1;
      for (int j = 0; j < 5; j++) {
        if (arr[i] < arr[j]) {
          result[i]++;
        }
      }
    }
    for (int k = 0; k < 5; k++) {
      System.out.println(result[k]);
    }
  }
}

//답
//2
//4
//5
//1
//3
