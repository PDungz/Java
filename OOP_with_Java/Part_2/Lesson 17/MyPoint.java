public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void ToString() {
        System.out.println("(" + getX() + "," + getY() + ")");
    }

    public float distance(int x, int y) {
        return (float)Math.sqrt(x*x + y*y);
    }

    public float distance(MyPoint point1) {
        return (float)Math.sqrt((this.x - point1.x)*(this.x - point1.x) + (this.y - point1.y)*(this.y - point1.y));
    }
}
