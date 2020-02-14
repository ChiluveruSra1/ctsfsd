function add(a,b){
    console.log(a + b)
}
add(18,18);
add("SRAVAN ","KUMAR");

console.log()

function add1(numbers){

}
add1({
    a:10,b:"skjsjfg"
})

interface Attributes{
    a:Number
    b:Number
}
function add2(att:Attributes){
    console.log( Number(att.a) + Number(att.b))
}
add2({
    a:18,b:18
});