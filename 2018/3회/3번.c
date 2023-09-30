//다음은 연결 리스트를 활용하여 스택 구조를 C언어로 구현한 것이다. <출력>과 <코드>를 보고 괄호 ( 1 ), ( 2 )에 가장 적합한 답을 쓰시오.
//<출력>
//30
//20
//10
#include <stdio.h>
#include <stdlib.h>
struct NODE {
	int data;
  struct NODE *Next;
};
struct NODE *head;
void Push(int data){
	struct NODE *end = malloc(sizeof(struct NODE));
  end->(  ①  ) = head->(  ①  );
  end->data = data;
  head->(  ①  ) = end;
}
int Pop() {
	int a; 
  sruct NODE *del = head->(  ①  );
  head->(  ①  ) = del->(  ①  );
  a = del->data;
  free(del);
  return a;
}
main() {
	int r; 
  head = malloc(sizeof(struct NODE));
  head->(  1  ) = NULL;
  Push(10);
  Push(20);
  Push(30);
  r = (  2  );
  printf("%d\n", r);
  r = (  2  );
  printf("%d\n", r);
  r = (  2  );
  printf("%d\n", r);
}

//답
//1: Next
//2: Pop()
