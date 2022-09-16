package Lesson8Loader;


public class Point1D {
    private  int x;
    {
        x = 100;
    }
    public double getDistance(){
        return Math.abs(x);
    }
    @Override
    public String toString() {
        return "Point1D{dist=%s x=%d}".formatted(getDistance(),x);
    }

    public int getX() {
        System.out.println("Point1D get()=" + x);
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Point1D(int x) {
        System.out.println("Point1D started");
        this.x = x;
//        getX();
        System.out.println("Point1D finisher");
//        System.out.println(this);
    }
}
