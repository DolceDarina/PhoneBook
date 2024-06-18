public class Printer {
    public static void main(String[] args) {
        String name1, name2, name3;
        int phone1, phone2, phone3, phone4;

        if (args.length == 0) {
            name1 = "Darya Holub";
            name2 = "Dmitry Yasnitsky";
            name3 = "Darya Holub";
            phone1 = 123456;
            phone2 = 654321;
            phone3 = 789012;
            phone4 = 123456;
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            phone1 = Integer.parseInt(args[3]);
            phone2 = Integer.parseInt(args[4]);
            phone3 = Integer.parseInt(args[5]);
            phone4 = Integer.parseInt(args[6]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name1, phone4);

        myPhoneBook.printSortedByPhoneCount();
    }
}
