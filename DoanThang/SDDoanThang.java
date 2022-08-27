package DoanThang;

public class SDDoanThang {
    public static void main(String []args){
        Diem A =new Diem(2,5);
        Diem B=new Diem(20,35);
        DoanThang AB = new DoanThang(A,B);
        AB.tinhTien(5,2);

        DoanThang CD = new DoanThang();
        CD.nhapDoanThang();
        System.out.println("Do dai doan thang CD la :" +CD.tinhdoDai());
        System.out.println("Goc giua CD va truc hoanh Ox la : "+CD.tinhGoc());
    }
}
