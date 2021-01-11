//With example illustrate variable and function closure in javascript.

var addTo = function(passed){

    var add = function(inner){
        return (passed + inner);
    };

    return add;
};

