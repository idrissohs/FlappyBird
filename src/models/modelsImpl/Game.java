package models.modelsImpl;

public class Game {
    private Cell[][]  grid;
    private Bird bird;
    private Tubes[] tubes;
    private int size = 10;

    public Game(){
        this.grid = new Cell[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                this.grid[i][j] = new Cell("  ");
            }
        }

        this.tubes = new Tubes[6];
        this.tubes[0] = new Tubes(3, 3, 10, 7, true);
        this.tubes[1] = new Tubes(6, 3, 10, 0, false);
        this.tubes[2] = new Tubes(4, 3, 17, 6, true);
        this.tubes[3] = new Tubes(5, 3, 17, 0, false);
        this.tubes[4] = new Tubes(7, 3, 21, 3, true);
        this.tubes[5] = new Tubes(2, 3, 21, 0, false);

        for (Tubes tube : this.tubes) {
            tube.addTubeToGrid(this.grid);
        }

        this.bird = new Bird(7);
    }

    public Cell getCell(int i,int j){
        return this.grid[i][j];
    }

    public void setCell(int i, int j, String value) { this.grid[i][j] = new Cell(value); }

    public  String toString(){
        return this.grid.toString();
    }


}
