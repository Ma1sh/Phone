public class getReceiveCall {
    public class Phone {
        int number;
        int model;
        double weight;
        String name = "Alex";

        public Phone(int number, int model, double weight) {
            // Конструктор
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone() {
            // Конструктор по умолчанию
        }

        public void receiveCall() {
            System.out.println("Звонит "+name);
        }
    }

}
