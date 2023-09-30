//다음 Java 언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.
public class Main {
    public static void main(String[] args) {
        
        int[]a = {3, 4, 10, 2, 5};
        int temp;
        
        for (int i = 0; i <= 3; i++) {
            for (int j = i+1; j <=4; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
