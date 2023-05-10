package baitap;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("Nguyen Van Dai", "53454363");
        phoneBook.insertPhone("Trinh Hoai Cong", "85663552");
        phoneBook.insertPhone("Nguyen Dinh Son", "89529596");
        phoneBook.insertPhone("Dang Cao Tri", "98785656");
        System.out.println("");
        phoneBook.updatePhone("Vu Van Tai", "8768653");
        phoneBook.removePhone("Nguyen Dinh Son");
        phoneBook.sort();
    }
}
