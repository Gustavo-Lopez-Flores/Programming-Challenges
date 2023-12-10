#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int main()
{
    int d, i, j, linha, coluna, numFalta, somaFalta = 0, somaC1 = 0, somaC2 = 0, mat[10][10];;
    scanf("%d",&d);
    for(i = 0; i <= d-1; i++){
        for(j = 0; j <= d-1; j++){
            scanf("%d",&mat[i][j]);
            if(mat[i][j] == 0){
                linha = i;
                coluna = j;
            }
        }
    }
    for(i = 0; i <= d-1; i++){
        for(j = 0; j <= d-1; j++){
            if(linha == i){
                somaFalta = somaFalta + mat[i][j];
            }
            if(i==1){
                somaC1 = somaC1 + mat[i][j];
            } 
            if(i==2){
                somaC2 = somaC2 + mat[i][j];
            }

        }
    }
    if (somaC1 == somaC2) {
    numFalta = somaC1 - somaFalta;    
    }else if(somaC1 > somaC2){
    numFalta = somaC1 - somaFalta;    
    }else if(somaC2 > somaC1){
    numFalta = somaC2 - somaFalta;        
    } 
    printf("%d\n",numFalta);
    printf("%d\n",linha+1);
    printf("%d\n",coluna+1);
    return 0;
}