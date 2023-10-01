//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력 서식을 준수하시오.)
#include <stdio.h>
main() {
  int c = 1;
  switch(3) {
  case 1: c += 3;
  case 2: c++;
  case 3: c = 0;
  case 4: c += 3;
  case 5: c-= 10;
  dafault: c--;
  }
  printf("%d", c);
}

//답
//-8
//case문에 break가 없으므로, switch(3)은 case 3 부터 쭉~ dafult까지 수행하라는 의미여서 0 + 3 - 10 - 1 = -8
