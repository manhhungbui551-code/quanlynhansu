
import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemNhanVien {

    static class NhanVien {
        String maNV;
        String hoTen;
        String chucVu;

        NhanVien(String maNV, String hoTen, String chucVu) {
            this.maNV = maNV;
            this.hoTen = hoTen;
            this.chucVu = chucVu;
        }

        void hienThi() {
            System.out.println("Ma nhan vien: " + maNV);
            System.out.println("Ho ten: " + hoTen);
            System.out.println("Chuc vu: " + chucVu);
        }
    }

    public static void main(String[] args) {
        ArrayList<NhanVien> danhSach = new ArrayList<>();

        // Du lieu mau de kiem tra chuc nang tim kiem
        danhSach.add(new NhanVien("NV01", "Nguyen Van An", "Nhan vien"));
        danhSach.add(new NhanVien("NV02", "Tran Thi Binh", "Ke toan"));
        danhSach.add(new NhanVien("NV03", "Le Van Cuong", "Quan ly"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma nhan vien can tim: ");
        String ma = sc.nextLine().trim();

        boolean timThay = false;

        for (NhanVien nv : danhSach) {
            if (nv.maNV.equalsIgnoreCase(ma)) {
                System.out.println("\nTim thay nhan vien:");
                nv.hienThi();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay nhan vien!");
        }

        sc.close();
    }
}
