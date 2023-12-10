#include <stdio.h>
 
int main() {
  int aux = 0, i, num;
  while(aux == 0){
  scanf("%d", &num);
    if(num == 0){
      break;
    }else{
      for(i = 1; i <= num; i++){
        if(i == num){
          printf("%d\n",i);      
        }else{
          printf("%d ",i);
        }
      }        
    }
  }
  return 0;
}