package zoho;

public class WelcomeZoho {

    private static void formMatrix(String str, String pat) {
        // System.out.println(str.length());
        char mat[][] = new char[5][5];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (k < str.length()) {
                    mat[i][j] = str.charAt(k++);
                } else {
                    mat[i][j] = ' ';
                }

            }
        }
        printMatrix(mat);
        findPat(mat, pat);
    }

    private static void printMatrix(char mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findPat(char mat[][], String pat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == pat.charAt(0)) {
                    if (horizontalSearch(mat, i, j, pat)) {
                        System.out.println("Start index: <" + i + ", " + j + "> End index: <" + i + ", "
                                + (j + pat.length() - 1) + ">");
                    }

                    if (verticalSearch(mat, i, j, pat)) {
                        System.out.println("Start index: <" + i + ", " + j + "> End index: <" + (i + pat.length() - 1)
                                + ", " + j + ">");
                    }

                }
            }
        }
    }

    private static boolean horizontalSearch(char mat[][], int startRow, int startCol, String pat) {
        for (int j = 0; j < pat.length(); j++) {

            if ((startCol + j) >= mat[0].length) {
                return false;
            }
            if (mat[startRow][startCol + j] != pat.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    private static boolean verticalSearch(char mat[][], int startRow, int startCol, String pat) {
        for (int i = 0; i < pat.length(); i++) {
            if (startRow + i >= mat.length) {
                return false;
            }
            if (mat[startRow + i][startCol] != pat.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "WELCOMETOZOHOCORPORATION";
        String pat = "TOO";
        formMatrix(str, pat);
    }
}
