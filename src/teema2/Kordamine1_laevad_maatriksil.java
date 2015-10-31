package teema2;

/**
 * Loo laevade pommitamine, kus on vaid 1x1 laevad ja kasutaja saab arvuti laevasid pommitada 9x9 maatriksil.
 */
public class Kordamine1_laevad_maatriksil {
    static int[][] laud;
    static int lauaLaius = 4;
    static int lauaKorgus = 4;

    public static void main(String[] args) {
        genereerilaud();
        laevadeGenereerimine();
        // kysiPomiseAsukohta();
        // kontrolliTabamust();
        // tagasisideKasLaksPihta();
        // KasOnVeelAllesLaevu();
        // gameover();
    }
    private static void genereerilaud() {
        laud = new int[lauaKorgus][lauaLaius];


    }
    private static void laevadeGenereerimine() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius; j++) {
                laud[i][j] = Math.random()

            }
        }
    }
}
