//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
main() {
  struct insa {
    char name[10];
    int age;
  }
  a[] = {"Kim", 28, "Lee", 38, "Park", 42, "Choi", 31};
  struct insa* p;
  p = a;
  p++;
  printf("%s\n", p->name);
  printf("%d\n", p->age);
}

//답
//Lee
//38
