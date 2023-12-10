#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int main()
{
  int i, j, num, mat[MAX][MAX];
  while(1){
    scanf("%d",&num);
    if(num == 0){
      break;
    }
    for(i = 0; i < num; i++){
      for(j = 0; j < num; j++){
        if(i == 0 || j == 0){
          mat[i][j] = (j+i)+1;
        }else{
          mat[i][j] = mat[i-1][j-1];
        }
        if(j != num-1){
          printf("%3d ",mat[i][j]);          
        }else{
          printf("%3d",mat[i][j]);          
        }
      }
      printf("\n");
    }
      printf("\n");
  }
  return 0; 
}