#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
  long long int n, nums, i = 1, j, k;
  while(scanf("%llu",&n) != EOF){
    nums = 1;
    for(j=1;j<=n;j++){
      nums += j;
    }
    if(nums > 1){
      printf("Caso %llu: %llu numeros\n", i, nums);
    }else{
      printf("Caso %llu: %llu numero\n", i, nums);  
    }
    printf("0");
    for(j=1;j<=n;j++){
      for(k=0;k<j;k++){
        printf(" %llu",j);                 
      } 
    }
    printf("\n\n");
    i++;
  }
  return 0;
}