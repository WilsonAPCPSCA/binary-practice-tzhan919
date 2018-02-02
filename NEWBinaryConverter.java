import java.util.Scanner;
public class NEWBinaryConverter
{
    public static void main(String[] args) 
    {
    	int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you would like to convert into binary:");
        number = in.nextInt();
       String binary=convertBinary(number);
        System.out.println("The number "+number+" is equivalent to "+binary+" in binary.");
        
    }	
    public static String convertBinary (int  input){
    	int y;
        String x = ""; 
    	while(input > 0)
         {
             y = input % 2;   
             x = y + x;
             input = input / 2;
         }
         return x;
         
    }
}