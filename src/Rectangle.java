public class Rectangle {
    private double length;
    private double width;
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getDiagonal(){
        return Math.sqrt((length * length) + (width * width));
    }
    public boolean isSquare(){
        return (this.length == this.width);
    }
}
