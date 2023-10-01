//다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
int isPrime(int number) {
  for (int i = 2; i < number; i++) {
    if (number % i == 0) 
      return 0;
  }
  return 1;
}
int main() {
  int number = 13195;
  int max_div = 0;
  for (int i = 2; i < number; i++) {
    if (isPrime(i) == 1 && number % i == 0) 
      max_div = i;
  }
  printf("%d", max_div);
}

//답
//29

//이 프로그램은 가장 큰 소인수를 찾는 프로그램.
//isPrime() : 주어진 숫자가 소수인지 아닌지를 확인하는 함수
//main()에서 for문의 조건은 소수이면서 i가 증가하면서 나누어 떨어져야 함.
