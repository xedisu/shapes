import java.util.ArrayList;
import java.util.Objects;

public abstract class Shape {
    private String text;
    private String material;

    public Shape() {
        text = "";
        material = "";
    }

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public abstract double getSize();

    @Override
    public String toString() {
        return "made of " + material + ", contains the text: " +"\"" +text+"\".";
    }

    @Override
    public boolean equals(Object shape) {
        if (shape == null) {
            return false;
        }
        if (this.getClass() != shape.getClass()) {
            return false;
        }

        return (this.text.equals(((Shape) shape).text) && this.material.equals(((Shape) shape).material));
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, material);
    }

    public static void main(String[] args) {
        Shape sp1 = new Triangle("something", "copper", 11, 23);
        Shape sp2 = new Triangle("something", "copper", 11, 23);
        Shape sp3 = new Rectangle("something", "copper", 11, 33);
        Shape sp4 = new Rectangle("something", "copper", 11, 33);
//        Shape sp5 = new Shape("some", "copper");
//        Shape sp6 = new Shape("some", "copper");
        System.out.println(sp1);
        Triangle triangle = (Triangle) sp1;
        triangle.displayTriangleHeight();
//        System.out.println(sp1.equals(sp2));
//        System.out.println(sp1.equals(sp3));
//        System.out.println(sp4.equals(sp3));
//        System.out.println(sp3.hashCode());
//        System.out.println(sp2.hashCode());
//        System.out.println(sp5.hashCode());
        ArrayList<Shape> arrayList = new ArrayList<>();
        arrayList.add(sp1);
        arrayList.add(sp2);
        arrayList.add(sp3);
        arrayList.add(sp4);
//        arrayList.add(sp5);
//        arrayList.add(sp6);

        for (Shape s : arrayList) {
            System.out.println(s.toString());
        }

        for (Shape s : arrayList) {
            System.out.println(s.getSize());
        }

        for (Shape s : arrayList) {
            if (s instanceof Triangle) {
                 ((Triangle) s).displayTriangleHeight();
            }
            if (s instanceof Rectangle) {
                ((Rectangle) s).displayRectangleHeight();
            }
        }
    }
}