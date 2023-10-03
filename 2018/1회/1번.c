//다음 C언어의 <출력>과 <코드>를 보고 괄호 (1), (2), (3), (4)에 적용될 수 있는 가장 적합한 답을 쓰시오.
//<출력>
//statck's status
//value = 40
//value = 30
//value = 20

//코드
#include <stdio.h>
#define MAX_STACK_SIZE 10

int stack[MAX_STACK_SIZE];
int top = -1;

void push(int item) {
	if (top >= (   1   )) {
    	printf("stack is full\n");
    	}
    	stack[++top] = (  2  );
}
int pop() {
	if (top == (  3  )) {
    		printf("stack is empty\n");
    	}
	return stack[(  4  )];
}
int isempty() {
	if (top == (  3  ))
    		return 1; 
	else 
		return 0;
}
int isfull() {
	if (top >= (  1  ))
    		return 1; 
	else 
		return 0;
}
int main() {
	int e;
  	push(20); 
  	push(30); 
  	push(40);
  	printf("stack's status\n");
  	while (!isempty()) {
    		e = pop();
    		printf("value = %d\n", e);
  	}
}

//답
//1: MAX_STACK_SIZE-1
//2: item
//3: -1
//4: top--
