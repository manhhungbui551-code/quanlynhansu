public class NhanVien {
    private String maNV;
    private String hoTen;
    private String chucVu;
    private double luong;

    public NhanVien(String maNV, String hoTen, String chucVu, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public void hienThi() {
        System.out.println(
            maNV + " - " + hoTen + " - " + chucVu + " - " + luong
        );
    }
}