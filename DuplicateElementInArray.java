import java.util.HashSet;

public class DuplicateElementInArray {
	

	public static void main(String[] args) {

	Integer a[]= {1,1,2,2,3,4,4,8,10,10};
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				System.out.println("Duplicate element found: " +a[j]);
				flag=false;
				}
				
			}
		}
		if(flag)
			System.out.println("NO duplicates!");
		
		//Using Hashset -hash set accepts only unique values.
		Integer b[]= {1,2,3,4,1};
		boolean result=true;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int hash:b)
		{
			if(set.add(hash)==false) //this returns false if the value already exists!
			{
				System.out.println("Duplicates Found! :" +hash);
				result=false;
			}
		}
		if(result)
			System.out.println("No Duplicates!");
		
	}

}
