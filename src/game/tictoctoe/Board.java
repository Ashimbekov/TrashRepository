package game.tictoctoe;

public class Board {
    private int width;
    private int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String[][] createBoard(){
        String[][] board = new String[width][height];

        for (int row = 0; row < width; row++) {
            for (int col = 0; col < height; col++) {
                board[row][col] = " ";
            }
        }

        return board;
    }

}
