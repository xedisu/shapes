import java.util.Objects;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle (int width, int height){
        super();
        this.width=width;
        this.height=height;
    }
    public Rectangle (String text, String material, int width, int height){
        super(text,material);
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void displayRectangleHeight() {
        System.out.println("Rectangle height is: " + height);
    }

    @Override
    public double getSize(){
        return 1.0d * width*height;
    }

    @Override
    public String toString(){
        return "Rectangle: height is " + height +", width is: " + width +", " +  super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    @Override
    public boolean equals ( Object rectangle){
        if (!super.equals(rectangle)){
            return false;
        }
        Rectangle rct = (Rectangle) rectangle;

        return ( this.getHeight() == rct.getHeight() && this.getWidth() == rct.getWidth());
    }
}
