//Write a javascript function that converts a given amount of money into coins of denominations (1, 2, 5, 10 and 25).
// [function convert_to_coins(amount) {...}]. You may choose to print the coin denominations used on the console.
// E.g. convert_to_coins(87) should print 25 25 25 10 2.

function convert_to_coins(num)
{
    var coins=num;
    console.log(num+" coins are: ")
    while(coins != 0)
    {
        if(coins>=25)
        {
            coins=coins-25;
            console.log(25);
        } 
        else if(coins>=10)
        {
            coins=coins-10;
            console.log(10)
        }
        else if(coins>=2)
        {
            coins=coins-2;
            console.log(2);
        }
        else{
            coins=coins-1;
            console.log(1)
        }

    }
  
}
convert_to_coins(87);