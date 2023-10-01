//다음은 C언어의 문제이다. 알맞은 출력값을 작성하시오.
int n[3] = [73, 95, 82] 
sum = 0 
for(i=0;i<3;i++){
  sum += n[i];
}
switch(sum/30){
  case 10:
  case 9: printf(“A”);
  case 8: printf(“B”);
  case 7: 
  case 6: printf(“C”);
  default: printf(“D”);
}

//답
//BCD
