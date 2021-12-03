/*  Wing Hin Shih (Daniel) 2586897
            22/11/2021             */

public class Rectangle {
    double length, diagonal, width, area, perimeter;

    // Class constructor
    public Rectangle(double length, double diagonal) {
        // Copy length and diagonal from argument
        this.length = length;
        this.diagonal = diagonal;
        // Calculate width, area and perimeter
        this.width = Math.sqrt(diagonal * diagonal - length * length);
        this.area = this.length * this.width;
        this.perimeter = 2 * (this.length + this.width);
    }

    // Method to print width
    public void printWidth() {
        System.out.println("Width of the rectangle: " + this.width);
    }

    // Method to print area
    public void printArea() {
        System.out.println("Area of the rectangle: " + this.area);
    }

    // Method to print perimeter
    public void printPerimeter() {
        System.out.println("Perimeter of the rectangle: " + this.perimeter);
    }

    public static void main(String[] args) {
        // Create rectangle with length 3 diagonal 5
        Rectangle rect = new Rectangle(3, 5);
        // Print width, area and perimeter
        rect.printWidth();
        rect.printArea();
        rect.printPerimeter();
    }
}

/* Example output

Width of the rectangle: 4.0
Area of the rectangle: 12.0
Perimeter of the rectangle: 14.0

 */