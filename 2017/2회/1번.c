//다음 C언어로 구현된 100을 넘지 않는 소수와 개수를 구하는 프로그램에서 괄호 (1)에 해당하는 가장 적합한 변수나 조건식을 C언어 코드 형식으로 쓰시오.
#include <stdio.h>
int isprime(int number) {
  int i;
  for (i = 2; i < number; i++) {
    if ( (  1  ) )
        return 0;
  }
  return 1;
}

int main() {
  int number = 100, cnt = 0, i;
  for (i = 2; i < number; i++) {
    cnt = cnt + isprime(i);
  }
  printf("%d를 넘지 않는 소수는 %개입니다.\n", number, cnt);
  return 0;
}

//답
number % i == 0
