//다음 Python으로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오. (단, 출력문의 출력 서식을 준수하시오.)
a = 100
result = 0
for i in range(1, 3):
  result = a >> i;
  result = result + 1
print(result)

//답
//26
//for i in range(1, 3): -> i를 1에서 2까지 반복
//result = a >> i;: a를 i비트만큼 오른쪽으로 shift한 값을 result에 할당
//i=1일 때, a >> 1이므로 100을 2로 나눈 결과인 50, result = 50
//i=2일 때, a >> 2이므로 100을 4로 나눈 결과인 25, result = 25
//result = result(25) + 1 = 26이 출력됨
