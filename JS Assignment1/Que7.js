//Write a factorial function that returns the factorial of a given number, 
//n. Make sure you return the calculated value and not just print it. [function factorial(n){...}] 

function factotial(n)
{
    var fact=1;

    for(i=1; i<=n; i++)
    {
        fact = fact*i;
    }
    return fact;
}
var f=factotial(4);
console.log("Factorial: "+f);