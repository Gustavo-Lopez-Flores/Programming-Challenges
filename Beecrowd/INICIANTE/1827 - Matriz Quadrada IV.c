#include <stdio.h>
#include <stdlib.h>
#define MAX 101
int main()
{
  int i, j, num, mat[MAX][MAX];
  while(scanf("%d", &num) == 1){
    for(i = 0; i < num; i++){
      for(j = 0; j < num; j++){
        if(i == j){
          mat[i][j] = 2;
        }else if(i+j == num-1){
          mat[i][j] = 3;
        }else{
          mat[i][j] = 0;
        }
        if(i == j && i == (num-1)/2){
          mat[i][j] = 4;
        }else if((i >= (num/3) && j >= (num/3)) && (i <= ((num-1)-(num/3)) && j <= ((num-1)-(num/3)))){
          mat[i][j] = 1;
        }
        printf("%d",mat[i][j]);
      }
      printf("\n");
    }
      printf("\n");
  }
  return 0; 
}