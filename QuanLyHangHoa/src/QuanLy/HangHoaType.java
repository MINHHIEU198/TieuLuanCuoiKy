package QuanLy;

import java.util.Scanner;

public enum HangHoaType {
	THUCPHAM("Thực phẩm"), SANHSU("Sành sứ"), DIENMAY("�?iện máy");

	private String value;
	HangHoaType(String string) {
		this.value = string;
		// TODO Auto-generated constructor stub
	}
	public String getValue() {
		return value;
	}
	public void setValue(String type) {
		this.value = type;
	}
	
	public static HangHoaType input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Nhập loại hàng hóa (1 - Thực phẩm, 2 - Sành sứ, 3 - �?iện máy): ");
			String type = sc.nextLine();
			if(type.equals("1")) {
				return HangHoaType.THUCPHAM;
			}
			else if (type.equals("2")) {
				return HangHoaType.SANHSU;
			}
			else if (type.equals("3")) {
				return HangHoaType.DIENMAY;
			}
			else {
				System.out.print("Vui lòng nhập lai!");
			}
		}
	}
	
	
}
