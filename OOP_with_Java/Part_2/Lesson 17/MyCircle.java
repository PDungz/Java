public class MyCircle {
    private MyPoint pointCircle;
    private int r;

    public MyCircle() {

    }

    public MyCircle(MyPoint pointCircle, int r) {
        this.pointCircle = pointCircle;
        this.r = r;
    }

    public void setMyCircle(MyPoint pointCircle, int r) {
        this.pointCircle = pointCircle;
        this.r = r;
    }

    public void setPointMyCircle(MyPoint pointCircle) {
        this.pointCircle  = pointCircle;
    }

    public MyPoint getPointMyCircle() {
        return pointCircle;
    }

    public void setRightMyCircle(int r) {
        this.r = r;
    }

    public String toString() {
        return "Hinh tron @(" + pointCircle.getX() + "," + pointCircle.getY() + ") ban kinh r = " + this.r;
    }

    public float getArea() {
        return (float)(3.14 * this.r);
    }
}
