//다음 Java로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
public class Test {
  public static void main(String[] args) {
    int w = 3, x = 4, y = 3, z = 5;
    if ((w == 2 | w == y) & !(y > z) & (1 -- x ^ y != z)) {
      w = x + y;
      if (7 == x ^ y != w) {
        System.out.println(w);
      }
      else {
        System.out.println(x);
      }
    }
    else {
      w = x + y;
      if (7 == y ^ z != w) {
        System.out.println(w);
      }
      else {
        System.out.println(z);
      }
    }
  }
}

//답
//7

//(w == 2 | w == y) : w가 2이거나 y와 같을 때 참, w = 3, y = 3이므로 참.
//!(y > z) : y가 z보다 크지 않을 때 참. 현재 y = 3, z = 5이므로 참.
//(1 -- x ^ y != z) : 1 -- x는 0 ^ 4와 같음. 0 ^ 4는 4임. y != z를 만족하므로 참.
//if문 만족 -> w = x + y = 7
//(7 == x ^ y != w) : 7 == x는 거짓, y != w는 참 이므로 System.out.println(w);가 실행되어 결과는 7이 나온다.
