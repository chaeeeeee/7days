//다음 JAVA로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  static int[] mkarr() {
    int[] tmpArr = new int[4];
    for (int i = 0; i < tmpArr.length; i++) {
      tmpArr[i] = i;
    }
    return tmpArr;
  }
  public static void main(String[] args) {
    int[] arr;
    arr = mkarr();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

//답
//0123
