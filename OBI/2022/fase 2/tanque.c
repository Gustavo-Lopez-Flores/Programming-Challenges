#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#define MAX 500
#define I 100
#define J 100
int main()
{
    int c, d, t;
    float mQntd;
    scanf("%d %d %d",&c,&d,&t);
    mQntd = ((float)d/c) - t;
    if(mQntd < 0){
        mQntd = 0;
    }
    printf("%.1f\n",mQntd);
    return 0;
}
