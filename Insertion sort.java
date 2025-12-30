/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int a[]={3,5,2,1,7,4,10,8};
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];//2
            int j=i-1;//1
            while(j>=0 && key<a[j])
            {
                a[j+1]=a[j];
                j--;//1
            }
            a[j+1]=key;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
	}
}