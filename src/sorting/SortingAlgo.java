package sorting;

public class SortingAlgo {

		
		//Selection Sort
		public int[] selectionSort(int [] list){
			for (int i=0; i<list.length;i++){
				for (int j=i+1;j<list.length;j++){
					int temp = list[i];
				
					if(list[j]<temp){
						list[i]=list[j];
						list[j]= temp;
					}//if
				}//inner for	
			}//outer for 
			return list;
		}
		
		//Insertion Sort
		public int [] insertionSort (int [] array){
			
			return array;
		}
		
		
		
		//Bubble Sort
		public int[] bubbleSort(int [] array){
			 
			 int [] ar =array;
			 int j;
		     boolean flag = true;   // set flag to true to begin first pass
		     int temp;   //holding variable

		     while ( flag )
		     {
		            flag= false;    //set flag to false awaiting a possible swap
		            for( j=0;  j < ar.length -1;  j++ )
		            {
		                   if ( ar[ j ] < ar[j+1] )   // change to > for ascending sort
		                   {
		                           temp = ar[ j ];                //swap elements
		                           ar[ j ] = ar[ j+1 ];
		                           ar[ j+1 ] = temp;
		                          flag = true;              //shows a swap occurred  
		                  } 
		            } 
		      } 
			
			return ar;
		}
		
		
		
		//Merge Sort
		public int[] mergeSort(int [] arayA,int [] arayB,int [] arayC){
			int indexA = 0;     // initialize variables for the subscripts
		     int indexB = 0;
		     int indexC = 0;
		     int [] arrayA= arayA;
		     int [] arrayB= arayB;  
		     int [] arrayC= arayC;

		     while((indexA < arrayA.length) && (indexB < arrayB.length))
		     {
		          if (arrayA[indexA] < arrayB[indexB])
		          {
		                 arrayC[indexC] = arrayA[indexA];
		                 indexA++;    //increase the subscript
		          }
		         else
		         {
		                 arrayC[indexC] = arrayB[indexB];
		                 indexB++;      //increase the subscript
		         }
		        indexC++;      //move to the next position in the new array
		     }
		     // Move remaining elements to end of new array when one merging array is empty
		     while (indexA < arrayA.length)
		     {
		           arrayC[indexC] = arrayA[indexA];
		           indexA++;
		           indexC++;
		     }
		     while (indexB < arrayB.length)
		     {
		           arrayC[indexC] = arrayB[indexB];
		           indexB++;
		           indexC++;
		     }
		     	
			
			return arrayC;
		}
		
}
