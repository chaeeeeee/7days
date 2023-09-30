//다음 C언어로 구현된 프로그램에서 괄호 (1)에 해당하는 가장 적합한 변수나 조건식을 C언어 코드 형식으로 쓰시오.
#include <stdio.h>
main() {
    int num[10];
    int min = 9999;
    int i;
    for (i = 0; i < 10; i++) {
        scanf("%d", &num[i]);
    }
    for (i = 0; i < 10; i++) {
        if (min > ((1))) {
            min = num[i];
        }
    }
    print("가장 작은 값은 %이다.", min);
}

//답
//num[i]
