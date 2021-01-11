//Write a JavaScript program to convert temperatures to and from celsius, fahrenheit.
// [ Use the formula : c/5 = (f-32)/9, where c = temperature in celsius and f = temperature in fahrenheit]
function que6(){
    function convertTempToFah(c){
        var f = (c*9)/5 + 32;
        console.log("Temp. in Fahrenheit: "+f);
    }

    function convertTemptoCel(f){
        var c=((f-32)*5)/9;
        console.log("Temp. in Celcius: "+c);
    }
    convertTempToFah(34);
    convertTemptoCel(78);
}
que6(6);