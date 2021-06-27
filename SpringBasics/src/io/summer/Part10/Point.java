package io.summer.Part10;

public class Point {

    public void myInit() throws Exception {
        System.out.println("collecting Resources for Point Class");
    }
    
    public void cleanUp() throws Exception {
        System.out.println("cleaning Resources used by Point Class");
    }

    
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void pointDetails() {
        System.out.print("("+this.getX()+","+this.getY()+")"+"\t");
    }

   
    
}
