//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
void main() {
  int s, el = 0;
  for (int i = 6; i <= 30; i++) {
    s = 0;
    for (int j = 1; j <= i / 2; j++) {
      if (i % j == 0)
          s = s + j;
    }
    if (s == i) 
      el++;
    }
  }
  printf("%d", el);
}

//답
//2

//6과 28에서 증가함
//6 : 1+2+3 = 6
//28: 1+2+4+7+14 = 28
