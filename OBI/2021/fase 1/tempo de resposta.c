#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 20
#define TAM 100
int main(){
  int i, j, n, busca, amigo[MAX], tempo[TAM]={0};
  char acao[MAX];
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf(" %c %d",&acao[i],&amigo[i]);
  }
  for(i=0;i<n;i++){
    if(acao[i] == 'R'){
      busca = 0;
      for(j=i+1;j<n;j++){
        if(acao[j] == 'E' && amigo[i] == amigo[j]){
          tempo[amigo[i]]++;
          busca = 1;
          break;
        }else if(acao[j] == 'T'){
          tempo[amigo[i]] += amigo[j]-1;
        }else{
          tempo[amigo[i]]++;
        }
      }
      if(busca == 0){
        tempo[amigo[i]]=-1;
      }
    }
  }
  for(i=0;i<TAM;i++){
    if(tempo[i]!=0){
      printf("\n%d %d",i,tempo[i]);       
    }
  }
  return 0;
}