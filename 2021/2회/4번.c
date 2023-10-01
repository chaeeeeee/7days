//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
int main() {
  int ary[3];
  int s = 0;
  *(ary + 0) = 1;
  arr[1] = *(ary + 0) + 2;
  arr[2] = *ary + 3;
  for (int i = 0; i < 3; i++) {
    s = s + ary[i];
  }
  printf("%d", s);
}

//답
//8
