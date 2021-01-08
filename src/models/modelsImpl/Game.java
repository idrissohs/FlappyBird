package models.modelsImpl;

public class Game {
    private Bird bird;
    private Tubes[] tubes;
    private int height = 10;
    private int width = 30;

    public Game() {
        this.tubes = new Tubes[6];
        this.tubes[0] = new Tubes(3, 3, 10, 7, true);
        this.tubes[1] = new Tubes(6, 3, 10, 0, false);
        this.tubes[2] = new Tubes(4, 3, 17, 6, true);
        this.tubes[3] = new Tubes(5, 3, 17, 0, false);
        this.tubes[4] = new Tubes(7, 3, 21, 3, true);
        this.tubes[5] = new Tubes(2, 3, 21, 0, false);

        this.bird = new Bird(7);
    }

    public  String toString(){
        String result = "";

        String onePixelX = " ";
        String onePixelY = "\n";

        result += "|------------------------------|"+onePixelY;

        for (int y = 0; y <= height; y++) {
            result += "|";
            for (int x = 0; x < width; x++) {

                //check if tube or bird exist
                //Itube iS tube AND Ibird iS tube
                //if not do onePixelX

               /* if (Itube != exist && Ibird != exist) {
                    result += onePixelX;
                }
                */

                result += onePixelX;
            }
            result += "|"+onePixelY;
        }
        result += "|------------------------------|";

        return result;
    }

    //    private cell[][]  grid;
//    private int size = 6;
//
//    public Game(){
//        this.grid = new cell[this.size][this.size * 2];
//        for (int i = 0; i < this.size; i++) {
//            for (int j = 0; j < this.size * 2; j++) {
//                this.grid[i][j] = new cell("  ");
//            }
//        }
//    }
//
//    public cell getCell(int i,int j){
//        return this.grid[i][j];
//    }

    /*public  String toString(){
        String result = "";
        String floor= "|__|__|__|__|__|__|__|__|__|__|__|\n";

        System.out.println(result);

        this.grid = new cell[this.size][this.size * 2];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size *2; j++) {

                String V = "|" + this.grid[i][j];

               // this.grid[i][j] = new cell(V);
                System.out.print("|  ");
            }
            System.out.println("\n" +floor);
        }

        return result;
    }*/

//    public  String toStringV1(){
//        String result = "_____________________________________________________________\n";
//        result += "|" + this.grid[0][0].toString() + "|" + this.grid[0][1].toString()  + "|" + this.grid[0][2].toString()  + "|" + this.grid[0][3].toString()  + "|" + this.grid[0][4].toString()  + "|" + this.grid[0][5].toString()  + "|" + this.grid[0][6].toString()  + "|" + this.grid[0][7].toString()  + "|" + this.grid[0][8].toString()  + "|" + this.grid[0][9].toString()  + "|" + this.grid[0][10].toString()  + "|" + this.grid[0][11].toString()  + "|" + this.grid[0][12].toString() ;
//        result += "|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
//        result += "|" + this.grid[1][0].toString() + "|" + this.grid[1][1].toString()  + "|" + this.grid[1][2].toString()  + "|" + this.grid[1][3].toString()  + "|" + this.grid[1][4].toString()  + "|" + this.grid[1][5].toString()  + "|" + this.grid[1][6].toString()  + "|" + this.grid[1][7].toString()  + "|" + this.grid[1][8].toString()  + "|" + this.grid[1][9].toString()  + "|" + this.grid[1][10].toString()  + "|" + this.grid[1][11].toString()  + "|" + this.grid[1][12].toString()  ;
//        result += "|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
//        result += "|" + this.grid[2][0].toString() + "|" + this.grid[2][1].toString()  + "|" + this.grid[1][2].toString()  + "|" + this.grid[1][3].toString()  + "|" + this.grid[1][4].toString()  + "|" + this.grid[1][5].toString()  + "|" + this.grid[1][6].toString()  + "|" + this.grid[1][7].toString()  + "|" + this.grid[1][8].toString()  + "|" + this.grid[1][9].toString()  + "|" + this.grid[1][10].toString()  + "|" + this.grid[1][11].toString()  + "|" + this.grid[1][12].toString()  ;
//        result += "|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
//        result += "|" + this.grid[3][0].toString() + "|" + this.grid[3][1].toString()  + "|" + this.grid[1][2].toString()  + "|" + this.grid[1][3].toString()  + "|" + this.grid[1][4].toString()  + "|" + this.grid[1][5].toString()  + "|" + this.grid[1][6].toString()  + "|" + this.grid[1][7].toString()  + "|" + this.grid[1][8].toString()  + "|" + this.grid[1][9].toString()  + "|" + this.grid[1][10].toString()  + "|" + this.grid[1][11].toString()  + "|" + this.grid[1][12].toString()  ;
//        result += "|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
//        result += "|" + this.grid[4][0].toString() + "|" + this.grid[4][1].toString()  + "|" + this.grid[4][2].toString()  + "|" + this.grid[1][3].toString()  + "|" + this.grid[1][4].toString()  + "|" + this.grid[1][5].toString()  + "|" + this.grid[1][6].toString()  + "|" + this.grid[1][7].toString()  + "|" + this.grid[1][8].toString()  + "|" + this.grid[1][9].toString()  + "|" + this.grid[1][10].toString()  + "|" + this.grid[1][11].toString()  + "|" + this.grid[1][12].toString()  ;
//        result += "|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
//        result += "|" + this.grid[5][0].toString() + "|" + this.grid[5][1].toString()  + "|" + this.grid[5][2].toString()  + "|" + this.grid[1][3].toString()  + "|" + this.grid[1][4].toString()  + "|" + this.grid[1][5].toString()  + "|" + this.grid[1][6].toString()  + "|" + this.grid[1][7].toString()  + "|" + this.grid[1][8].toString()  + "|" + this.grid[1][9].toString()  + "|" + this.grid[1][10].toString()  + "|" + this.grid[1][11].toString()  + "|" + this.grid[1][12].toString()  ;
//        result += "|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
//
//
//        return result;
//    }
}
