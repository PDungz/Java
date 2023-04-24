import java.util.Scanner;

public class ACB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tK: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = true;
        int count = 0;
        Account[] tK = new Account[n];

        while(found) {
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t**********************MENU**********************");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t** 1. Nhap thong tin cac Account              **");
            System.out.println("\t\t\t** 2. Xuat thong tin cac Account              **");
            System.out.println("\t\t\t** 3. Nap tien vao tai khoan                  **");
            System.out.println("\t\t\t** 4. Rut tien				                  **");
            System.out.println("\t\t\t** 5. Dao han             					  **");
            System.out.println("\t\t\t** 6. Chuyen khoan                            **");
            System.out.println("\t\t\t** 7. Thoat                                   **");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t************************************************");
            System.out.println();
            System.out.println();

            System.out.print("Nhap chuc nang: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch(menu) {
                case 1:
            		System.out.println("Nhap thong tin giao dich: " + (count + 1));
                    tK[count] = new Account();
                    tK[count].nhapThongTin();
                    count++;
                    System.out.println("Nhap thong tin giao dich thanh cong");
                    break;
                case 2:
                    if(count > 0) {
                        for(int i = 0; i < count; i++) {
                            System.out.println(tK[i].toString());
                        }
                    } else {
                        System.out.println("Khong co tai khoang nao!");
                    }
                    break;
                case 3:
                    if(count > 0) {
                    	boolean found1 = false;
                    	System.out.print("Nhap ten Tk: ");
                    	String TenTK = sc.nextLine();
                        for(int i = 0; i < count; i++) {
                            if(tK[i].getTenTK().equalsIgnoreCase(TenTK)) {
                            	System.out.print("Nap tien Tk: ");
                            	double np = sc.nextDouble();
                            	tK[i].napTien(np);
                            	found1 = true;
                            	break;
                            }
                            if(!found1) {
                            	System.out.println("Khong co tai khoang nay!");
                            }
                        }
                    } else {
                        System.out.println("Khong co tai khoang nao!");
                    }
                    break;
                case 4:
                    if(count > 0) {
                    	boolean found2 = false;
                    	boolean found3 = false;
                    	System.out.print("Nhap ten Tk: ");
                    	String TenTK = sc.nextLine();
                        for(int i = 0; i < count; i++) {
                            if(tK[i].getTenTK().equalsIgnoreCase(TenTK)) {
                            	if(tK[i].getSoTienTk() > 0) {
                            		System.out.print("Nhap ten Tk: ");
                            		double r = sc.nextDouble();
                            		tK[i].rutTien(r);  
                            		found2 = true;
                            		break;
                            	}
                            	found3 = true;
                            	break;
                            	
                            }
                        }
                        if(!found2) {
                        	System.out.println("Khong du tien trong tai khoan!");
                        }
                        if(!found3) {
                        	System.out.println("Khong co tai khoang nay!");
                        }
                    } else {
                        System.out.println("Khong co tai khoang nao!");
                    }
                    break;
                case 5:
                    if(count > 0) {
                    	boolean found1 = false;
                    	System.out.print("Nhap ten Tk: ");
                    	String TenTK = sc.nextLine();
                        for(int i = 0; i < count; i++) {
                            if(tK[i].getTenTK().equalsIgnoreCase(TenTK)) {
                            	System.out.print("Nhap ten Tk: ");
                            	int dh = sc.nextInt();
                            	tK[i].daoHan(dh);
                            	found1 = true;
                            	break;
                            }
                        }
                        if(!found1) {
                        	System.out.println("Khong co tai khoang nay!");
                        }
                    } else {
                        System.out.println("Khong co tai khoang nao!");
                    }
                    break;
                case 6:
                    if(count > 0) {
                    	boolean found4 = false;
                    	int found_ck = 0;
                    	int found_N = 0;
                    	System.out.print("Nhap ten Tk chuyen tien: ");
                    	String TenTK_Ck = sc.nextLine();
                    	System.out.print("Nhap ten Tk nhan: ");
                    	String TenTK_N = sc.nextLine();
                        for(int i = 0; i < count; i++) {
                            if(tK[i].getTenTK().equalsIgnoreCase(TenTK_Ck)) {
                            	found_ck = i;
                            	found4 = true;
                            }
                            if(tK[i].getTenTK().equalsIgnoreCase(TenTK_N)) {
                            	found_N = i;
                            	found4 = true;
                            }
                        }
                        if(!found4) {
                        	System.out.println("Khong co tai khoang nay!");
                        }
                        if(found4) {
                        	System.out.print("Nhap so tien ck: ");
                        	double ck = sc.nextDouble();
                        	tK[found_ck].chuyenTien(tK[found_N], ck);                        	
                        }
                        
                    } else {
                        System.out.println("Khong co tai khoang nao!");
                    }
                    break;
                
                case 7:
                    System.out.println("------------------------------------------------");
                    System.out.println("Chuc mung ban da cut khoi chuong trinh");
                    System.out.println("------------------------------------------------");
                    found = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    System.out.println("Nhap n vai o");
                    System.out.println("------------------------------------------------");

                    break;
            }
        }
	}
}
