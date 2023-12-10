#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#define MAX 100
#define I 100
#define J 100
int main()
{
    int i, j, dimensao, matriz[I][J] = {0};
    scanf("%d ",&dimensao);
    for(i=0;i<dimensao;i++){
        for(j=0;j<dimensao;j++){
            if(i <= j && j < dimensao-i){
                matriz[i][j] = i+1;
                matriz[j][i] = matriz[i][j];
                matriz[(dimensao-1)-i][j] = matriz[i][j];
                matriz[j][(dimensao-1)-i] = matriz[i][j];
            }
        }    
    }
    for(i=0;i<dimensao;i++){
        for(j=0;j<dimensao;j++){
            printf("%d ",matriz[i][j]);
        }    
        printf("\n");
    }

    return 0;
}
