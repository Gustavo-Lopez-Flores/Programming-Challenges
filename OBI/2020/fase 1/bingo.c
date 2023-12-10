#include <stdio.h>
#include <stdlib.h>
#define MAX 1000
int main(){
  int i, j, c, n, k, u, cnt, aux = 0, o[MAX], b[MAX], m[MAX][MAX]; 
  scanf("%d %d %d", &n, &k, &u);
  for(i=0;i<n;i++){
    b[i] = 0;
    for(j=0;j<k;j++){
      scanf("%d",&m[i][j]);
    }  
  }  
  for(i=0;i<u;i++){
    scanf("%d",&o[i]);
  }
  for(i=0;i<u;i++){
    for(j=0;j<n;j++){
      cnt = 0;
      for(c=0;c<k;c++){
        if(o[i] == m[j][c]){
          m[j][c] = 0;
        }else if(m[j][c] == 0){
          cnt++;
        }
      }
      if(cnt == k){
        printf("%d\n",j+1);
        m[j][0] = -1;
      }
    }
  }
  return 0;
}