//다음은 JAVA 코드 문제이다. 
//가지고 있는 돈이 총 4620원일 경우 
//1000원, 500원, 100원, 10원의 지폐 및 동전을 이용하여 
//보기의 조건에 맞춰 최소한의 코드를 통해 괄호안을 작성하시오.
//<보기>
//아래 주어진 항목들을 갖고 괄호안의 코드를 작성
//변수 : m
//연산자 : / , %
//괄호 : [ , ] , ( , )
//정수 : 1000, 500, 100, 10

public class Problem {
  public static void main(String[] args) {
     m = 4620;
     a = (              );
     b = (              );
     c = (              );
     d = (              ); 
     System.out.println(a); //천원짜리     4장 출력
     System.out.println(b); //오백원짜리  1개 출력
     System.out.println(c); //백원짜리     1개 출력
     System.out.println(d); //십원짜리     2개 출력
    }
}

//답
// m / 1000
// (m % 1000) / 500
// (m % 500) / 100
// (m % 100) / 10
