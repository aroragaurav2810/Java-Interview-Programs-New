package ixigo;

public class Sorting {

	public static void main(String[] args) {
		
		char ch[]={'a','!','b','3','c'};
		
		int len =ch.length;
		int i=0;
		int j=len-1;
		// TODO Auto-generated method stub
		
		while(i<j)
		{
			if(ch[i]!='a' && ch[i]!='b'&&ch[i]!='c' &&ch[j]!='a' && ch[j]!='b'&&ch[j]!='c')
			{
				i++;
				j--;
			}
			else if(ch[i]=='a' && ch[i]=='b'&&ch[i]=='c' &&ch[j]!='a' && ch[j]!='b'&&ch[j]!='c')
			{
				j--;
			}
			else if (ch[i]!='a' && ch[i]!='b'&&ch[i]!='c' &&ch[j]=='a' && ch[j]=='b'&&ch[j]=='c')
			{
				i++;
			}
			
			else
			{
				  
			}
		}

	}

}
