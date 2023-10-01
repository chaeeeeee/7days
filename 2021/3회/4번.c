//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
#include <stdio.h>
int main() {
  int* array[3];
  int a = 12, b = 24, c = 36;
  array[0] = &a;
  array[1] = &b;
  array[2] = &c;
  printf("%d", *array[1] + **array + 1);
}

//답
//37

//*array[1] : array[1]은 b의 주소를 가리키므로 *array[1]은 b의 값을 가져온다. 따라서 24
//**array : array[0]은 a의 주소를 가리키므로 **array[0]은 a의 값을 가져온다. 따라서 12
//최종적으로 24 + 12 + 1  = 37
