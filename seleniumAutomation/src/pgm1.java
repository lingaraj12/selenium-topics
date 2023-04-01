import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
	
int c=a;
int a1=b;

//int a=11;
//if(a==10)
//{
//	System.out.println("true");
//}
//else
{
//	System.out.println("not ture");
}
//concat 2 String
  //String str="Lingaraj";
  //String str1="Chitragar";
  //System.out.println(str+str1);
  //System.out.println(str.concat(str1));
	
//reverse String
//  String str="Lingaraj";
//  StringBuilder sb=new StringBuilder(str);
//  System.out.println(str);
//   System.out.println(sb.reverse());
  
String str="gadag";
StringBuilder sb= new StringBuilder(str);
String poly=sb.reverse().toString();
	System.out.println(poly);
if(str.equals(poly))
{System.out.println("given string is polyndrome");}
	else {
		System.out.println("given string is not polyndrome");
	}

//i/p=Qa circle o/p=circle Qa	
//     String str="Qa circle";
//     String[]Str1=str.split(" ");
//     String result=" ";
//     for(int i=Str1.length-1; i>=0; i--)
//     {
//	   result=result+" "+Str1[i];
//     }
//     System.out.println("i/p is:"+str);
//     System.out.println("o/p is:"+result.trim());
	
//     String str="Qa circle";
//     String[]str1=str.split(" ");
//	str1.
//	for (String a : str1)
//       System.out.println(a);

//using collections	
//	  List<String>str=new ArrayList<String>();
//	  Collections.addAll(str, "Qa","Circle");
//	  System.out.println(str);
//	  Collections.reverse(str);
//	  System.out.println(str);	


//factorial
//int i,fact=1;  
//int number=5;//It is the number to calculate factorial    
//for(i=1;i<=number;i++){    
//    fact=fact*i;    
//}    
//System.out.println("Factorial of "+number+" is: "+fact);    
	
//random no
//int min = 200;  
//int max = 400;  
////Generate random double value from 200 to 400   
//System.out.println("Random value of type double between "+min+" to "+max+ ":");  
//double a = Math.random()*(max-min+1)+min;   
//System.out.println(a);  
////Generate random int value from 200 to 400   
//System.out.println("Random value of type int between "+min+" to "+max+ ":");  
//int b = (int)(Math.random()*(max-min+1)+min);  
//System.out.println(b);  
	
///pattern right angle
////i for rows and j for columns      
////row denotes the number of rows you want to print  
//int i, j, row=6;   
////outer loop for rows  
//for(i=0; i<row; i++)   
//{   
////inner loop for columns  
//for(j=0; j<=i; j++)   
//{   
////prints stars   
//System.out.print("* ");   
//}   
////throws the cursor in a new line after printing each line  
//System.out.println();   
//
////left angle triangle
////i for rows and j for columns      
////row denotes the number of rows you want to print  
//int i, j, row = 6;       
////Outer loop work for rows  
//for (i=0; i<row; i++)   
//{  
////inner loop work for space      
//for (j=2*(row-i); j>=0; j--)         
//{  
////prints space between two stars      
//System.out.print(" ");   
//}   
////inner loop for columns  
//for (j=0; j<=i; j++ )   
//{   
////prints star      
//System.out.print("* ");   
//}   
////throws the cursor in a new line after printing each line  
//System.out.println();   
////piramid
////i for rows and j for columns      
////row denotes the number of rows you want to print  
//int i, j, row = 6;       
////Outer loop work for rows  
//for (i=0; i<row; i++)   
//{  
////inner loop work for space      
//for (j=row-i; j>1; j--)   
//{  
////prints space between two stars  
//System.out.print(" ");   
//}   
////inner loop for columns  
//for (j=0; j<=i; j++ )   
//{   
////prints star      
//System.out.print("* ");   
//}   
////throws the cursor in a new line after printing each line  
//System.out.println();
////ascii values
//// character whose ASCII value to be found  
//char ch1 = 'a';  
//char ch2 = 'b';  
//// variable that stores the integer value of the character  
//int asciivalue1 = ch1;  
//int asciivalue2 = ch2;  
//System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
//System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  
////or
//int ch1 = 'a';  
//int ch2 = 'b';  
//System.out.println("The ASCII value of a is: "+ch1);  
//System.out.println("The ASCII value of b is: "+ch2);  
//
////all ascii values	
//for(int i = 0; i <= 255; i++)  
//{  
//System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
//}  

//highest no
//i/p=12,45,67,88,99,1,2,34  o/p=99
	List<Integer>in=new ArrayList<Integer>();
	Collections.addAll(in, 12,45,67,88,99,1,2);
System.out.println(Collections.max(in));
System.out.println(Collections.min(in));

//sorting ascending
//List<Integer>in=new ArrayList<Integer>();
//Collections.addAll(in, 12,45,67,88,99,1,2);
//Collections.sort(in);
//using for each loop for line by line
//for(Integer in1:in)
//{
//	System.out.println(in1);
//}
//descending
//List<Integer>in=new ArrayList<Integer>();
//Collections.addAll(in, 12,45,67,88,99,1,2);
//Collections.sort(in, Collections.reverseOrder());
//using for each loop for line by line
//for(Integer in1:in)
//{
	//System.out.println(in1);
//
//}
//find the index of element
//ArrayList<String>str=new ArrayList<String>();
//Collections.addAll(str, "a","b","c","d");
//int ab=str.indexOf("c");
//System.out.println(ab);

//copy elements from one array to another	
//ArrayList<String>str1=new ArrayList<String>();
//Collections.addAll(str1, "a","b","c","d");
//System.out.println(str1);
//ArrayList<String>str2=new ArrayList<String>();
//Collections.addAll(str2, "aa","bb","cc","dd");
//System.out.println(str2);
//Collections.copy(str1, str2);
//System.out.println(str2);

//swaping 2 elements
//ArrayList<String>str1=new ArrayList<String>();
//Collections.addAll(str1, "a","b","c","d");	
// System.out.println(str1);
//int ab=str1.indexOf("b");
//int bc=str1.indexOf("d");
//Collections.swap(str1, ab, bc);
//System.out.println(str1);

//convert hashset to array	
//Set<String>str=new HashSet<String>();
//Collections.addAll(str, "aa","bb","cc","dd");
//String[]array=new String[str.size()];
//str.toArray(array);
//System.out.println(array);
//for(String str11:str)
//{
//	System.out.println(str11);
//}

//convrt set to any set and list
//Set<String>str=new HashSet<String>();
//Collections.addAll(str, "aa","bb","cc","dd");
//System.out.println(str);
//to tree set
//Set<String>str1=new TreeSet<String>(str);
//System.out.println(str1);
//to linked list
//LinkedList<String>str2=new LinkedList<String>(str);
//System.out.println(str2);
//to arraylist
//ArrayList<String>str3=new ArrayList<String>(str);
//System.out.println(str3);

//i/p=2,3,4,5  o/p=4,5,2,3	
	//ArrayList<Integer>in=new ArrayList<Integer>();
 //Collections.addAll(in, 2,3,4,5);
// System.out.println(in);
// for(int i=0; i<in.size()/2; i++ )
//   {
	//Collections.swap(in, i, i+2);
// }
// System.out.println(in);
	
	
	
	
	
	}

}
