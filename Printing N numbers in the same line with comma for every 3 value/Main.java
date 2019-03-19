#include <stdio.h>
int main() {
	int n,m;
  scanf("%d %d",&n,&m);
  for(int i=1; i<=n; i++)
  {
    printf("%d",i);
    if(i % 3==0 && i!=n)
    {
      printf(",");
    }
  }
	return 0;
}