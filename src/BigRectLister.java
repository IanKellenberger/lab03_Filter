import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 2));   // Perimeter = 6
        rectangles.add(new Rectangle(5, 2));   // Perimeter = 14
        rectangles.add(new Rectangle(2, 2));   // Perimeter = 8
        rectangles.add(new Rectangle(3, 4));   // Perimeter = 14
        rectangles.add(new Rectangle(1, 10));  // Perimeter = 22
        rectangles.add(new Rectangle(2, 3));   // Perimeter = 10
        rectangles.add(new Rectangle(6, 1));   // Perimeter = 14
        rectangles.add(new Rectangle(4, 1));   // Perimeter = 10
        rectangles.add(new Rectangle(7, 3));   // Perimeter = 20
        rectangles.add(new Rectangle(1, 1));   // Perimeter = 4

        BigRectFilter filter = new BigRectFilter();

        System.out.println("Rectangles with a perimeter greater than 10:");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println("Rectangle: " + rect + " | Perimeter: " + (2 * (rect.getWidth() + rect.getHeight())));
            }
        }
    }
}
