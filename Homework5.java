class PersonalComputer {
    private Computer computer = new Computer();
    private Monitor monitor = new Monitor();

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor() {
        monitorSize = "24 inch";
        color = "Black";
        power = "45W";
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + monitorSize);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer() {
        cpu = "Core i7";
        memory = "16GB";
        hd = "2TB";
        color = "White";
        power = "500W";
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the CPU");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Homework5 {
    public static void main(String[] args) {
        PersonalComputer PC = new PersonalComputer();
        PC.turnOn();
        PC.printInfo();
    }
}
