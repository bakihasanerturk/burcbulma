package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ay,gun;

        Scanner input = new Scanner(System.in);

        System.out.print("Gün : ");
        gun = input.nextInt();

        System.out.print("Ay : ");
        ay = input.nextInt();

        if ((gun>=21 && ay==3)||(gun<=20 && ay==4)){
            System.out.println("Koç Burcu");
        }else if ((gun>=21 && ay==4)||(gun<=21 && ay==5)){
            System.out.println("Boğa Burcu");
        }else if ((gun>=22 && ay==5)||(gun<=22 && ay==6)){
            System.out.println("İkizler Burcu");
        }else if ((gun>=23 && ay==6)||(gun<=22 && ay==7)){
            System.out.println("Yengeç Burcu");
        }else if ((gun>=23 && ay==7)||(gun<=22 && ay==8)){
            System.out.println("Aslan Burcu");
        }else if ((gun>=23 && ay==8)||(gun<=22 && ay==9)){
            System.out.println("Başak Burcu");
        }else if ((gun>=23 && ay==9)||(gun<=22 && ay==10)){
            System.out.println("Terazi Burcu");
        }else if ((gun>=23 && ay==10)||(gun<=21 && ay==11)){
            System.out.println("Akrep Burcu");
        }else if ((gun>=22 && ay==11)||(gun<=21 && ay==12)){
            System.out.println("Yay Burcu");
        }else if ((gun>=22 && ay==12)||(gun<=21 && ay==1)){
            System.out.println("Oğlak Burcu");
        }else if ((gun>=22 && ay==1)||(gun<=19 && ay==2)){
            System.out.println("Kova Burcu");
        }else{
            System.out.println("Balık Burcu");
        }
    }
}
