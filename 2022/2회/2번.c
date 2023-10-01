//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
struct A {
  int n;
  int g;
}
main() {
  struct A st[2];
  for (int i = 0; i < 2; i++) {
    st[i].n = i;
    st[i].g = i + 1;
  }
  printf("%d", st[0].n + st[1].g);
}

//답
//2
