//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
main() {
  char* p = "KOREA";
  printf("%s\n", p);
  printf("%s\n", p + 3);
  printf("%c\n", *p);
  printf("%c\n", *(p + 3));
  printf("%c\n", *p + 2);
}

//답
//KOREA
//EA
//K
//E
//M
