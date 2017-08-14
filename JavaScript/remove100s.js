// remove 100 in a string

var data = "11000010";

while (data.indexOf("100") != -1) {
    data = data.replace(/100/g, "");
}

console.log(data);