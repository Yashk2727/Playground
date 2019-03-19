#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int sum=a/100;
  int sum1=a%10;
  printf("%d",sum+sum1);
  return 0;
}