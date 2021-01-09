package models.modelsImpl;

public class Tubes {
    private int height;
    private int width;
    private int posisionX;
    private int posisionY;
    private boolean reverse;

    public Tubes(int height, int width, int posisionX, int posisionY, boolean reverse) {
        height = height;
        width = width;
        this.posisionX = posisionX;
        this.posisionY = posisionY;
        this.reverse = reverse;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        width = width;
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

    public void addTubeToGrid(Cell[][]  grid) {
        if (reverse) {
            grid[posisionX][posisionY].setValue("|_|");
            for (int i = posisionY + 1; i < posisionY + height; i --) {
                grid[posisionX][i].setValue("| |");
            }
        } else {
            grid[posisionX][posisionY].setValue("|⎺|");
            for (int i = posisionY + 1; i < posisionY + height; i ++) {
                grid[posisionX][i].setValue("| |");
            }
        }
    }
}
