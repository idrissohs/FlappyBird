package Models;

public class Tubes {
    int Height;
    int Weight;
    int posisionX;
    int posisionY;


    public Tubes(int height, int weight, int posisionX, int posisionY) {
        Height = height;
        Weight = weight;
        this.posisionX = posisionX;
        this.posisionY = posisionY;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
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
}
