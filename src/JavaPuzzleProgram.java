public class JavaPuzzleProgram {
    public static void main(String[] args) {
        int choco = 15;
        int cover = choco;
        int balchoco = cover%3;
        int total = choco;

        while(cover>2){
             choco = cover/3;
             cover = choco+balchoco;
             balchoco = cover%3;
             total = total+choco;

        }
        System.out.println(total);
    }
}
