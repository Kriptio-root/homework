package magicksquare;

import java.util.Scanner;

public class magicksquare {

	public static void main(String[] args) {
/////////////////////////////////////////
////n must be eaqual to mat n*n/////////
///////////////////////////////////////
int [][] square = {

{16, 3, 2, 13},
{5, 10, 11, 8},
{9, 6, 7, 12 },
{4, 15, 14, 1}
}; 
/////////////////////////////////////////////
String[][] matrix = {{"1","2","1","3",},{"7","6","5","2",},{"5","6","3","5",},{"3","10","9","5",}};
// Works only when n is odd 
Scanner sc=new Scanner(System.in);
System.out.println("Enter N : ");
int n=sc.nextInt();	 
System.out.println("Choose func: ");
System.out.println("1.Draw magic square ");
System.out.println("2.Draw X S.T.A.R.S.");
System.out.println("3.The most num ");
System.out.println("4.If magic square? ");
int num=sc.nextInt();	
sc.close();

switch(num) {
case 1:
generateSquare(n);
break;
case 2:
generateStars(n);
break;
case 3:
findDuplicate(matrix);
break;
case 4:
System.out.println("Is magic square: " + magicSquare(square));   
//isMagicSquare(mat);
break;
default:
// code block
}

} 

// Function to generate odd sized magic squares 
static void generateSquare(int n) 
{ 
int[][] magicSquare = new int[n][n]; 

// Initialize position for 1 
int i = n/2; 
int j = n-1; 

// One by one put all values in magic square 
for (int num=1; num <= n*n; ) 
{ 
if (i==-1 && j==n) //3rd condition 
{ 
j = n-2; 
i = 0; 
} 
else
{ 
//1st condition helper if next number  
// goes to out of square's right side 
if (j == n) 
j = 0; 

//1st condition helper if next number is  
// goes to out of square's upper side 
if (i < 0) 
i=n-1; 
} 

//2nd condition 
if (magicSquare[i][j] != 0)  
{ 
j -= 2; 
i++; 
continue; 
} 
else
//set number 
magicSquare[i][j] = num++;  

//1st condition 
j++;  i--;  
} 

// print magic square 
System.out.println("The Magic Square for "+n+":"); 
System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
for(i=0; i<n; i++) 
{ 
for(j=0; j<n; j++) 
System.out.print(magicSquare[i][j]+" "); 
System.out.println(); 
} 
} 
/////////////////////////////////////////////////
static void generateStars(int n) 
{ 

char c = '*';



int k=n*2-1;

for(int i=1;i<=k;i++)
{

for(int j=1;j<=k;j++)

{      if(j==i || j==k-i+1)
   System.out.print(c);
    System.out.print(" ");
     


}


System.out.println();

}            
}
///////////////////////////////////////////////////////////////////
public static void findDuplicate(String[][] matrix){
String strArr[] = new String[(matrix.length)*(matrix[0].length)];
int count = 0;
for(int i = 0; i < matrix.length; i++){
	
for(int j = 0; j < matrix[0].length; j++){
	
for(int k = 0; k < matrix.length; k++){
	
for(int l = 0; l < matrix[0].length; l++){
	
if((i!=k || j!=l)){
	
if(matrix[i][j] == matrix[k][l]){
	
int x = 0;
boolean flag = false;
while(strArr[x] != null){
    if(null != matrix[i][j] && matrix[i][j].equals(strArr[x])){
        flag = true;                                    
    }
    x++;
}
if(flag==false){
    strArr[count] = matrix[i][j];
    count++;
}
}
}
}
}
}
}
System.out.println(count);
}
private static boolean magicSquare(int[][] square){

//calculate the sum of the first row and assign it to n
int n = sumOfRow(square[0]);

// sum of rows check against n
for (int[] row : square)
{
int sum = sumOfRow(row);        
if (sum != n)
return false;   
}
int sum = 0;

//sum of colums check against n
for(int i = 0; i < square.length; i ++){
sum = 0;
for(int j = 0; j < square.length; j++){
sum += square[j][i]; 
}
if(sum != n){
return false;
}
}

//diagonal from top left corner to right bottom corner
sum = 0;
for (int i = 0; i < square.length; i++)
{
sum += square[i][i];
}
if (sum != n)
return false;

//diagonal from top right to bottom left corner 
sum = 0;
for (int i = 0; i < square.length; i++)
{
sum += square[i][square.length - 1 - i];
}
if (sum != n)
return false;
return true;
} 

//returns the sum of the elements in the row
private static int sumOfRow(int[] row){
int sum = 0;
for(int el : row){
sum += el;
}
return sum;

	}

}
