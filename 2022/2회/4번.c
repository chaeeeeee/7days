//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
int len(char* p);
int main() {
  char* p1 = "2022";
  char* p2 = "202207"
  int a = len(p1); 
  int b = len(p2);
  printf("%d", a + b);
}
int len(char* p) {
  int r = 0;
  while (*p != '\0') {
    p++;
    r++;
  }
  return r;
}

//답
//10
