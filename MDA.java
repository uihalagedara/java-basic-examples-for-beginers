public class MDA {
    public static void main(String args[]) {
        int array[][] = { { 1, 2, 3, 4 }, { 2, 4,
                6, 8 }, { 3, 6, 9, 12 },
                { 4, 8, 12, 16,
                } };
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
}