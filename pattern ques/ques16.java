import java .util.Scanner;
import java.io.*;
class main{
public static void main(String[]args){
int i,k,j;
Scanner sc= new Scanner (System.in);
//i=sc.nextInt();
int n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<n-i-1;j++){
System.out.print("");
}
for(k=0;k<i+1;k++){
System.out.print(k+1);
}
for(int l=i;l>0;l--){
System.out.println(l);

}
System.out.println();
}
for(i=1;i<n;i++){
for(j=0;j<i;j++){
System.out.print("");
}
for(k=0;k<n-i;k++){
System.out.print(k+1);
}
for(int l=n-i-1;l>0;l--){
System.out.println(l);
}
System.out.println();
}
}
}