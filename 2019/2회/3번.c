//다음 C 언어로 구현한 프로그램을 분석하여 괄호 (   )에 가장 적합한 답을 쓰시오.
//<실행 결과>
//54321000
#include <stdio.h>
main() {
	char ch, str[] = "12345000";
  int i, j; 
  for (i = 0; i < 8; i++) {
    ch = str[i];
    if ( (  답작성란  ) )
      break;
  } 
  i--;
  for (j = 0; j < i; j++) {
    ch = str[j];
    str[j] = str[i];
    str[i] = ch;
    i--;
  } 
  printf("%s", str);
}

//답
//ch='0'
