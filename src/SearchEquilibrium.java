
public class SearchEquilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,2,2,2,2};
		int sum=0;
		int currSum=0;
 String str=		arr.toString();
 System.out.println(str);
		for (int i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum= "+sum);
		for(int i=0;i<arr.length;i++){
			currSum=currSum+arr[i];
			if (sum-currSum*2<=0)
			{
				if((currSum-arr[i])*2==(sum-arr[i]))
				{
			System.out.println("Eqb pt is at "+ (i+1) + " Position and Eqb value= "+arr[i]);
				break;
				}
			}
			if(i==(arr.length-1)) System.out.println("No Eqb Point");
		}
	

	}

}
