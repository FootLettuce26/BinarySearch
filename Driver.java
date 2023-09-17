package binarySearch;

public class Driver {

	public static void main(String[] args) {
		int[][] theArray = {{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		//System.out.println(theArray[theArray.length-1].length);
		
		MatrixSearch(theArray, 7); //[0, 2]
		MatrixSearch(theArray, 15); //[2, 2]
		MatrixSearch(theArray, 10); //[1, 1]
		
	}
	
	
	public static int[] MatrixSearch(int[][] ar, int target)
	{
		int y;
		int x;
		int steps = 1;
		
		
		int[] answer = new int[2]; 
		int[] middle = ar[ar.length/2];
		//System.out.println(middle[middle.length-1]);
		//for loop to parse through each individual array
		y = ar.length/2;
		answer[0] = y;
		
		for(int i = 0; i < 1; i++)
		{
			
			if(target > middle[middle.length-1])
			{
				middle = ar[ar.length/2 + steps];
				y = ar.length/2 + steps;
				//System.out.println(y);
				answer[0] = y;
			}
			else if(target < middle[0])
			{
				middle = ar[ar.length/2 - steps];
				y = ar.length/2 - steps;
				//System.out.println(y);
				answer[0] = y;
			}

			for(int j = 0; j < middle.length; j++)
			{
				if(target == middle[j])
				{
					x = j;
					answer[1] = x;
				}
			}
			steps++;
		}
		System.out.println(answer[0] + ", " + answer[1]);
		return answer;
	}
	
	

}
