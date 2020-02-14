class Rectangle{
    private l:Number
    private h:Number
    
    constructor(l,h){
        this.l=l
        this.h=h
   }

   getArea(){
       let area=Number(this.l)*Number(this.h);
       return area;
   }

   getParameter() {
       return 2*(Number(this.l)+Number(this.h));
   }

}

var obj=new Rectangle(18.1,18.23)
var obj1=new Rectangle(3,35);
console.log("Rectangle 1: ")
var a=obj.getArea();
console.log(a);
var p=obj.getParameter();
console.log(p);
console.log("\nRectangle 2: ")
var a1=obj1.getArea();
console.log(a1);
var p1=obj1.getParameter();
console.log(p1);