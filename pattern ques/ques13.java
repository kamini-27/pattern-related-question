import java .util.Scanner;
import java.io.*;
class main{
public static void main(String[]args){
int i,k,j;
Scanner sc= new Scanner (System.in);
//i=sc.nextInt();
int n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<n-i;j++)
System.out.print(" ");
for(k=0;k<2*i+1;k++)

System.out.print("*");
System.out.println();
}
for(i=0;i<n-1;i++){
for(j=0;j<=i+1;j++)
System.out.print(" ");

for(k=0;k<2*n-2*i-3;k++)
System.out.print("*");
System.out.println();
}
}
}