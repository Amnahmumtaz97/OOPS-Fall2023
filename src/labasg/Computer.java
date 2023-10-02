package labasg;
import java.util.Objects;

public class Computer{
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public String getComputerNumber()
    {
        return computerNumber;
    }
    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }
    public String getLcdModel() {
        return lcdModel;
    }
    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }
    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public int getHddSize() {
        return hddSize;
    }
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }
    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public boolean equals(Object o) {
        Computer computer = (Computer) o;
        return computerNumber.equals(computer.computerNumber);    }
    public Computer() {
        this.computerNumber= "1";
        this.lcdModel = "GT";
        this.ramSize = 8;
        this.hddSize = 128;
        this.hasGPU = true;
    }
    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    public Computer clone(){
        return new Computer(this.getComputerNumber(), this.getLcdModel(), this.getRamSize(), this.getHddSize(), this.isHasGPU());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNumber='" + computerNumber + '\'' +
                ", lcdModel='" + lcdModel + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", hasGPU=" + hasGPU +
                '}';
    }
}
