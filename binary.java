public class binary {

	public static void main(String[] args) {
		
		int [] arr = new int [] {2,4,7,9,11,44 ,55 ,66 };
		int key  = 2;
		int left=0;
		int right = (arr.length)-1;
		int mid=(left+right)/2;
		while(left<= right)
		{
			if (key==arr[mid]) {
				
				System.out.println("found");
				break;
			}
			
			else if (key>arr[mid]) {
				
				left=mid+1;
				
			}
			else {
				right=mid-1;
				
			}
			mid=(left+right)/2;
		}
	}

}
