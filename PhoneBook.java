package baitap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList = new ArrayList<PhoneNumber>();
    @Override
    public void insertPhone(String name, String phone) {
        boolean found = false;
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                found = true;
                if (!p.getPhone().equals(phone)) {
                    p.setPhone(Collections.singletonList(phone));
                    System.out.println("Cập nhật số điện thoại cho " + name);
                } else {
                    System.out.println(name + " đã có trong danh sách.");
                }
                break;
            }
        }
        if (!found) {
            phoneList.add(new PhoneNumber(name, Collections.singletonList(phone)));
            System.out.println("Thêm " + name +" - "+ phone+ " vào danh sách" );
        }
    }

    @Override
    public void removePhone(String name) {
        int index = -1;
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            phoneList.remove(index);
            System.out.println("Xóa " + name + " khỏi danh sách.");
        } else {
            System.out.println(name + " không nằm trong danh sách.");
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        boolean found = false;
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                found = true;
                p.setPhone(Collections.singletonList(newphone));
                System.out.println("Cập nhật số điện thoại cho " + name+":"+newphone);
                break;
            }
        }
        if (!found) {
            System.out.println(name + " không nằm trong danh sách.");
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        return null;
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {

            public int compare(PhoneNumber p1, PhoneNumber p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

    }

}

