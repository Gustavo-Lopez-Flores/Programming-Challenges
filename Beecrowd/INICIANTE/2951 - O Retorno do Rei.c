#include <stdio.h>
#include <stdlib.h>
typedef struct runa{
  int n;
  char c;
}runa;
int main() {
  int i, j, n, g, x, s = 0;  
  scanf(" %d %d",&n,&g);
  char v[n+1];
  runa r[n+1];
  for(i=0;i<n;i++){
    scanf(" %c %d", &r[i].c, &r[i].n);
  }
  scanf(" %d",&x);
  for(i=0;i<x;i++){
    scanf(" %c", &v[i]);
  }
  for(i=0;i<x;i++){
    for(j=0;j<n;j++){
      if(v[i] == r[j].c){
        s = s + r[j].n;
        break;
      }
    }
  }
  printf("%d\n",s);
  if(s >= g){
    printf("You shall pass!\n");
  }else{
    printf("My precioooous\n");    
  }
  return 0;
}