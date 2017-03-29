import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
	
	public static void combiGenerate(int n){
		int[] consonants = {98,99,100,102,103,104,106,107,108,109,110,112,113,114,115,116,118,119,120,122};
		int[] vowels = {97,101,105,111,117};

		int password[] = new int[n];
		combination(password,consonants,vowels,0,(consonants.length-1),0,(vowels.length-1),0,n,false);
		combination(password,consonants,vowels,0,(consonants.length-1),0,(vowels.length-1),0,n,true);
	}

	public static void combination(int password[],int consonants[],int vowels[],int start,int end,int startV,int endV,int index,int n,boolean flag){
		if(index == n){
			display(password);
			return;
		}
		if(flag)
			for(int i=0;i<=end; i++){
				password[index]=consonants[i];
				flag = false;
				combination(password,consonants,vowels,i+1,end,startV,endV,index+1,n,flag);
			}
		else{
			for(int i=0;i<=endV; i++){
				password[index]=vowels[i];
				flag = true;
				combination(password,consonants,vowels,start,end,i+1,endV,index+1,n,flag);
			}
		}
	}

	public static void display(int[] x){
		char c;
		for(int i=0;i<x.length;i++){
			c = (char)(x[i]);
			System.out.print(c);
		}
		System.out.println();
	}

    public static void main(String[] args) {
    	System.out.println(java.time.LocalTime.now());
        Scanner in = new Scanner(System.in);
        int n = 6;//in.nextInt();
        combiGenerate(n);
        System.out.println(java.time.LocalTime.now());
    }
}

/*
	a = 97
	z = 122
	y = 121
*/

	/*################################



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void combiGenerate(int n){
		int[] consonants = {98,99,100,102,103,104,106,107,108,109,110,112,113,114,115,116,118,119,120,122};
		int[] vowels = {97,101,105,111,117};

		int password[] = new int[n];
		combination(password,consonants,vowels,0,(consonants.length-1),0,vowels.length-1,0,n,false);
		combination(password,consonants,vowels,0,(consonants.length-1),0,vowels.length-1,0,n,true);
	}

	public static void combination(int password[],int consonants[],int vowels[],int start,int end,int startV,int endV,int index,int n,boolean flag){
		if(index == n){
			display(password);
			return;
		}
		if(flag)
			for(int i=start;i<=end && (end-i+1) >= (n-index); i++){
				password[index]=consonants[i];
				flag = false;
				combination(password,consonants,vowels,i+1,end,startV,endV,index+1,n,flag);
			}
		else{
			for(int i=startV;i<=endV && (endV-i+1) >= (n-index); i++){
				password[index]=vowels[i];
				flag = true;
				combination(password,consonants,vowels,start,end,i+1,endV,index+1,n,flag);
			}
		}
	}

	public static void display(int[] x){
		char c;
		for(int i=0;i<x.length;i++){
			c = (char)(x[i]);
			System.out.print(c);
		}
		System.out.println();
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        combiGenerate(n);
    }
}




	#################################*/