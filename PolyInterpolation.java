/*
 * By Ray Murdorf
 * Licensed under CC-BY-NC-SA 4.0
 */

 import java.util.*; // scanner, arraylist

public class PolyInterpolation {
    public static double divDiff(double points[][], int x, int y) { // returns a at the given depth
        // a1 = points[0][1] = f(x0)
        if(y == x) return points[x][1]; // returns f[xi]
        else return (divDiff(points, x, y - 1) - divDiff(points, x + 1, y)) / (points[y][0] - points[x][0]);
    }

    public static String inter(double points[][]) {
        //
        return "";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many x values do you have? ");
        int iter = kb.nextInt();
        double[][] points = new double[iter][2];
        for(int i = 0; i < iter; i++) {
            System.out.printf("x%d? ", i + 1);
            points[i][0] = kb.nextDouble();
            System.out.printf("y%d? ", i + 1);
            points[i][1] = kb.nextDouble();
        }
        kb.close();
    }
}
