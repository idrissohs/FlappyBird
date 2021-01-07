package models.modelsImpl;

public class cell {

    private String value;

    public cell( String value) { ;
        this.value = value;
    }

    public  boolean isSet() {
        return this.value.length() > 0;
    }

    public String toString() {
        if (isSet()) {
            return this.value;
        }else {
            return  "   ";
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
