
public class PatternPgms {

	public static void main(String[] args) {

		/*pgm 1:
		1
		22
		333
		4444
		55555
		 */

		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=row;col++) 
			{
				System.out.print(row);
			}
			System.out.println();
		}

		/*pgm 2:
		1
		12
		123
		1234
		12345
		 */
		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=row;col++) 
			{
				System.out.print(col);
			}
			System.out.println();
		}

		/* pgm 3:
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *
		 */

		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=row;col++) 
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}

		System.out.println();

		/*pgm 4:
		 * * * * * 
		 * * * * 
		 * * * 
		 * * 
		 * 
		 */
		for(int row=5;row>=1;row--) 
		{
			for(int col=1;col<=row;col++) 
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		System.out.println();

		/*pgm 5:
		 11111
          2222
           333
            44
             5
		 */
		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<row;col++) 
			{
				System.out.print(" ");
			}
			for(int k=5;k>=row;k--)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println();
		/*pgm 6:
		  *
		 **
        ***
       ****
      *****
		*/

		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}	
			
			/*pgm  7 :for pyramid:
			
	     
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
*/
			for(int i=1;i<=5;i++)
			{
				for (int j=i;j<=5;j++) 
				{
					System.out.print("  ");
				}
				for(int k=1;k<i;k++) 
				{
					System.out.print("* ");
				}
				for(int k=1;k<=i;k++) 
				{
					System.out.print("* ");
				}
			System.out.println();
			}
			System.out.println();
		//pgm for reverse pyramid	
			for(int i=1;i<=5;i++)
			{
				for (int j=1;j<=i;j++) 
				{
					System.out.print("  ");
				}
				for(int k=i;k<5;k++) 
				{
					System.out.print("* ");
				}
				for(int k=i;k<=5;k++) 
				{
					System.out.print("* ");
				}
			System.out.println();
			}
			System.out.println("//pgm for diamond:");
			
			//pgm for diamond:
			
			for(int i=1;i<5;i++)
			{
				for (int j=i;j<=5;j++) 
				{
					System.out.print("  ");
				}
				for(int k=1;k<i;k++) 
				{
					System.out.print("* ");
				}
				for(int k=1;k<=i;k++) 
				{
					System.out.print("* ");
				}
			System.out.println();
			}
			for(int i=1;i<=5;i++)
			{
				for (int j=1;j<=i;j++) 
				{
					System.out.print("  ");
				}
				for(int k=i;k<5;k++) 
				{
					System.out.print("* ");
				}
				for(int k=i;k<=5;k++) 
				{
					System.out.print("* ");
				}
			System.out.println();
			}
			
	}

}
