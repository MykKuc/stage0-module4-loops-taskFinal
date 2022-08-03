package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        char symbol = '*';
        for(int i = 1;i <= cathetusLength;i++) {
            for (int y = 1; y <= i; y++) {
                System.out.println(symbol);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
