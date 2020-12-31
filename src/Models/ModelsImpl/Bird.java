package Models.ModelsImpl;

public class Bird {
    int posisionY;
    int flyUp;

    public Bird(int posisionY, int flyUp) {
        this.posisionY = posisionY;
        this.flyUp = flyUp;
    }

    public int getPosisionY() {
        return posisionY;
    }

    public void setPosisionY(int posisionY) {
        this.posisionY = posisionY;
    }

    public int getFlyUp() {
        return flyUp;
    }

    public void setFlyUp(int flyUp) {
        this.flyUp = flyUp;
    }
}
