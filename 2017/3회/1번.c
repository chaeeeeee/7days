//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.
#include <stdio.h>
int res10() {
  return 4;
}
int res30() {
  return 30 + res10();
}
int res200() {
  return 200 + res30();
}
int main() {
  int result;
  result = res200();
  printf("%d\n", result);
}

//답
//234
