package Ex;

import java.util.ArrayList;
import java.util.List;


    class Node implements Comparable
    {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            Node node = (Node)obj;
            return x == node.x && y == node.y;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }

        @Override
        public String toString() {
            return ("(" + x + ", " + y + ") ");
        }
    }

    class Solution
    {
        // 8 possible movements from a cell
        private static final int[] row = { -1, -1, -1,  0, 0,  1, 1, 1 };
        private static final int[] col = { -1,  0,  1, -1, 1, -1, 0, 1 };

        /* Check if we can move to next position.
        Will return false if we can`t or if position already visited */
        public static boolean isValid(Node next, List<Node> path, int M, int N)
        {
            return (next.x >= 0) && (next.x < M) &&
                    (next.y >= 0) && (next.y < N) &&
                    (!path.contains(next));
        }

        public static void DFS(char[][] mat, String word, Node next,
                               List<Node> path, int index)
        {
            int i = next.x;
            int j = next.y;
            int n = word.length();

            if (mat[i][j] != word.charAt(index)) {
                return;
            }

            if (index == n - 1)
            {
                for (int k = 0; k < path.size(); k++) {
                    System.out.print("'" + word.charAt(k) + "'" + path.get(k));
                }
                System.out.println("'" + word.charAt(path.size()) + "'"
                        + new Node(i, j));
                return;
            }

            path.add(new Node(i, j));

            /* check all 8 possible movements from current cell
            and recur for each valid movement */
            for (int k = 0; k < 8; k++)
            {
                //  next position
                next = new Node(i + row[k], j + col[k]);

                /* check if it is possible to go to next position
                from current position */
                if (isValid(next, path, mat.length, mat[0].length)) {
                    DFS(mat, word, next, path, index + 1);
                }
            }
            path.remove(path.size() - 1);

        }

        public static void main(String[] args)
        {
            char[][] mat =
                    {
                            "QLGN".toCharArray(),
                            "AEKI".toCharArray(),
                            "RLRN".toCharArray(),
                            "GEAE".toCharArray()

                    };

            String word = "KING";
            List<Node> path = new ArrayList<>();

            for (int i = 0; i < mat.length; ++i) {
                for (int j = 0; j < mat[0].length; ++j) {
                    DFS(mat, word, new Node(i, j), path, 0);
                }
            }
        }
    }

//Output 'K'(1, 2) 'I'(1, 3) 'N'(0, 3) 'G'(0, 2)
