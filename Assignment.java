package assignment;

public class Assignment extends Shape {
    public int width, height;

    public Assignment(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Assignment A1 = new Assignment(10, 5, "color-1");
        System.out.printf("The area of this %s rectangle is: %d\n", A1.color, A1.getArea());
    }
}