//Write a javascript function named is_integer which checks if the passed argument is an integer.
// You can use any mathematical operator or functions defined in the Math object.

function is_integer(n)
{
    var num = Number.isInteger(n)
     if(num==true)
        console.log("Entered number is Integer");
    else
        console.log("Invalid Input Format");
}

is_integer(45);