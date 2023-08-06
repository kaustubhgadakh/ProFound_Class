// WAP to compare two strings using strcmp ()

#include<stdio.h>
#include<string.h>

int main()
{
    int str1 ="hi";
    int str2 = "i";

    int value= strcmp(str1,str2);  

    if(value==0){
        printf("strings are same");
    }  
    else{
        printf("strings are not same");
    }      
    return 0;  
}  
