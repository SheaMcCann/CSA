public class Board {
    static int numPieces;
    public static void populate(){
        numPieces = (int)(Math.random() * (50 - 10 + 1) + 10);;
    }
    public static void removePieces(int piecesToRemove) {
        if (numPieces == 1){
            numPieces = 0;
        }
        else{
            if (piecesToRemove > 0 && piecesToRemove <= numPieces / 2) {
                numPieces -= piecesToRemove;
            } else {
                System.out.println("Invalid number of pieces to remove. Your turn has been skipped. :(");
            }
        }
    }
}
