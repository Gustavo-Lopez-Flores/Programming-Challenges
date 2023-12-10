#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int main()
{
	int i, d, a, n, valorTotal = 0;
	scanf("%d%d%d",&d,&a,&n);
	if (n == 1) {
		valorTotal = 31 * d;
	}else{
		valorTotal = (d + ((14) * a)) * (32 - (n));
	} 
	printf("%d\n",valorTotal);
	return 0;
}
