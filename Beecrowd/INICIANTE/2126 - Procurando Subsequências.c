#include <stdio.h>
#include <string.h>
#define MAX 35
int main()
{
  int sub, pos, cs = 1, i, j, s = 0;
  char s1[MAX], s2[MAX];
  while(scanf(" %s %s", s1, s2) != EOF){
    sub = 0;
    pos = 0;
    printf("Caso #%d:\n",cs);
    while(strstr(s2+pos,s1) != NULL){
      pos++; 
    } 
    for(i=0;i<strlen(s2);i++){
      s = 0;
      for(j=0;j<strlen(s1);j++){
        if(s2[i+j] == s1[j]){
          s++;
        }
      }
      if(s == strlen(s1)){
        sub++;
      }
    }      
    if(sub == 0){
      printf("Nao existe subsequencia\n\n");
    }else{
      printf("Qtd.Subsequencias: %d\n",sub);
      printf("Pos: %d\n\n",pos);
    }
    cs++;
  }
  return 0;
}