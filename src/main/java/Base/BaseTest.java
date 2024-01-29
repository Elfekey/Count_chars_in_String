package Base;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class BaseTest {

//		@Test
	public void Practice() {
		// ...
		//				String s = "abdsd3$asda$asasdd$sadash";
		String s = "abdsd3$h";
//		Map counts = getCharFreq(s);
		Map<Character,Integer> counts= getCharFreq(s);
		
		counts.get('$'); // => 3
		counts.get('a'); // => 7
		counts.get('s'); // => 6
		System.out.println(counts.get('$'));
		
		for(Map.Entry map2 : counts.entrySet()) {
			System.out.println("Key : "+map2.getKey()+" Value : "+map2.getValue());	
		}
		}
	
	public static Map<Character,Integer> getCharFreq(String s) {
		Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
		if (s != null) {
			for (Character c : s.toCharArray()) {
				//the above expression is equal the below
				/*			  for (int i =0;i<s.length();i++) {
				  Character c=s.charAt(i);  
				 */				  
				Integer count = charFreq.get(c);
				int newCount = (count==null ? 1: count+1);//count for the null and exist here 
				//the above expression is equal the below 
				/*		      int newCount;
		      if (count==null) {
		    	  newCount=1;
			}
		      else 
	  newCount =count+1;
				 */		    
				charFreq.put(c, newCount);
			}
		}
		return charFreq;
	}
//	@Test
	public void Practice2() {
		// ...
		//				String s = "abdsd3$asda$asasdd$sadash";
		//				Map counts = getCharFreq(s);
		//				counts.get('$'); // => 3
		//				counts.get('a'); // => 7
		//				counts.get('s'); // => 6
		//				System.out.println(counts.get('h'));
		//				

		Map<String ,Integer> map1= new HashMap<>();
		map1.put("ST1",1);
		map1.put("ST2",2);
		map1.put("ST3",3);
		for (Map.Entry<String ,Integer>map2 : map1.entrySet()) {
			System.out.println(map2.getKey()+"  : "+map2.getValue());
		}
	}
//	@Test
	public void x() {
		Scanner o = new Scanner(System.in);
		System.out.println("Please insert any words");
		String sFromUser =o.nextLine();
		//		Map m=getCountOfCharAppeared(sFromUser);
		Map m=te(sFromUser);
		System.out.println("Please insert any character to see how many times it appeared");
		Character charFromUser =o.nextLine().charAt(0);
		System.out.println("The Char : \'"+charFromUser+" \'Appeared : "+m.get(charFromUser)+"  Times");

	}

	public Map<Character,Integer> getCountOfCharAppeared(String s) {
		Map<Character,Integer> myMap= new HashMap<>();
		if(s!=null) {
			//			for(Character ch : s.toCharArray());
			for (int i=0;i<s.length();i++) {
				Character ch=s.charAt(i);
				Integer cCount=myMap.get(ch);
				//				int cFinralCount=(cCount==null ? 1 :cCount+1 ); //the below it the same as this line !!!
				int cFinralCount=1;
				if(cCount==null) {
					cFinralCount=1;
				}
				else
					cFinralCount=cCount+1;

				myMap.put(ch, cFinralCount);
			}
		}
		else
		{
			System.out.println("The String you inserted is null !!");
		}
		return myMap;
	}

	public Map<Character,Integer> te(String s) {
		Map<Character,Integer> myMap = new HashMap<>();
		if (s!=null) {
			for(Character c : s.toCharArray()) {
				Integer countOfC=myMap.get(c);
				int finralCountOfC=(countOfC ==null ? 1 : countOfC+1);
				myMap.put(c, finralCountOfC);
				System.out.println("hello");
			}
		}
		return myMap;
	}

//@Test
	public void te2() {
		String s="adabrakadabra";
		Map<Character,Integer> myMap = new HashMap<>();
		if (s!=null) {
			for(Character c : s.toCharArray()) {
				Integer countOfC=myMap.get(c);
				int finalCountOfC=(countOfC ==null ? 1 : countOfC+1);
				myMap.put(c, finalCountOfC);
			}	
				for(Map.Entry map2 : myMap.entrySet()) {
					System.out.println("Key : "+map2.getKey()+" Value : "+map2.getValue());	
				}
		}

	}


	
	
	
	
	
	
	////Main functionality 

public Map<Character,Integer>cret(String s){
	Map<Character,Integer>m = new HashMap<>();
	if(s !=null) {
		for(Character c : s.toCharArray()) {
			Integer integ=m.get(c);
			int FC=(integ ==null ? 1 : integ+1);
			m.put(c, FC);
		}
	}
	return m;
}

@Test
public void useM() {
	String s="AdabraKadabra";
	Map<Character,Integer> myMap=cret(s);
	for(Map.Entry<Character,Integer>m2 : myMap.entrySet()) {
		System.out.println("Key : "+m2.getKey()+" Value : "+m2.getValue());
	}
		
}




}
