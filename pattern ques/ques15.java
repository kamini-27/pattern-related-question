import java .util.Scanner;
import java.io.*;
class main{
public static void main(String[]args){
int i,k,j;
Scanner sc= new Scanner (System.in);
//i=sc.nextInt();
int n=sc.nextInt();
for(i=0;i<n;i++){
for(j=i;j<n-1;j++)
System.out.print(" ");
for(k=1;k<=i;k++)
System.out.print(k+"");
for(int l=i-1;l>=1;l--)
System.out.print(l+"");
System.out.println();
}
for(i=n;i>=1;i--){
for(j=i;j<n-1;j++)
System.out.print(" ");
for(k=1;k<=i;k++)
System.out.print(k+" ");
for(int l=i-1;l>=1;l--)
System.out.print(l+"");
System.out.println();
}
}
}