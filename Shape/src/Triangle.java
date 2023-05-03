import java.util.Objects;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle (int base, int height){
        super();
        this.base=base;
        this.height=height;
    }
    public Triangle (String text, String material, int base, int height){
        super(text, material);
        this.base=base;
        this.height=height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void displayTriangleHeight(){
        System.out.println("Triangle height is " + height);
    }

    @Override
    public double getSize(){
        return 1.0d * base*height/2;
    }

    @Override
    public String toString(){
        return "Triangle: height is " + height +", base is: " + base +", " +  super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    @Override
    public boolean equals(Object triangle){

        if ( !super.equals(triangle)){
            return false;
        }

        Triangle tr = (Triangle) triangle;
        return (this.base == tr.getBase() && this.height == tr.getHeight());
    }
}
