function length_of_array(arr)
{
    var count = arr.filter(function (x)
            {
                if(x != "" || x != null)
                    return true;
                else
                    return false;
            });
    return count.length;
}

var array1 = [2,,8,5,9,,6,,undefined,1,0,null,3];

console.log(length_of_array(array1));