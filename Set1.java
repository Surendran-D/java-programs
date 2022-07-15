package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
	HashSet<Integer> ha=new HashSet<>();
	ha.add(10);
	ha.add(25);
	ha.add(50);
	ha.add(75);
	System.out.println("hashset : "+ha);
	Object[] ob=ha.toArray();
	System.out.println("after convert array : "+ha);
	
	
	HashSet<Integer>Li=new LinkedHashSet<>();
	Li.add(10);
	Li.add(25);
	Li.add(50);
	Li.add(75);
	System.out.println("Linkedhashset : "+Li);

  System.out.println("address hashset "+ System.identityHashCode(ha)); // to get address of objects .
  System.out.println("address linkhashset "+ System.identityHashCode(Li));
  
  TreeSet<Integer> st=new TreeSet<>(); // if we give differnt datatypes then throws castclass exception
st.add(10);
st.add(25);
st.add(50);
st.add(75);
	System.out.println("treeset ascending sort : "+st);
	
	/* navigableset used to ascending,descending,floor,ceiling, higher,lower values gets */
	
	NavigableSet<Integer> rev= st.descendingSet(); 
	System.out.println("treeset descending sort : "+rev);
	
	
	
	}

}
