#include <stdio.h>
#include <conio.h>

int main()
{
	int T,i,x=5,y=2,n=5;
	int a[n]={1,3,5,12,4};

	for (i = 0; i < n; i++)
	{
		if (a[i]<=x )
		{
			printf("\nless than or equal to x 5: %d ",a[i]);
		}
		if (a[i]%y==0)
		{
			printf("\ndivisible by y 2: %d ",a[i]);
		}
	}
}
