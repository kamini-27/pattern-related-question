import java .util.Scanner;
import java.io.*;
class main{
public static void main(String[]args){
int i,k,j;
Scanner sc= new Scanner (System.in);
//i=sc.nextInt();
int n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<n-i-1;j++)
System.out.print(" ");
for(k=0;k<=i;k++)
System.out.print(k+1);
for(int l=i;l>0;l--)
System.out.print(l);
System.out.println();
}
for(i=0;i<n-1;i++){
for(j=0;j<=i;j++)
System.out.print(" ");
for(k=0;k<n-i;k++)
System.out.print(k);
for(j=0;j<n-i-2;j++)
System.out.print(n-j-i-2);
System.out.println();
}
}
}