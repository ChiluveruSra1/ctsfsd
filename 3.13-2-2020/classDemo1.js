var Rectangle = /** @class */ (function () {
    function Rectangle(l, h) {
        this.l = l;
        this.h = h;
    }
    Rectangle.prototype.getArea = function () {
        var area = Number(this.l) * Number(this.h);
        return area;
    };
    Rectangle.prototype.getParameter = function () {
        return 2 * (Number(this.l) + Number(this.h));
    };
    return Rectangle;
}());
var obj = new Rectangle(18.1, 18.23);
var obj1 = new Rectangle(3, 35);
console.log("Rectangle 1: ");
var a = obj.getArea();
console.log(a);
var p = obj.getParameter();
console.log(p);
console.log("\nRectangle 2: ");
var a1 = obj1.getArea();
console.log(a1);
var p1 = obj1.getParameter();
console.log(p1);
