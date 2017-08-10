// flat the given array

var data = [
    1,
    2,
    [3, 4, 5],
    [6, [999, [33, [-8, [-77, -96], -69]], 888], [99, 100]],
    8,
    9,
    10
];

Array.prototype.flat = function () {
    return this.reduce(function (accumulator, currentValue) {
        var ex = [].concat(currentValue).some(Array.isArray);
        return accumulator.concat(ex ? currentValue.flat() : currentValue);
    }, []);
};

console.log(data.flat());
