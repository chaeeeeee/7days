//다음은 c언어의 코드이다. 
//보기의 조건에 맞추어 알맞은 출력값을 작성하시오.
//입력값은 홍길동, 김철수, 박영희 순서로 주어진다.
#include <stdio.h>
#include <stdlib.h>
char n[30];
char *test() {
  printf(입력하세요 : );
  gets(n);
  return n;
}
int main() {
  char * test1;
  char * test2;
  char * test3;
  test1 = test();
  test2 = test();
  test3 = test();
  printf("%s\n", test1);
  printf("%s\n", test2);
  printf("%s", test3);
}

//답
//박영희
//박영희
//박영희
