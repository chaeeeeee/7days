//다음은 정수를 역순으로 출력하는 C언어 프로그램이다. 예를 들어 1234의 역순은 4321이다.
//단, 1230처럼 0으로 끝나는 정수는 고려하지 않는다.
//프로그램을 분석하여 괄호(1~3)에 들어갈 알맞은 연산자를 쓰시오.

#include <stdio.h>
int main() {
  int number = 1234;
  int div = 0, result = 0;
  while(number (  1  ) 0) {
    result = result * div;
    result = result + number (  2  ) div;
    number = number (  3  ) div;
  }
  printf("%d", result);
}

//답
//1: != 
//2: %
//3: /
