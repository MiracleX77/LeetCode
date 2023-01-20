class Solution1232 {
    public static boolean checkStraightLine(int[][] coordinates) {
        double m_base = 0.0, y1, y2, x1, x2, m_new = 0;
        for (int i = 1; i < coordinates.length; i++) {
            y1 = coordinates[i - 1][1];
            x1 = coordinates[i - 1][0];
            y2 = coordinates[i][1];
            x2 = coordinates[i][0];
            if (i == 1) {
                m_base = (y2 - y1) / (x2 - x1);
            } else {
                if ((y2 - y1) / (x2 - x1) == Double.NEGATIVE_INFINITY)
                    m_new = Double.POSITIVE_INFINITY;
                else {
                    m_new = (y2 - y1) / (x2 - x1);
                }
                System.out.println(m_base);
                System.out.println(m_new);
                if (m_base != m_new) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coor = { { 0, 0 }, { 0, 1 }, { 0, -1 } };
        System.out.println(checkStraightLine(coor));
    }
}