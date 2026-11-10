abstract class Printer {
    String model;
    int printedCount = 0;
    int availableCount;

    public Printer(String m, int a) {
        model = m;
        availableCount = a;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String m, int a) {
        super(m, a);
    }

    public boolean print() {
        if (availableCount > 0) {
            printedCount++;
            availableCount--;
            return true;
        }
        else if (availableCount == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족\n", model, printedCount + 1);
            return false;
        }
        else {
            System.out.println("얘기치 못한 오류(availableCount가 음수)");
            return false;
        }
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String m, int a) {
        super(m, a);
    }

    public boolean print() {
        if (availableCount > 0) {
            printedCount++;
            availableCount--;
            return true;
        }
        else if (availableCount == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족\n", model, printedCount + 1);
            return false;
        }
        else {
            System.out.println("얘기치 못한 오류(availableCount가 음수)");
            return false;
        }
    }
}

public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
