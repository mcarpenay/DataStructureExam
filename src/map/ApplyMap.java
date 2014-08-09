package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApplyMap {

	public static void main(String[] args) {
		/*
		 * UseMap() can be utilize here.
		 */
		UseMap um = new UseMap();
		String [] names ={"Max", "Pawan","Jabar"};
		String [] grades={"A+","A","B"};
		String [] course={"Biology","Physics","Chemistry"};
		
		Map<String,String> m = new HashMap<String,String>();
		
		// Testing addElementByMap(String data)
		for (int i=0; i<names.length; i++){
			um.addElementByMap(names[i]);
		}
		
		Set<Map.Entry<Integer,String>> it = um.map.entrySet();
		for( Map.Entry<Integer,String> entry: it){
			System.out.println(entry.getKey() + " " + entry.getValue() );
			
		}
		//Testing getDataByMap(Map<String,List<String>> list)
		
		Map<String, String> m1 = new HashMap<String,String>();
		
		for (int i=0; i<names.length; i++){
			m1.put(course[i], grades[i]);
		}
		 um.getDataByMap(m1);
		 
		//Testing getDataByMapList(Map<String,List<String>> list)
		 
		 ArrayList <String> li = new ArrayList<String>();
		 Map<String,List<String>> Registration = new HashMap <String,List<String>>();
		 
		 //create a list of courses
		 for (int j= 0; j<course.length;j++){ 
			 li.add(course[j]);
		 	}
		 
		 for (int i= 0; i<names.length;i++){
		 Registration.put(names[i], li);
		 }
		
		 um.getDataByMapList(Registration);
		 
	}

}
