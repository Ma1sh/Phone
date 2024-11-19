public class Phone {
    private String number;
    private String name;
    private double weight;

    public Phone(String number, String name, double weight) {
        this.number = number;
        this.name = name;
        this.weight = weight;
    }

    public Phone(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone(String number, String name, String model, double weight) {
        this(number, name, weight);
    }

    public String getReceiveCall(String name) {
        return "Звонит " + name;
    }

    public String getReceiveCall(String name, String number) {
        return "Звонит " + name + " с номера " + number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Телефон{" +
                "Номер ='" + number + '\'' +
                ", Название ='" + name + '\'' +
                ", Вес =" + weight + " Грамм" +
                '}';
    }
}

