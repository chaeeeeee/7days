//다음 C 언어의 <출력>과 <코드>를 보고 괄호 (1)에 가장 적합한 답을 쓰시오.
//<출력>
//1의 약수 : 1
//2의 약수 : 1 2
//3의 약수 : 1 3
//4의 약수 : 1 2 4
//5의 약수 : 1 5
#include <stdio.h>
main() {
	int i, j;
    for (i = 1; i <= 5; i++) {
    	printf("%d의 약수 : ", i);
        for (j = 1; j <= 5; j++) {
        	if ( (  1  ) )
            printf("%d", j);
        }
        printf("\n");
    }
    return 0;
}

//답
//1: i % j == 0
