public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung Galaxy", 0.2);
        Phone phone2 = new Phone("987654321", "iPhone 12");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        phone1.receiveCall("John");
        phone1.receiveCall("Jane", "987654321");
        phone1.sendMessage("111111111", "222222222");

        System.out.println(phone2.getNumber());
        phone2.receiveCall("Alice");
        phone2.sendMessage("333333333");

        System.out.println(phone3.getNumber());

        phone1.setModel("Samsung Galaxy S21");
        phone1.setWeight(0.18);
    }
}