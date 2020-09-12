package BonusMatrixs_07_09_20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bonus_07_09_2020 {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
	/*int[][] binMat=    {{1,0,1,0,1,1,1,0,1,0,1,1,1,1,0,1,1},// 16*17
						  {1,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,1},
						  {1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1},
						  {0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0},
						  {0,0,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0},
						  {1,0,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1},
						  {0,0,1,0,1,0,0,1,0,1,1,1,1,1,0,0,1},
						  {1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,0},
						  {0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0},
						  {0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,1},
						  {1,1,0,0,1,0,1,1,1,1,1,0,1,1,0,1,1},
						  {0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,1,1},
						  {0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,1,1},
						  {1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0},
						  {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1},
						  {1,0,0,1,1,1,0,1,1,1,1,0,1,0,1,1,0}						 							  
		};*/
		
		int[][] binMat = {{1,0,1,0,1,1,1,0,1,0,1,1,1,1,0,1}, 		
						  {1,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1},
						  {1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0},
						  {0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1},
						  {0,0,1,1,1,1,1,0,1,1,0,1,0,1,1,1},
						  {1,0,0,1,1,0,1,1,1,1,1,0,1,0,1,1},
						  {0,0,1,0,1,0,0,1,0,1,1,1,1,1,0,0},
						  {1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1},
						  {0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,1},
						  {0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1},
						  {1,1,0,0,1,0,1,1,1,1,1,0,1,1,0,1},
						  {0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,1},
						  {0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,1},
						  {1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0},
						  {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0},
						  {1,0,0,1,1,1,0,1,1,1,1,0,1,0,1,1}
						//{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}// //test 65535 limit
		};
		
		int[][] binMat2=     {{0,1,0,1,1,1,0,1,0,1,1,1,1,0,1,1},
							  {1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,1},
							  {0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1},
							  {1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0},
							  {0,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0},
							  {0,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1},
							  {0,1,0,1,0,0,1,0,1,1,1,1,1,0,0,1},
							  {1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,0},
							  {0,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0},
							  {0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,1},
							  {1,0,0,1,0,1,1,1,1,1,0,1,1,0,1,1},
							  {0,1,1,0,1,0,1,0,1,0,1,1,0,1,1,1},
							  {0,1,1,0,1,0,1,0,1,0,1,1,0,1,1,1},
							  {1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0},
							  {1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1},
							  {0,0,1,1,1,0,1,1,1,1,0,1,0,1,1,0}						 							  
					};
		
		
		
		
		int[][] sqr  =  
					{{16, 3, 2, 13},
					{5, 10, 11, 8},
					{9, 6, 7, 12},
					{4, 15, 14, 2},
							};									

			             
		//////////////////////////////////////////////////////////////////////////////
		///J///ORIGINAL BIN////////INT VAL////MINTOMAX//NEWJ////AFTER BIN/////////////
	//I//	0:  10101110101111011	==	89,467	//	11	//	0:	00010101010110110	//
		//	1:  11101011110101111	==	120,751	//	15	//	1:	00101001011111001	//
		//	2:  10101011111010101	==	88,021	//	10	//	2:	00101010101101001	//
		//	3:  01010101010111110	==	43,710	//	7	//	3:	00101110110101011	//
		//	4:  00111110110101110	==	32,174	//	5	//	4:	00110101010110111	//
		//	5:  10011011111010111	==	79,831	//	8	//	5:	00111110110101110	//
		//	6:  00101001011111001	== 	21,241	//	1	//	6:	01010101010101001	//
		//	7:  11001011111010110	==	104,406	//	12	//	7:	01010101010111110	//
		//	8:  00010101010110110	==	10,934	//	0	//	8:	10011011111010111	//
		//	9:  00101110110101011	==	23,979	//	3	//	9:	10011101111010110	//
		//	10: 11001011111011011	== 	104,411	//	13	// 10:	10101011111010101	//
		//	11: 00110101010110111	==	27,319	//	4	// 11:	10101110101111011	//
		//	12: 11010101010110100	==	109,236	//	14	// 12:	11001011111010110	//
		//	13: 00101010101101001	==	21,865	//	2	// 13:	11001011111011011	//
		//	14: 01010101010101001	==	43,689	//	6	// 14:	11010101010110100	//
		//	15: 10011101111010110	==	80,854	//	9	// 15:	11101011110101111	//
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////
		
		String[][] strSqr = {{"1","1","1","1",},{"2","2","2","2",},{"3","3","3","3",},{"4","4","4","4",}};	//matrix string

		////////////////////////////////
		//welcome to my bonus homework//
		////////////////////////////////
		System.out.println("Choose a BONUS MATRIX QUESTION: ");
		System.out.println("");
		System.out.println("1. UPPER RIGHT/LOWER/EQUAL TRIANGELERS IN MATRIX");
		System.out.println("2. UPPER LEFT/LOWER/EQUAL TRIANGELERS IN MATRIX ");
		System.out.println("3. SORT BINARY MATRIX VALUES FROM MIN TO MAX on choosen N*N size");
		System.out.println("4. SORT BINARY MATRIX VALUES FROM MIN TO MAX on choosen N*M size");
		System.out.println("5. DRAW BINARY MATRIX, CONVERT, SORT FROM MIN TO MAX & REASSEMBLY on choosen N*M size");
		System.out.println("");
		System.out.println("Please ENTER now:");
		int choise = input.nextInt();
		System.out.println("");
		System.out.println("");
		while(!(choise<6 && choise>0))		//valid case pick!
		{
			System.out.println("");
			System.err.println("Unaccepable, pick again!!");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			main(args);
		}
		int n=0,i=0,j=0;
			///////////////////
			////switch menu////
			///////////////////
			char a=0;
			switch (choise) {
				case 1:	//check sum trianglers and pri disag
				trianglersInMatrix(strSqr);
				
				System.out.println("");
				System.out.println("Continue? (Y/N)");
				a = input.next().charAt(0); 
				while (a == 'Y'|| a == 'y' || a == 'N' || a == 'n') 
				{
					if (a == 'Y'|| a == 'y')
					{
						System.out.println("");
						System.out.println("");
						main(args);
					}
					if (a == 'N' || a == 'n')
					{
						System.out.println("");
						System.err.println("the system will TERMINATE...");
						System.exit(0);
					}
				}
				case 2:	//check sum trianglers and sec disag
					trianglersInMatrix2(strSqr);
					
					System.out.println("");
					System.out.println("Continue? (Y/N)");
					a = input.next().charAt(0); 
					while (a == 'Y'|| a == 'y' || a == 'N' || a == 'n') 
					{
						if (a == 'Y'|| a == 'y')
						{
							System.out.println("");
							System.out.println("");
							main(args);
						}
						if (a == 'N' || a == 'n')
						{
							System.out.println("");
							System.err.println("the system will TERMINATE...");
							System.exit(0);
						}
					}
				case 3:	//sort from given N*N Binary Matrix
					System.out.println("");
					System.out.println("if we deleted first left column:  ");	
					System.out.println("");
					System.out.println("");
					sortBinaryMatrixN_N(binMat); // right column deleted
					
					System.out.println("");
					System.out.println("if we deleted first right column: ");
					System.out.println("");
					System.out.println("");
					sortBinaryMatrixN_N(binMat2);	//left column deleted
					System.out.println("");
					System.out.println("");
					System.out.println("Continue? (Y/N)");	
					a = input.next().charAt(0);
					while (a == 'Y'|| a == 'y' || a == 'N' || a == 'n') 
					{
						if (a == 'Y'|| a == 'y')
						{
							System.out.println("");
							System.out.println("");
							main(args);
						}
						if (a == 'N' || a == 'n')
						{
							System.out.println("");
							System.err.println("the system will TERMINATE...");
							System.exit(0);
						}
					}
				case 4: //sort from given N*M Binary Matrix
				System.out.println("");
				System.out.println("if we deleted first left column:  ");	
				System.out.println("");
				System.out.println("");
				sortBinaryMatrixN_M(binMat); // right column deleted
				
				System.out.println("");
				System.out.println("if we deleted first right column: ");
				System.out.println("");
				System.out.println("");
				sortBinaryMatrixN_M(binMat2);	//left column deleted
				System.out.println("");
				System.out.println("");
				System.out.println("Continue? (Y/N)");	
				a = input.next().charAt(0);
				while (a == 'Y'|| a == 'y' || a == 'N' || a == 'n') 
				{
					if (a == 'Y'|| a == 'y')
					{
						System.out.println("");
						System.out.println("");
						main(args);
					}
					if (a == 'N' || a == 'n')
					{
						System.out.println("");
						System.err.println("the system will TERMINATE...");
						System.exit(0);
					}
				}
				
				case 5:	//GENERATE BINARY MATRIX GIVEN N*M FROM USER, CONVERT IT AND IN OPTION TO SORT IT!
					GenerateBinaryMatN_M(sqr);
					System.out.println("");
					System.out.println("");
					System.out.println("Continue? (Y/N)");	
					a = input.next().charAt(0);
					while (a == 'Y'|| a == 'y' || a == 'N' || a == 'n') 
					{
						if (a == 'Y'|| a == 'y')
						{
							System.out.println("");
							System.out.println("");
							main(args);
						}
						if (a == 'N' || a == 'n')
						{
							System.out.println("");
							System.err.println("the system will TERMINATE...");
							System.exit(0);
						}
					}
			}
}
	
	////////////////questions///////////////////////
	////case1////
	////////////
	private static void trianglersInMatrix(String[][] strSqr) {
		int sumUpper=0, sumLower=0, SumPriDiag=0, i=0, j=0,n=0;
		
		System.out.println("Please Enter The SIZE Of Our MATRIX:");
		System.out.println("");
		n = input.nextInt();
		if(n<3)
		{
			System.err.println("Theres No TRIANGULARES In This SIZE OF MATRIX.");
			System.out.println("");
			trianglersInMatrix(strSqr);
		}
		System.out.println("Please Enter The MAX RANGE OF VALUES IN MATRIX: (up to 100) ");
		System.out.println("");
		int p = input.nextInt();
		if( p>100)
			{
				System.err.println("Invalid number. UP TO 100!!");
				System.out.println("");
				trianglersInMatrix(strSqr);
			}
		int[][] sqr = new int[n][n];
		//draw values
		for(i=0; i<sqr.length; i++)
			for(j=0; j<sqr[i].length; j++)
				sqr[i][j]= (int)(Math.random()*p); // the range is users wish
			
	//first display matrix
		System.out.println("The Matrix Is: ");
	    System.out.println(" ");
		 for(i = 0; i < sqr.length; i++)
			{
			 	System.out.print("\t");
				for(j = 0; j < sqr[i].length; j++)
					System.out.print(sqr[i][j] + " ");					//print the matrix in tab between fields
				
				System.out.println();
			}
	// check upper triangler &central
		 for(i = 0; i < sqr.length; i++)
				for(j = 0; j < sqr[i].length ; j++)
				{
					if(i==j)
						SumPriDiag += sqr[i][j];	//sum primary diag
					if(i>j)
						sumLower+= sqr[i][j];		//sum upper left
					if(i<j)
						sumUpper+= sqr[i][j];		//sum lower right
				}
	// sums
		System.out.println("");
		System.out.println("SUM OF UP LEFT: "+sumUpper);					
		System.out.println("SUM OF LOW RIGHT: "+sumLower);
		System.out.println("SUM OF PRIMARY DIAG: "+SumPriDiag);
	// check either all equal || lower-upper equal || upper-central equal || lower-central equal
		System.out.println("");
		System.out.print("\t");
		if(SumPriDiag==sumUpper && sumUpper== sumLower)
			System.out.println("ALL SUM's ARE EVEN!!!");
		if(SumPriDiag==sumUpper)
			System.out.println("PRIMARY DIAG SUM EQUAL TO UPPER LEFT SUM!!!");
		if(SumPriDiag==sumLower)
			System.out.println("PRIMARY DIAG SUM EQUAL TO LOWER RIGHT SUM!!!");
		if(sumUpper== sumLower)
			System.out.println("PRIMARY UPPER LEFT SUM EQUAL TO LOWER RIGHT SUM!!!");
		if(SumPriDiag==sumLower && SumPriDiag==sumUpper)
			System.out.println("AMAIZING ALL SUM'S ARE EQUAL!!!");
		if(SumPriDiag!=sumLower && SumPriDiag!=sumUpper && sumUpper!=sumLower )
			System.out.println("NO EQUAL BETWEEN SUM");
	}
	
	///////////////
	////case 2////
	/////////////
	private static void trianglersInMatrix2(String[][] strSqr) {
		int sumUpper=0, sumLower=0, SumSecDiag=0, i=0, j=0,n=0;
		
		System.out.println("Please Enter The SIZE Of Our MATRIX: (no less than 3)");
		System.out.println("");
		n = input.nextInt();
		if(n<3)
		{
			System.err.println("Theres NO TRIANGULARES In This SIZE OF MATRIX.");
			System.out.println("");
			trianglersInMatrix(strSqr);
		}
		System.out.println("Please Enter The MAX RANGE OF VALUES IN MATRIX: (up to 100) ");
		System.out.println("");
		int p = input.nextInt();
		if( p>100)
			{
				System.err.println("Invalid number. UP TO 000 ONLY!!");
				System.out.println("");
				trianglersInMatrix(strSqr);
			}
		int[][] sqr = new int[n][n];
		//draw values
		for(i=0; i<sqr.length; i++)
			for(j=0; j<sqr[i].length; j++)
				sqr[i][j]= (int)(Math.random()*p); // the range is users wish
			
	//first display matrix
		System.out.println("The Draw Matrix Is: ");
	    System.out.println(" ");
		 for(i = 0; i < sqr.length; i++)
			{
			 	System.out.print("\t");
				for(j = 0; j < sqr[i].length; j++)
					System.out.print(sqr[i][j] + " ");					//print the matrix in tab between fields
				
				System.out.println();
			}
	// check upper triangler &sec diag
		 for(i = 0; i<sqr.length ; i++)
		 		for(j = 0; j<sqr[i].length ;j++)
				{
					if(j==sqr.length-1-i)
						SumSecDiag += sqr[i][j];	//sum secondary diag
					if(j>sqr.length-1-i)
						sumLower += sqr[j][i]; 			//sum lower right
					if(j<sqr.length-1-i)
						sumUpper+= sqr[i][j];		//sum upper left
				}

	//test sums
		System.out.println("");
		System.out.println("SUM OF UP LEFT: "+sumUpper);					
		System.out.println("SUM OF LOW RIGHT: "+sumLower);
		System.out.println("SUM OF SEC DIA: "+SumSecDiag);
	// check either all equal || lower-upper equal || upper-central equal || lower-central equal
		System.out.println("");
		System.out.print("\t");
		if(SumSecDiag==sumUpper && sumUpper== sumLower)
			System.out.println("ALL SUM's ARE EVEN!!!");
		if(SumSecDiag==sumUpper)
			System.out.println("SECONDARY DIAG SUM EQUAL TO UPPER LEFT SUM!!!");
		if(SumSecDiag==sumLower)
			System.out.println("SECONDARY DIAG SUM EQUAL TO LOWER RIGHT SUM!!!");
		if(sumUpper== sumLower)
			System.out.println("UPPER LEFT SUM EQUAL TO LOWER RIGHT SUM!!!");
		if(SumSecDiag==sumLower && SumSecDiag==sumUpper)
			System.out.println("AMAIZING ALL SUM'S ARE EQUAL!!!");
		if(SumSecDiag!=sumLower && SumSecDiag!=sumUpper && sumLower!=sumUpper)
			System.out.println("NO EQUAL BETWEEN SUM");
	}
	
	
	
		///////////////
		////case 3////
		/////////////
	private static void sortBinaryMatrixN_N(int[][] binMat) {
		
		System.out.println("Enter SIZE of Matrix: ");
		int n= input.nextInt();
		if(n<=0 && n>16)
		{
			System.out.println("up to 16 ONLY!");
			sortBinaryMatrixN_N(binMat);
		}
		int i=0, j=0, bin2int=0, k=0, p=0;
		int[] arr= new int[n+1];
		String rowSum="", mama="";
		//test binery mat
		/*for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				if(!(binMat[i][j] == 0 || binMat[i][j] == 1))
						System.err.println("This Matrix has a non BINARY NUMBER");*/
		
		System.out.println("The Converted Values Are: \n");
		for(i=0; i<n; i++)
		{
			System.out.print("\t");
			rowSum="";
			bin2int=0;
			for(j=0; j<n; j++)
				rowSum+=String.valueOf(binMat[i][j]);	
			
			bin2int = Integer.parseInt(rowSum,2);			//bin converter
			p=i;
			for(k=i; k<p+1; ++k)
				arr[k]=bin2int;
			
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("After SORT Integer Values From MAX TO MIN: ");
		Arrays.sort(arr);

		System.out.println("");
		System.out.print("\t");
		for(i=0;i<n;i++)
			System.out.print(arr[n-i]+"\t");
		
		System.out.println("");
		System.out.println("");
		System.out.println("\nNew Sorted Binary Matrix Is: ");
		System.out.println("");
		for(k=n; k>=1; k--)
		{
			System.out.print("\t");
			mama=Integer.toBinaryString(arr[k]);
			p=mama.length();
			while(p<16)
			{
			System.out.print("0");
			p++;
			}
						System.out.println(mama);
		}
		System.out.println("");
	}	
///////////////
////case 4////
/////////////
private static void sortBinaryMatrixN_M(int[][] binMat) {
		
		System.out.println("Enter numbers of ROWS: ");
		int n= input.nextInt();
		if(n<=0 && n>16)
			{
				System.out.println("up to 16 ONLY!");
				sortBinaryMatrixN_M(binMat);
			}
		System.out.println("");
		System.out.println("Enter numbers of COLUMNS: ");
		int m= input.nextInt();
		if(m<=0 && m>16)
			{
				System.out.println("up to 16 ONLY!");
				sortBinaryMatrixN_M(binMat);
			}
		System.out.println("");
		int i=0, j=0, bin2int=0, k=0, p=0;
		int[] arr= new int[n+1];
		String rowSum="", mama="";
		//first check if all a binary numbers 0,1
		for(i=0; i<n; i++)
			for(j=0; j<m; j++)
				if(!(binMat[i][j] == 0 || binMat[i][j] == 1))
						System.err.println("This matrix has a non BINARY NUMBER");

		System.out.println("the converted values are: \n");
		for(i=0; i<n; i++)
		{
			rowSum="";
			bin2int=0;
			for(j=0; j<m; j++)
				rowSum+=String.valueOf(binMat[i][j]);	
			
			bin2int = Integer.parseInt(rowSum,2);			//bin converter
			
			p=i;			
			System.out.print("\t");
			for(k=i; k<p+1; ++k)
				arr[k]=bin2int;
			
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("After SORT Integer Values From MAX TO MIN: ");
		Arrays.sort(arr);

		System.out.println("");
		System.out.print("\t");
		for(i=0;i<n;i++)
			System.out.print(arr[n-i]+"\t");

		System.out.println("");
		System.out.println("");
		System.out.println("\nNew Sorted Binary Matrix Is: ");
		System.out.println("");
		for(k=n; k>0; k--)
		{
			System.out.print("\t");
			mama=Integer.toBinaryString(arr[k]);
			p=mama.length();
			while(p<m)
			{
			System.out.print("0");
			p++;
			}
						System.out.println(mama);
		}
		System.out.println("");
	}	
	
	////////////
	///case 5//
	//////////
private static void GenerateBinaryMatN_M(int[][] sqr) {
	/// get values from user
	System.out.println("");
	System.out.println("Please Enter SIZE OF ROWS: ");
	int n = input.nextInt();
	if(n<=0)
	{
		System.out.println("NO ZERO OR LESS THE ZERO");
		GenerateBinaryMatN_M(sqr);
	}
	System.out.println("");
	System.out.println("Please Enter SIZE COLUMNS: ");
	int m = input.nextInt();
	if(m<=0 && m>31)
	{
		if(m<=0)
			System.out.println("NO ZERO OR LESS THE ZERO");
		if(m>31)
			System.out.println("INTIGER LIMIT!!!! BETWEEN 1 and 31 ONLY!!");

		GenerateBinaryMatN_M(sqr);
	}
	 sqr=new int[n][m]; // Creating the Magic Matrix
     int i=0,j=0, bin2int=0, k=0, p=0;
		int[] arr= new int[n+1];
		String rowSum="", mama="";

     for(i=0;i<n;i++)	//draw a binary matrix
             for(j=0;j<m;j++)
            	 sqr[i][j] = (int)(Math.round(Math.random())); // 0 and 1 only!
     	
		for(i=0; i<n; i++)	//test if all numbers in matrix are inded 0 or 1
			for(j=0; j<m; j++)
				if(!(sqr[i][j] == 0 || sqr[i][j] == 1))
						System.err.println("This matrix has a non BINARY NUMBER");
         			
                 	//first display matrix
                 		System.out.println("The Matrix is: ");
                 	    System.out.println(" ");
                 		 for(i = 0; i < sqr.length; i++)
                 			{
                 			 	System.out.print("\t");				// move matrix with tab
                 				for(j = 0; j < sqr[i].length; j++)
                 					System.out.print(sqr[i][j] + "");	//print the matrix 

                 				System.out.println();
                 			}
        System.out.println("");
		System.out.println("");
		System.out.println("Now Lets Covert, Sort Converted Values, Convert back & SHOW SORTED BINARY MATRIX");
        System.out.println("");
		System.out.println("");
		System.out.println("The Converted Values Are: \n");
		System.out.print("\t");
		for(i=0; i<n; i++)
		{
			rowSum="";
			bin2int=0;
			for(j=0; j<m; j++)
				rowSum+=String.valueOf(sqr[i][j]);	
			
			bin2int = Integer.parseInt(rowSum,2);			//bin converter
			
			p=i;
			for(k=i; k<p+1; ++k)
				arr[k]=bin2int;
			
			System.out.print(arr[i]+"\t");
		}
		
		Arrays.sort(arr);

	  System.out.println("");
		System.out.println("");
		System.out.println("After SORT Integer Values From MAX TO MIN: ");
		System.out.println("");
		System.out.print("\t");
		for(i=0;i<n;i++)
			System.out.print(arr[n-i]+"\t");

		System.out.println("");
		System.out.println("");
		System.out.println("\nConverted Binary values in matrix from MAX TO MIN: ");
		System.out.println("");
		for(k=n; k>=1; k--)
		{	
			System.out.print("\t");
			mama=Integer.toBinaryString(arr[k]);
			p=mama.length();
			while(p<m)
			{
			System.out.print("0");
			p++;
			}
						System.out.println(mama);
		}
		System.out.println("");         		 
	}
}


