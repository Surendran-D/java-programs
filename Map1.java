package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap hm=new HashMap();
  hm.put("surendran", 105); // put use to add keys and values
  hm.put("rajesh", 108);
  hm.put("ramesh", 104);
  hm.put("ram", 106);
  
  System.out.println("entry "+hm);
  System.out.println("keys "+hm.keySet());
  System.out.println("values "+hm.values());
 Set s=hm.entrySet(); // 
 System.out.println("entery : "+s);
Iterator st=s.iterator(); // to get values use this one of this method.
while(st.hasNext())
{
	Entry ma=(Entry) st.next();
	if(ma.getKey().equals("surendran")) 
	{
		ma.setValue(250);
	}
	System.out.println("entery  1: "+ma);
}



	}

}
