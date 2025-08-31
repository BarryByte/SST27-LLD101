
// public class Square extends Rectangle {
//     @Override
//     void setWidth(int w) {
//         this.w = this.h = w;
//     }

//     @Override
//     void setHeight(int h) {
//         this.w = this.h = h;
//     }
// }

public class Square implements Shape{
    int side;
    public Square(int side){
        this.side = side;
    } 
    public Square (){
        
    }

    @Override
    public int area() {
        return side* side;
    }

}