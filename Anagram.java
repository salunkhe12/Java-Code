class Anagram
{
 public static void main(String args [])
 {
  String a = "HEllo";
  String b = "eLLoh";

  String str1 = a.toLowerCase();
  String str2 = b.toLowerCase();

  if(str1.length() == str2.length())
  {
   char x[] = str1.toCharArray();
   char y[] = str2.toCharArray(); 
   Arrays.sort(x);
   Arrays.sort(y);

   Boolean result = Arrays.equals(x, y);
  
   if(result)
    System.out.println("it is Anagram");
   else
    System.out.println("it is not Anagram");
  }
  else
  {
   System.out.println("it is not Anagram");
  }  
 } 
}