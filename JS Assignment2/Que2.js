//Write a javascript function named reverse which takes a string argument
// and returns the reversed string.

function reverseString(str) {
    var newString = "";
    for (var i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    console.log(newString);
    //return newString;
}
reverseString('Hello World...!!');