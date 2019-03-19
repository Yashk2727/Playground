#include<stdio.h>
int main()
{
  int a,sum;
  scanf("%d",&a);
  int no1=a/10;
  int no2=a%10;
  sum=no1+no2;
  printf("%d",sum);
  return 0;
}