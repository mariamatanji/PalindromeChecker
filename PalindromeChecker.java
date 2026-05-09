import java.util.Scanner;
public class PalindromeChecker{
  
    public static boolean isPalindrome(String aString){
    if(aString ==null){
        return false;
    }
    String cleaned = aString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left =0;
    int right = cleaned.length() -1;
    while(left < right){
        if(cleaned.charAt(left) != cleaned.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    
    }


 public static boolean isPunctuation(char aCharacter){
     return(aCharacter == '.') || (aCharacter == ',') || (aCharacter =='?') ||
     (aCharacter == '!') || (aCharacter == '"');
 }
 
public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("this program determines whether a string");
    System.out.println("is a palindrome. A palindrome is spelled ");
    System.out.println("The same from the left to right as it is from right to left,");
    
    System.out.println("If we ignore punctuation, spaces, and case.");
    System.out.print("Enter a string that you want to check (or enter ! to exit):");
    String aString = keyboard.nextLine();
    while (!aString.equals("!")){
        if (isPalindrome(aString)){
            System.out.println(aString +" is a palindrome!");
            }else{
            System.out.println(aString + "is not palindrome!");
            } 
        System.out.print("Enter a string that you want to check (or enter ! to exit):");
        aString = keyboard.nextLine();
    }
    
    System.out.println("Done!");

 }
}
