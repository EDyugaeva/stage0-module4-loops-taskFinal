package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int temp = cathetusLength - i;
            int temp2 = cathetusLength + i;

            for (int j = 1; j < cathetusLength * 2; j++) {
                if (j > temp && j <= cathetusLength) {
                    System.out.print(cathetusLength - j + 1);
                } else if (j >= cathetusLength && j < temp2) {
                    System.out.print(j - cathetusLength + 1);

                } else if (j > cathetusLength + i - 1) {
                    continue;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }
}
