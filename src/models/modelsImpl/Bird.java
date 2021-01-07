package models.modelsImpl;

public class Bird {
    private int positionY;

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
}
