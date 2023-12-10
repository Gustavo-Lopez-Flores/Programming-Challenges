#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
int main() {
  int l;
  char c;
  scanf("%c",&c);
  c = toupper(c);
  l = (int)c - 64;
  printf("%d\n",l);
  return 0;
}