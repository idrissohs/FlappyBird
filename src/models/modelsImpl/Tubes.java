package models.modelsImpl;

public class Tubes {
    private int height;
    private int width;
    private int posisionX;
    private int posisionY;
    private boolean reverse;

    public Tubes(int height, int width, int posisionX, int posisionY, boolean reverse) {
        this.height = height;
        this.width = width;
        this.posisionX = posisionX;
        this.posisionY = posisionY;
        this.reverse = reverse;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPosisionX() {
        return posisionX;
    }

    public void setPosisionX(int posisionX) {
        this.posisionX = posisionX;
    }

    public int getPosisionY() {
        return posisionY;
    }

    public void setPosisionY(int posisionY) {
        this.posisionY = posisionY;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }
}
