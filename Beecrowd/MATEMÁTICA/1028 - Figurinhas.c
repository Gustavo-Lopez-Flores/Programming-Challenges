#include <stdio.h>
#include <stdlib.h>

int mdc(int num1, int num2) {
  int resto;
  do {
      resto = num1 % num2;
      num1 = num2;
      num2 = resto;
  } while (resto != 0);
  return num1;
}

int main() {
  int i, n;
  int **fig;
  
  scanf("%d",&n);
  
  fig = malloc (n * sizeof (int*));
  for (i=0; i < n; i++){
    fig[i] = malloc (3 * sizeof (int)) ;
  }
  
  for(i=0;i<n;i++){
    scanf("%d %d", &fig[i][0], &fig[i][1]);
  }

  for(i=0;i<n;i++){
    fig[i][2] = mdc(fig[i][0], fig[i][1]);
  }
  
  for(i=0;i<n;i++){
    printf("%d\n", fig[i][2]);
  }

  for(i=0; i < n; i++){
    free(fig[i]);
  }
  
  free(fig);
  return 0;
}