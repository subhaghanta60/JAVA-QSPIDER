class Primes
{
public static void main(String [] args){

int cnt=0;

for(int i=2;i<=100;i++){
boolean flag=true;
for(int j=2;j<i;j++){
if(i%j==0){
flag=false;
break;
}
}

if(flag==true){
cnt++;
System.out.println(i +" is a Prime Number");

}
}
System.out.println("The No of Prime Number is= " + cnt);

}
}