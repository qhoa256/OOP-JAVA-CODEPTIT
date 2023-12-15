package J05079_LOP_HOC_PHAN_1;

import java.util.*;

public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<lopHoc> lh = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        while (t-- > 0) {
            String idLop = sc.nextLine();
            String tenLop = sc.nextLine();
            lopHoc x = new lopHoc(idLop, tenLop, sc.nextLine(), sc.nextLine());
            lh.add(x);
            if (!map.containsKey(idLop)) {
                map.put(idLop, tenLop);
            }
        }
        Collections.sort(lh, new Comparator<lopHoc>() {
            @Override
            public int compare(lopHoc o1, lopHoc o2) {
                return o1.getNhomLop().compareTo(o2.getNhomLop());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + map.get(s) + ":");
            for (lopHoc x : lh) {
                if (x.getMaMon().equals(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}

//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//THCS2D20