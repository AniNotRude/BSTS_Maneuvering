import java.util.*;    
class Main{   
     
// Function for computing nCr    
public static int nCr(int n, int r)        
{    
    return fact(n) / (fact(r) * fact(n - r));        
}    
         
// Function to find factorial of a number    
public static int fact(int n)    
{    
    int res = 1;
     
    for(int i = 2; i <= n; i++)        
        res = res * i;        
    return res;        
}    
         
// Function for counting the number        
// of ways to reach (m, n) without        
// visiting (x, y)        
public static int countWays(int m, int n,
                            int x, int y)        
{    
    return nCr(m + n, m) -
           nCr(x + y, x) *
           nCr(m + n - x - y, m - x);        
}
 
// Driver code
public static void main(String[] args)
{    
     
    // Given Dimensions of Matrix    
    int m = 5;        
    int n = 4;        
             
    // Cell not to be visited    
    int x = 3;        
    int y = 2;        
             
    // Function Call    
    System.out.println(countWays(m, n, x, y));    
}    
}
