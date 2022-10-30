package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int temp;
        for (int i = 1; i <= cathetusLength; i++) {
            temp = cathetusLength - i;
            for (int j = 1; j <= cathetusLength; j++) {
                if (j > temp) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
