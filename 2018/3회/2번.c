//다음은 6면 주사위를 100번 굴려서 나온 각 면의 수를 배열에 저장하여 출력하는 알고리즘을 C언어로 구현한 <코드>이다. 
//프로그램을 분석하여 괄호 ( 1 ), ( 2 )에 가장 적합한 답을 쓰시오.
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
main(){
	int hist[6] = { 0, };
  	int n, i = 0;
  	srand(time(NULL));
  	do {
    		i++;
    		n = rand() % 6 + 1;
    		hist[ (  1  ) ] += 1;
  	} while (i < 100);
  	for (i = 0; i < 6; i++)
  	printf("[%d] = %d\n", i+1, (  2  ));
}

//답
//1: n-1
//2: hist[i]
