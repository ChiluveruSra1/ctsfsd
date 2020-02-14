var a; //a is number type and cant be intialized to other types.
var b;
var c; //c can be intialized to any type (number, string ,boolean....)
var name1 = "sravan";
//name1="chilu" //cant be re-initialized
var Colors;
(function (Colors) {
    Colors[Colors["orange"] = 99] = "orange";
    Colors[Colors["black"] = 100] = "black";
    Colors[Colors["white"] = 101] = "white";
})(Colors || (Colors = {}));
console.log(Colors.black);
