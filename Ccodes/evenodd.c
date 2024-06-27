#include<stdio.h>
void main()
{
    int num,i,even_sum=0,odd_sum=0;
    printf("enter a num: \n");
    scanf("%d",&num);
    for(i=0;i<=num;i++)
    {
     if(i%2==0)
     even_sum=even_sum+i;
     else
     odd_sum=odd_sum+i;
    }
    printf("sum of all odd numbers=%d \n",odd_sum);
    printf("sum of all even numbers=%d \n",even_sum);
}
