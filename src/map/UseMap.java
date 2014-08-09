package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {
	
	public Map<Integer, String>map = new HashMap<Integer,String>();
	private int key =0;
	
	//Implement a method which can add data into a Map
	public void addElementByMap(String data){
		
	map.put(key, data);
    key++;
	}
	
	/*Implement a method that can retrieve data from a Map and it will return data containing in a Map
	 * Use while loop to iterate through
	 */
	
	public Map<String, String> getDataByMap(Map<String,String> map){
		Map<String, String> mapData = new HashMap<String,String>();
		
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator() ;	
		while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() +" :: "+ entry.getValue());
            mapData.put(entry.getKey(), entry.getValue());
		}
		
//		for(Entry<String, String> name:mapData.entrySet()){
//			System.out.println(name.getKey()+"---->"+name.getValue());
//		}
		
		return mapData;
	}
	
	/*Implement a method that can retrieve data from a Map contains List and it will return data containing in a Map
	 * Use for loop to iterate through
	 */
		
		public Map<String, List<String>> getDataByMapList(Map<String,List<String>> list){
			Map<String, List<String>> listData = new HashMap<String,List<String>>();
			
			for(Map.Entry<String, List<String>> group:list.entrySet()){
				String key = group.getKey();
				List<String> value = group.getValue();
				
				List<String> clonedList = new LinkedList<>();
				
				for( String s: value ){
					System.out.println(key+"---->"+s);
					clonedList.add(s);	
				}	
				listData.put(key, clonedList);
				
			}
			
			return listData;
		}

}
