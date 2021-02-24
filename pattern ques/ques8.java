import java .util.Scanner;
import java.io.*;
class main{
public static void main(String[]args){
int i,k,j;
Scanner sc= new Scanner (System.in);
//i=sc.nextInt();
int n=sc.nextInt();
for(i=0;i<n;i++){
for(k=0;k<n-i-1;k++ ){
System.out.print(" ");
}
for(j=0;j<2*i+1;j++){
System.out.print(j+1);
}
System.out.println();
}
}

//sc.close();
}
