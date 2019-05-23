package ixigo;

public class ZeroOne {

	public static void main(String[] args) {
		
		
		
		
		int a[]={1,1,1,1,1,0,0,0,0,0};
		
		int len=a.length;
		
		int i=0;
		int j=len-1;
		// TODO Auto-generated method stub
		
		while(i<j)
		{
			if(a[i]==0 && a[j]==0)
			{
				i++;
			}
			else if(a[i]==0 && a[j]==1)
			{
				i++;
				j--;
			}
			else if(a[i]==1 && a[j]==1)
			{
				j--;
			}
			else
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			}
		}
		
		for(int k=0;k<len;k++)
		{
			System.out.print(a[k]);
		}

	}

}
