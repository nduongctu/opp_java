package Gach;

import java.util.Scanner;

public class Gach {
    private String maSo;
    private String mauSac;
    private int soLuong;
    private int chieuDai;
    private int chieuNgang;
    private long giaBan;

    Gach(){
        maSo= null;
        mauSac = null;
        soLuong = 0;
        chieuDai = 0;
        chieuNgang = 0;
        giaBan = 0;
    }

    Gach(String maSo, String mauSac, int soLuong, int chieuDai, int chieuNgang, long giaBan){
        this.maSo = maSo;
        this.mauSac = mauSac;
        this.soLuong = soLuong;
        this.chieuDai = chieuDai;
        this.chieuNgang = chieuNgang;
        this.giaBan = giaBan;
    }

    public long getGiaBan(){
        return giaBan;
    }

    public void nhapThongTin(){
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap vao ma so:");
        maSo= s.nextLine();
        System.out.print("Nhap vao mau sac:");
        mauSac= s.nextLine();
        System.out.print("Nhap vao so luong :");
        soLuong=s.nextInt();
        System.out.print("Nhap vao chieu dai :");
        chieuDai=s.nextInt();
        System.out.print("Nhap vao chieu ngang :");
        chieuNgang=s.nextInt();
        System.out.print("NHap vao gia ban :");
        giaBan=s.nextLong();
    }

    public void hienThi (){
        System.out.println("+ Ma so:" +maSo);
        System.out.println("+ Mau sac:" +mauSac);
        System.out.println("+ So luong:" +soLuong);
        System.out.println("+ Chieu dai:" +chieuDai);
        System.out.println("+ Chieu ngang:" +chieuNgang);
        System.out.println("+ Gia ban :" +giaBan);
    }

    public float giaBanLe() {
        return (float) giaBan/soLuong;
    }

    public int dienTichNenToiDa () {
        return soLuong * (chieuDai * chieuNgang);
    }
    public double soLuongHop(int D,int N){
        double svd = Math.ceil((double)D / chieuDai);
        double svn = Math.ceil((double)N / chieuNgang);
        return  Math.ceil( (svd * svn) / soLuong);
    }
}
