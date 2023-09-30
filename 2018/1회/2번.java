//다음 Java 언어의 <처리조건>과 <코드>를 보고 괄호 (1) ~ (2)에 적용될 수 있는 가장 적합한 답을 쓰시오.
//<처리 조건>
//배열에는 95, 75, 85, 100, 50 이 차례대로 저장된다.
//배열에 저장된 값을 오름차순으로 정렬하여 출력한다.
public class Main {
	public satic void main(String[] args) {
    	int E[] = {  (    1   )  };
      int i = 0;
      int Temp = 0;
      do {
        int j = i;
        do {
          if( E[i] > (   2   ) ) {
              Temp = E[i];
              E[i] = E[j];
              E[j] = Temp;
              }
              j++;
          }	
          while (j < 5);
            i++;
        }	
        while (j < 4);
        for (int a = 0; a < 5; a++) {
        	System.out.printf(E[a]+"\t");
        }
        System.out.println();
    }
}

//답
//1: 95, 75, 85, 100, 50
//2: E[j]
