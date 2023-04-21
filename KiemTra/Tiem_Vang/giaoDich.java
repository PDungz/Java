import java.util.Scanner;

public class giaoDich {
    private String maGD;
    private String ngayGD;
    private long soLuong;
    private long donGia;

    public giaoDich() {

    }

    public giaoDich(String maGD, String ngayGD, Long soLuong, Long donGia) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD){
        this.maGD = maGD;
    }

    public String getNgayGD(){
        return ngayGD;
    }
    public void setNgayGD(String ngayGD){
        this.ngayGD = ngayGD;
    }

    public long getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(Long soLuong){
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }
    public void setDonGia(Long donGia){
        this.donGia = donGia;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma Giao Dich: ");
        this.maGD = sc.nextLine();
        System.out.print("Ngay Giao Dich: ");
        this.ngayGD = sc.nextLine();
        System.out.print("So Luong: ");
        this.soLuong = sc.nextLong();
        System.out.print("Don Gia: ");
        this.donGia = sc.nextLong();
    }

    public void outPut() {
        System.out.println();
        System.out.println();
        System.out.println("Ma Giao Dich: " + this.maGD);
        System.out.println("Ngay Giao Dich: " + this.ngayGD);
        System.out.println("So Luong: " + this.soLuong);
        System.out.println("Don Gia: " + this.donGia);
    }

}    
