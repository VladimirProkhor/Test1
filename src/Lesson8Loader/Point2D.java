package Lesson8Loader;

public class Point2D extends Point1D{
//    private int x;
    private int y;
    {
//        x = 60;
        y = 74;
    }
    @Override
    public double getDistance() {
//        return Math.hypot(x,y);
        return Math.hypot(getX(),y);
    }

    @Override
    public String toString() {
//        return "Point2D{dist=%s x=%d y=%d}".formatted(getDistance(),x,y);
        return "Point2D{dist=%s x=%d y=%d}".formatted(getDistance(),getX(),y);
    }



    @Override
    public int getX() {
//        System.out.println("Point2D getX()?"+x);
        System.out.println("Point2D getX()?"+super.getX());
        return super.getX();
    }

//    @Override
//    public void setX(int x) {
//        this.x = x;
//    }

    public int getY() {
        System.out.println("Point2D getY()");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D(int x, int y) {
        super(x);
        System.out.println("Point2D started");
//        this.x = x;
//        getX();
        this.y = y;
        getY();
        System.out.println("Point2D finisher");
//        System.out.println(this);
    }
}
