//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.
#include <stdio.h>
int power(int data, int exp) {
  int i, result = 1;
  for (i = 0; i < exp; i++) {
      result = result * data;
  }
  return result;
}
int main() {
  printf("%d\n", power(2, 10));
  return 0;
}


//답
//1024
