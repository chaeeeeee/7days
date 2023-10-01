//다음 C언어로 구현된 프로그램을 분석하여 5를 입력했을 때 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
int func(int a) {
  if (a <= 1) return 1;
  return a * func(a - 1);
}
int main() {
  int a;
  scanf("%d", &a);
  printf("%d", func(a));
}

//답
//120
