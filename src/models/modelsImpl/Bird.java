package models.modelsImpl;

public class Bird {
    private int positionY;
    private int positionX;

    public Bird(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int fly() {
        return positionY+=1;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void addBirdToGrid(Cell[][] grid) {
        grid[positionX][positionY].setValue("x");
    }
}
