package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    int result = 0;
    public void printTable(int numberTableToPrint){
        for(int i = 1;i <= 10;i++){
            result = i * numberTableToPrint;
            System.out.println(i+ " x " + numberTableToPrint + " = " + result );
        }
    }
}
