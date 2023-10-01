//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
main() {
  int res = mp(2, 10);
  printf("%d", res);
}
int mp(int base, int exp) {
  int res = 1;
  for (int i = 0; i < exp; i++) {
    res *= base;
  }
  return res;
}

//답
//1024
