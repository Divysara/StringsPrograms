
public class SwapProgram {
	
	// pgm to swap the values
	public static void swapUsingThirdVariable() {
		int a = 200;
		int b = 400;
		System.out.println("value of a before swap: "+ a);
		System.out.println("value of b before swap: "+ b);
	

		int temp = 0;
		
		temp = b;
		b = a;
		a= temp;
		System.out.println("value of a after swap: "+ a);
		System.out.println("value of b after swap: "+ b);
	
	}
	// pgm to swap the values
		public static void swapWithoutThirdVariable() {
			int a = 200;
			int b = 400;
			System.out.println("value of a before swap: "+ a);
			System.out.println("value of b before swap: "+ b);
		

			a=a-b;// a values bcms =200-400=-200
			b=a+b;//b value is -200+400=200
			a=b-a;//a value = 200-(-200)=400
		
			System.out.println("value of a after swap: "+ a);
			System.out.println("value of b after swap: "+ b);
		
		}
		public static void oneLine() {
			int a=10;
			int b=20;
			 b = a+b-(a=b);
			 System.out.println("value of a: "+ a+" value of b: "+ b);
		}

	public static void main(String[] args) {
		swapUsingThirdVariable();
		swapWithoutThirdVariable();
		oneLine();
		
	}	

}
