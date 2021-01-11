//Given a javascript array of objects having a radius property as shown [{radius: 5}, {radius: 9}, {radius: 2}],
// write a comparator function to sort it.

var arrObj =[
    {radius:5},
    {radius:9},
    {radius:2}
];

arrObj.sort(function(a,b){
    return a.radius - b.radius;
});

console.log(arrObj);