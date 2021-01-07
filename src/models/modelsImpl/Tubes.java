package models.modelsImpl;

public class Tubes {
    private int Height;
    private int Width;
    private int posisionX;
    private int posisionY;
    private boolean reverse;

    public Tubes(int height, int width, int posisionX, int posisionY, boolean reverse) {
        Height = height;
        Width = width;
        this.posisionX = posisionX;
        this.posisionY = posisionY;
        this.reverse = reverse;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
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
