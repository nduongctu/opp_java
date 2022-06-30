package DoanThang;

public class DoanThang {
    private Diem d1;
    private Diem d2;

    DoanThang(){
        d1= new Diem();
        d2 = new Diem();
    }

    DoanThang(Diem a, Diem b){
        d1 = new Diem(a.giaTriX(), a.giaTriY());
        d2 = new Diem(b.giaTriX(), b.giaTriY());
    }
    DoanThang(int ax, int ay, int bx, int by){
        d1 = new Diem(ax, ay);
        d2 = new Diem(bx,by);
    }

    public void nhapDoanThang(){
        System.out.println("Nhap toa do diem d1:");
        d1.nhapDiem();
        System.out.println("Nhap toa do diem d2");
        d2.nhapDiem();
    }

    public void hienThi(){
        d1.hienThi();
        System.out.print(" ");
        d2.hienThi();
    }

    public void tinhTien(int dx, int dy){
        d1.doiDiem(dx, dy);
        d2.doiDiem(dx, dy);
    }

    public double tinhdoDai(){
        return Math.sqrt(Math.pow(d1.giaTriX()-d2.giaTriX(),2)+ Math.pow(d1.giaTriY()-d2.giaTriY(),2));
    }

    public double tinhGoc(){
        return Math.acos(Math.abs(d2.giaTriX() - d1.giaTriX()) / this.tinhdoDai());
    }
}
