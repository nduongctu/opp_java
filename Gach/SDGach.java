package Gach;

import java.util.Scanner;

public class SDGach {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Nhap vao so loai gach :");
        n=s.nextInt();

        Gach gach[] = new Gach[n];
        for(int i =0;i<n;i++) {
            gach[i] = new Gach();
            System.out.println("Nhap vao thong tin loai gach thu " + (i + 1) + " :");
            gach[i].nhapThongTin();
        }

        for(int i=0;i<n;i++){
            System.out.println("Thong tin loai gach thu " +(i+1) + ";");
            gach[i].hienThi();
        }

        Gach g = gach[0];
        double min_cp = (double)gach[0].getGiaBan() / gach[0].dienTichNenToiDa();
        for(int i =1;i<n;i++){
            if((double)gach[i].getGiaBan() / gach[i].dienTichNenToiDa() < min_cp) {
                min_cp = (double)gach[i].getGiaBan() / gach[i].dienTichNenToiDa();
                g=gach[i];
            }
        }
        System.out.println("Loai gach co chi phi lot thap nhat la :");
        g.hienThi();

        for(int i=0;i<n;i++){
            double cp = gach[i].soLuongHop(2000,500) * gach[i].getGiaBan();
            System.out.println("Chi phi lot cua loai gach thu " + (i+1) + " la :" +cp);

        }
    }
}
