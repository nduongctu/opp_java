package DoanThang;

import java.util.Scanner;

public class Diem {
    private int x;
    private int y;

    Diem (){
        x = y = 0;
    }

    Diem(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void nhapDiem(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap vao hoanh do x:");
        x= s.nextInt();
        System.out.print("Nhap vao tung do y:");
        y=s.nextInt();
    }

    public void hienThi(){
        System.out.print("(" + x + "," + y + ")");
    }

    public void doiDiem( int dx,int dy){
        x += dx;
        y += dy;
    }

    public int giaTriX(){
        return x;
    }

    public int giaTriY(){
        return y;
    }

    public float khoangCach(){
        return (float)Math.sqrt(x * x + y * y);
    }

    public float khoangCach(Diem d){
        return (float)Math.sqrt((x-d.x) * (x-d.x) + (y-d.y) * (y-d.y));
    }
}