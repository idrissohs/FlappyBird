package models.modelsImpl;

public class Game {
    private cell[][]  grid;
    private int size = 10;

    public Game(){
        this.grid = new cell[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                this.grid[i][j] = new cell("  ");
            }
        }
    }

    public cell getCell(int i,int j){
        return this.grid[i][j];
    }

    /*public  String toString(){
        String result0 = "|____________________________________________|\n";
        String result1 = "|";
        String resultF = "";

        this.grid = new cell[10][20];
        for (int i = 0; i < 10; i++) {
            System.out.println(result0);
            for (int j = 0; j < 20; j++) {
                this.grid[i][j] = new cell(result1);
            }
        }

        return result0 +result1;
    }*/
}
