//다음 C 언어로 구현한 프로그램을 분석하여 괄호 ( 1 ), ( 2 )에 가장 적합한 답을 쓰시오.
//예) 1234567을 입력받으면 결과는 1+2+3+4+5+6+7 = 28 출력

#include <stdio.h>
main() {
  int input, sum = 0;
  scanf("%d", &input);
  while (1) {
    if (( 1 ) == 0) // 답안 1
      break;
    sum = sum + input % 10;
    input = input / ( 2 ); // 답안 2
  }
  printf("%d\n", sum);
}

//답
//1: input
//2: 10
