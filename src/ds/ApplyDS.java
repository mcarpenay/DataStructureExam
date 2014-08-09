package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ApplyDS {

	public static void main(String[] args) {
		/*
		 * UseStructure can be applied here to demonstrate how to add and retrieve.
		 * 
		 */
		UseStructure us = new UseStructure();
		String [] names = {"Paul", "Jack","Jen","Abdul"};
		 
		 for(int i=0; i<names.length;i++){

			 us.addByLinkedList(names[i]);
			 us.addByArrayList(names[i]);
			 us.addByQueue(names[i]);
			 us.addByStack(names[i]);
		}//for
		 
 
			us.returnByArrayList(us.arrayList) ;
			System.out.println("");
			us.returnByLinkedList(us.list);
			System.out.println("");
			us.returnByQueue(us.queue);
			System.out.println("");
			us.returnByStack(us.stack);
	
		

	}

	
}
