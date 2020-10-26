package Exam;

public class Flight {
    private int number;
    private String destination;
    public Flight(int number, String destination){
        this.number = number;
        this.destination = destination;
    }
    public void display() {
        System.out.println("Flight number: " + number);
        System.out.println("Flight destination: " + destination);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                '}';
    }
}
