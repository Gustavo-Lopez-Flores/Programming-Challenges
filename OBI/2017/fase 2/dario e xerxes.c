#include <stdio.h>
#include <stdlib.h>

int main() {
  int n, d, x, dario = 0, xerxes = 0;
  scanf("%d",&n);
  for (int i = 0; i < n; i++) {
    scanf("%d %d", &d, &x);
    switch(d){
      case 0:
        if(x == 1 || x == 2){
          dario++;
        }else if(x == 3 || x == 4){
          xerxes++;
        }
      break;
      case 1:
        if(x == 2 || x == 3){
          dario++;
        }else if(x == 4 || x == 0){
          xerxes++;
        }
      break;
      case 2:
        if(x == 3 || x == 4){
          dario++;
        }else if(x == 0 || x == 1){
          xerxes++;
        }
      break;
      case 3: 
        if(x == 4 || x == 0){
          dario++;
        }else if(x == 1 || x == 2){
          xerxes++;
        }
      break;
      case 4: 
        if(x == 0 || x == 1){
          dario++;
        }else if(x == 2 || x == 3){
          xerxes++;
        }
      break;
    }
  }
  if(dario > xerxes){
    printf("dario\n");
  }else if(xerxes > dario){
    printf("xerxes\n");
  }
  return 0;
}