//Write a Javascript program to sort elements of an array using sorting algorithm

function sortArr(arr)
{
    var temp=0;
    var i,j;
    for(i=0;i<arr.length-1;i++)
    {
        for(j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;
}
var myarr=[3,6,1,5,0,3]
console.log(sortArr(myarr));