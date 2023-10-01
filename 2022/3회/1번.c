//다음 C언어로 구현된 프로그램을 분석하여 배열 <mines>의 각 칸에 들어갈 값을 쓰시오.
#include <stdio.h>
void main() {
  int field[4][4] = { {0, 1, 0, 1}, {0, 0, 0, 1}, {1, 1, 1, 0}, {0, 1, 1, 1} };  
  int mines[4][4] = { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} };
  int w = 4, h = 4;
  for (int y = 0; y < h; y++) {
    for (int x = 0; x < w; x++) {
      if (field[x][y] == 0) 
        continue;
      for (int j = y -1; j <= y + 1; j++) {
        for (int i = x - 1; i <= x + 1; i++) {
          if (chkover(w, h, j, i) == 1) {
            mines[i][j] += 1;
          }
        }
      }
    }
  }
}
int chkover(int w, int h, int j, int i) {
  if (i >= 0 && i < w && j >= 0 && j < h) return 1;
  return 0;
}

//답
//1 1 3 2
//3 4 5 3
//3 5 6 4
//3 5 5 3

//field 배열에서 1인 위치를 찾고 해당 위치를 중심으로 주변 8개의 셀에 대해 mines 배열 값을 1씩 증가
//chkover 함수는 주어진 좌표가 배열의 범위를 벗어나는지 확인
