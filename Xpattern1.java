# Xpattern1
import java.io.*;
import java.util.*;
public class Xpattern1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[][]=new int[][];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if((i==j)||(i+j)==(n-1))
System.out.println(arr[i][j]);
else
System.out.println(" ");
}
System.out.println("");
}
}
}
