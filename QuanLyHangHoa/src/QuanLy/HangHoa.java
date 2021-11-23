package QuanLy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.util.Scanner;

public class HangHoa {
	String maHangHoa;
	HangHoaType loai;
	String tenHangHoa;
	double giaNhap;
	int soLuong;
	LocalDate ngayNhapKho;
	
	
	
	
	public HangHoa() {
		super();
	}
	
	

	public HangHoa(String maHangHoa, HangHoaType loai, String tenHangHoa, double giaNhap, int soLuong,
			LocalDate ngayNhapKho) {
		super();
		this.maHangHoa = maHangHoa;
		this.loai = loai;
		this.tenHangHoa = tenHangHoa;
		this.giaNhap = giaNhap;
		this.soLuong = soLuong;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	public HangHoa(String str) {
		String[] arr = str.split("/");
		this.maHangHoa = arr[0];
		this.loai = HangHoaType.valueOf(arr[1]);
		this.tenHangHoa = arr[2];
		this.giaNhap = Double.parseDouble(arr[3]);
		this.soLuong = Integer.parseInt(arr[4]);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.ngayNhapKho = LocalDate.parse(arr[5], dateFormat);
	}
	
	public String getMaHangHoa() {
		return maHangHoa;
	}
	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}
	public HangHoaType getLoai() {
		return loai;
	}
	public void setLoai(HangHoaType loai) {
		this.loai = loai;
	}
	public String getTenHangHoa() {
		return tenHangHoa;
	}
	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã hàng hóa: ");
		this.maHangHoa = sc.nextLine();
		this.loai = HangHoaType.input();
		System.out.print("Nhập tên hàng hóa: ");
		this.tenHangHoa =sc.nextLine();
		System.out.print("Nhập giá nhập: ");
		this.giaNhap = sc.nextDouble();
		System.out.print("Nhập số lượng: ");
		this.soLuong = sc.nextInt();
		this.ngayNhapKho = java.time.LocalDate.now();
	}
	
	public void Edit() {
		System.out.println("Thông tin cũ: "+ this.toString());
		Scanner sc = new Scanner(System.in);
		this.loai = HangHoaType.input();
		System.out.print("Nhập tên hàng hóa: ");
		this.tenHangHoa =sc.nextLine();
		System.out.print("Nhập giá nhập: ");
		this.giaNhap = sc.nextDouble();
		System.out.print("Nhập số lượng: ");
		this.soLuong = sc.nextInt();
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return maHangHoa+"/"+loai+"/"+tenHangHoa+"/"+giaNhap+"/"+soLuong+"/"+ngayNhapKho.format(dateFormat);
	}
	
	public String print() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "Hàng hóa: [Mã=" + maHangHoa + ", Loại=" + loai.getValue() + ", Tên=" + tenHangHoa + ", Giá="
				+ giaNhap + ", Số lượng=" + soLuong + ", Ngày nhập kho=" + ngayNhapKho.format(dateFormat) + "]";
	}
}
