//다음은 C언어 코드이다. 출력 결과를 쓰시오.
#include <stdio.h>
void main() {
  int i, j;
  int a[3][2] = { {1,2}, {3,4}, {5,6} };
  int sum = 0;
  for (i = 0; i < 3; i++) {
    for (j = 0; j < 2; j++) {
      sum += a[i][j];
    }
  }
  printf("%.2f", (float)sum/(3*2));
}

//답
//3.50
