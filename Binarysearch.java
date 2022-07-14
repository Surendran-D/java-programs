package Sort;

public class Binarysearch {
	
	public int binary(int[] a,int n,int k)
	{
		int low=0;
		int high=n-1;
		
		while (low <= high) {
		      int mid =( low + high ) / 2;

		      if (a[mid] == k)
		        return mid;

		      if (a[mid] < k)
		        low = mid + 1;

		      else
		        high = mid - 1;
		    }

		    return -1;	
	}

	public static void main(String[] args) {
		
		int[] a1= {1,2,3,4,5};
		int n1=a1.length;
		int k1=3;
		
		Binarysearch ob=new Binarysearch();
		int re=ob.binary(a1, n1, k1);
		
		System.out.println("the return index = "+ re);
		
	

	}

}
