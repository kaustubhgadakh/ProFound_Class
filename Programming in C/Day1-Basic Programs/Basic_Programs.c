// 1. Write a program to print Hello World on output screen.

//#include<stdio.h>
//
//int main(){
//	printf("Hello World !!");
//}

// --------------------------------------------------

//2. WAP to calculate Simple interest.
 
// Simple Interest = (P × R × T)/100  
//where P = Principal Amount, R = Rate per Annum, T = Time (years)  

#include<stdio.h>  
int main()   
    {   
        float P , R , T , SI ;  
       	P =34000; 
	   	R =30;  
		T = 5;  
        SI  = (P*R*T)/100; 
		  
        printf("\n\n Simple Interest is : %f", SI);  
    } 


