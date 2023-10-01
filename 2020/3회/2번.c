//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
int r1(){
  return 4;
}
int r10(){
  return (30 + r1());
}
int r100(){
  return (200 + r10());
}
int main(){
  printf("%d\n", r100());
  return 0;
}

//답
//234
