#include<stdio.h>
int square(int num)
{
  int sum= num * num;
  return sum;
}
int main() 
{
  int n;
  scanf("%d",&n);
  int sum1 = square(n);
  printf("%d",sum1);
  
   
   return 0;
}