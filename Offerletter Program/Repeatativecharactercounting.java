class Repeatativecharactercounting
{
public static void main(String [] args)
{
String s1="java";
int count=0;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i) =='a'){
count++;
}
}
System.out.println(count);
}
}