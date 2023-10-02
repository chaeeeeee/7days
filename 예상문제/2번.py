#다음은 파이썬 프로그램이다. 실행 결과를 쓰시오.
li = ['Korea', 'America', 'China']
a = 0
str01 = ''
for i in li:
  for j in i:
    str01 += j[0]
    a = a + 1
    if a > 5:
      break
print('a : ', a, ', str01 : ', str01)

#답
#a : 7 str01 : KoreaAC

#1. a = 1, str01 = K
#2. a = 2, str01 = Ko
#3. a = 3, str01 = Kor
#4. a = 4, str01 = Kore
#5. a = 5, str01 = Korea
#6. a = 6, str01 = KoreaA
#7. a = 7, str01 = KoreaAC
