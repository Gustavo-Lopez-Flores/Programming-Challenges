#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() {
  int i, n, a = 0, e = 0, h = 0, m = 0, x = 0;
  scanf("%d",&n);
  char c[n], p[100];
  for(i=0;i<n;i++){
    scanf(" %s %c", p, &c[i]);
  }
  for(i=0;i<n;i++){
    if(c[i] == 'A'){
      a++;
    }else if(c[i] == 'E'){
      e++;
    }else if(c[i] == 'H'){
      h++;
    }else if(c[i] == 'M'){
      m++;      
    }else if(c[i] == 'X'){
      x++;
    }
  }
  printf("%d Hobbit(s)\n",x);
  printf("%d Humano(s)\n",h);
  printf("%d Elfo(s)\n",e);
  printf("%d Anao(oes)\n",a);
  printf("%d Mago(s)\n",m);   
  return 0;
}