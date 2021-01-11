//Using the forEach function defined for an array, find the sum of the array of numbers.

function que5(){

    arr=[43,22,65,75,32]

    function add_all(arr)
    {
        var sum=0;
        for(var i in arr)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    var result=add_all(arr);
    console.log(result);
}
que5();