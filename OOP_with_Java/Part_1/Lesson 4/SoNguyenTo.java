public class SoNguyenTo {
    private int a;
    
    public SoNguyenTo() {
        
    }
    
    
    public SoNguyenTo(int x) {
        if(isSoNguyenTo(x)) {
            a = x;
        } else {
            System.out.println("x khong phai la so nghien to, khong luu tru");
        }
    }

    public boolean isSoNguyenTo(int x) {
        if(x == 1) {
            return false;
        } else {
            for(int i = 2; i <= Math.sqrt(x); i++) {
                if(x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public int timSoNguyenToTiepTheo() {
        for(int i = a+1; i <= a*2; i++) {
            if(isSoNguyenTo(i)) {
                return i;
            }
        }
        return 1;
    }

    public void setSoNguyenTo(int x) {
        if(isSoNguyenTo(x)) {
            a = x;
        } else {
            System.out.println("Khong set");
        }
    }

    public int getSoNguyenTo() {
        if(a == 0) {
            return 1;
        } else{
            return a;
        }
    }

}
