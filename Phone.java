package baitap;

public abstract class Phone {
    String name;
    String phone;
    String newphone;
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newphone);
    abstract PhoneNumber searchPhone(String name);
    abstract void sort();


}
