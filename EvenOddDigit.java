
public class EvenOddDigit {

	public static void array() {
		int array[] = {1,2,3,4,5,6,7,8,9} ;

		System.out.println("even no ");

		for(int i=0;i<array.length;i++) 
		{
			if(array[i]%2==0)
				System.out.println(array[i]);
		}
		System.out.println("odd no ");

		for(int i=0;i<array.length;i++) 
		{
			if(array[i]%2!=0)
				System.out.println(array[i]);
		}


	}
		public static void main(String[] args) {


			int no = 121;
			int temp=0,even=0,odd =0;

			while(no!=0){

				temp = no%10;
				no=no/10;
				if(temp%2==0) 
					even++;
				else 
					odd++;
			}
			System.out.println("Even nos : "+ even + " & Odd nos: " + odd );
			array();
		}

	}
