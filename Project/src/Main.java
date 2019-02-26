import java.util.Scanner;
public class Main  {
    public static void main(String[] args)   {
        DanhSachKhachHang lkh = new DanhSachKhachHang();
        Scanner in = new Scanner(System.in);
        int x;
        do   {
            System.out.println("\n\t\t-----------------Menu-------------------");
            System.out.println("\t\t0. Thoat ung dung\t ");
            System.out.println("\t\t1. Them Khach Hang Viet Nam\t ");
            System.out.println("\t\t2. Them Khach Hang Nuoc Ngoai\t ");
            System.out.println("\t\t3. Hien Thi Danh Sach Khach Hang\t ");
            System.out.println("\t\t4. Xem Tong (KW)cua cac KH\t ");
            System.out.println("\t\t5. Xem TB Thanh Tien cua KH NN\t ");
            System.out.println("\t\t--------------------------------------");
            x=in.nextInt();           System.out.println("===");
            switch(x) {
                case 1:            lkh.ThemKH(1);
                break;
                case 2:            lkh.ThemKH(2);
                break;
                case 3:            lkh.HienThiKH();
                break;
                case 4:            lkh.TongSL();
                break;
                case 5:            lkh.TrungBinh();
                break;
            }
        }while(x!=0);
        System.out.println("");
    }
}

