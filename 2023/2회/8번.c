//다음 코드는 선택정렬 구현에 관한 문제이다. 
//빈칸에 알맞는 연산자를 보기에서 골라 작성하시오.
//<보기>
//<, <=, =>, >, ==, /, %
#include <stdio.h>
int main() {
    int E[] = {64, 25, 12, 22, 11};
    int n = sizeof(E) / sizeof(E[0]);
    int i = 0;
    do {
        int j = i + 1;
        do {
            if (E[i] (     ) E[j]) {
                int tmp = E[i];
                E[i] = E[j];
                E[j] = tmp;
            }
            j++;
        } while (j < n);
        i++;
    } while (i < n–1);
    for(int i=0; i<=4; i++)
        printf(“%d “, E[i]);
}

//답
//>
