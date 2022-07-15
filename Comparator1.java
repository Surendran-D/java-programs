package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
class comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	String a=(String) o1;
	String b=(String) o2;
	/*int r=a.compareTo(b); // this is the method to be follow to compare to objects sort
	if(r>0)
	{
		return 1;
	}
	else if(r<0)
	{
		return -1;
	}
		return 0;
	}*/
	
	// using length to sort the variables
	if(a.length() >b.length())
	{
		return 1;
	}
	else if(a.length() <b.length())
	{
		return -1;
	}
	return 0;
}
}

public class Comparator1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	String st= "mango";
	String st1="apple";
	String st2="watermelon";
	String st3="biscuit";
	ArrayList<String> ar=new ArrayList<>();
	ar.add(st);
	ar.add(st1);
	ar.add(st2);
	ar.add(st3);
	
	// Arrays.sort(st); // its normal arrays method to sort
	comp obj=new comp();
Collections.sort(ar, obj);
	
	 System.out.println("after sorting using compartor ");
    for(String a:ar)
    {
    	System.out.println(a);
    }

	}

}

