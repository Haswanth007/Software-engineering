import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ClassGrades {
Map<String,String> classList =  new HashMap<String,String>();
public 	 ClassGrades() {
	classList.put("Bob", "A");
	classList.put("Mary", "c");
	classList.put("Sarah", "B");
	classList.put("philip", "A");
	classList.put("Greg", "F");
}
public void printClassList() {
	Iterator<Entry<String,String>> entries = classList.entrySet().iterator();
	while(entries.hasNext()) {
		Entry<String,String> entry = entries.next();
		System.out.println("key="+entry.getKey()+",Value="+entry.getValue());	
		
	}
}
public void printClassList2() {
	for(Map.Entry<String,String>entry : classList.entrySet()) {
		System.out.println("key ="+entry.getKey()+",Value ="+entry.getValue());
	}
	//iterating over keys only
	for(String key : classList.keySet()) {
		System.out.println("key ="+key);
	}
	//iterating over values only
	for(String value : classList.values()) {
		System.out.println("Value = "+ value);
	}
}
public static void main(String[] args) {
	ClassGrades myClassList = new ClassGrades();
	myClassList.printClassList2();
}
}