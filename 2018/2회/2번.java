//다음 Java 언어의 <출력>과 <코드>를 보고 괄호 (1), (2)에 가장 적합한 답을 쓰시오.
//<출력>
//0 1 2 3 4
//1 2 3 4 5
//2 3 4 5 6
public class Main {
	public static void main(String[] args) {
    	int[][] a = new int[( ① )][( ② )];
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < 5; j++) {
            a[i][j] = i + j;
            System.out.printf("%d", a[i][j]);
          }
          System.out.println();
        }
    }
}

//답
//1: 3
//2: 5
