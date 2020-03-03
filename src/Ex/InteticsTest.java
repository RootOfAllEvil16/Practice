package Ex;



public class InteticsTest {
    static void matrix(String str)
    {
        int l = str.length();
        int k = 0, row, column;
        row = (int) Math.floor(Math.sqrt(l));
        column = (int) Math.ceil(Math.sqrt(l));

        if (row * column < l)
        {
            row = column;
        }

        char[][] s = new char[row][column];



        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if(k < str.length())
                    s[i][j] = str.charAt(k);
                k++;
            }
        }


        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if (s[i][j] == 0)
                {
                    break;
                }
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
        String str = "QWEASDZXC";
        matrix(str);
    }
}
