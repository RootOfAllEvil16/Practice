package Ex;

public class FindTheWordInMatrix {
    static int row = 4;
    static int col = 4;
    static String word = "king";
    static char[][] matrix =
            {{'q', 'l', 'g', 'n'},
                    {'a', 'e', 'k', 'i'},
                    {'r', 'l', 'r', 'n'},
                    {'g', 'e', 'a', 'e'}};

    private static void searchMatrix(int i, int j) {
        int r = i, c = j, currIndex = 0;
        String output = "";
        //Left
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((c + 1) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    c--;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //Right
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((col - c) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    c++;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //Down
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((row - (r + 1)) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    r++;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //Up
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((r + 1) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    r--;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //LeftUp
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((c + 1) >= word.length() && (r + 1) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    r--;
                    c--;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //LeftDown
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((c + 1) >= word.length() && (row - (r + 1)) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    r++;
                    c--;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //RightUP
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((col - c) >= word.length() && (r + 1) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    r--;
                    c++;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }
        //RightDown
        r = i;
        c = j;
        currIndex = 0;
        output = "";
        if ((col - c) >= word.length() && (row - (r + 1)) >= word.length()) {
            for (int a = 0; a < word.length(); a++) {
                if (matrix[r][c] == word.charAt(currIndex)) {
                    output += "(" + r + "," + c + ")" + matrix[r][c] + " ";
                    r++;
                    c++;
                    currIndex++;
                } else {
                    output = null;
                    break;
                }
            }
            if (output != null) System.out.println(output);
        }

    }

    public static void main(String[] args) {
        char start = word.charAt(0);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (start == matrix[i][j]) {
                    searchMatrix(i, j);
                }
            }
        }
    }
}
