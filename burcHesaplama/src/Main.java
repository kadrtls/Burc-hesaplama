import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day,month;
        String burc="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaçıncı ayda doğdunuz:");
        month= scanner.nextInt();
        System.out.println("kaçıncı günde doğdunuz:");
        day= scanner.nextInt();

        switch (month){
            case 1:
                if (day>=1&&day<=31){
                    if (day<22){
                        burc="oğlak";
                    }else {
                        burc="kova";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 2:
                if (day>=1&&day<=28){
                    if (day<20){
                        burc="kova";
                    }else {
                        burc="balık";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 3:
                if (day>=1&&day<=31){
                    if (day<21){
                        burc="balık";
                    }else {
                        burc="koç";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 4:
                if (day>=1&&day<=30){
                    if (day<21){
                        burc="koç";
                    }else {
                        burc="boğa";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 5:
                if (day>=1&&day<=31){
                    if (day<22){
                        burc="boğa";
                    }else {
                        burc="ikizler";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 6:
                if (day>=1&&day<=30){
                    if (day<23){
                        burc="ikizler";
                    }else {
                        burc="yengeç";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 7:
                if (day>=1&&day<=31){
                    if (day<23){
                        burc="yengeç";
                    }else {
                        burc="aslan";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 8:
                if (day>=1&&day<=31){
                    if (day<23){
                        burc="aslan";
                    }else {
                        burc="başak";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 9:
                if (day>=1&&day<=30){
                    if (day<23){
                        burc="başak";
                    }else {
                        burc="terazi";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 10:
                if (day>=1&&day<=31){
                    if (day<23){
                        burc="terazi";
                    }else {
                        burc="akrep";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 11:
                if (day>=1&&day<=30){
                    if (day<22){
                        burc="akrep";
                    }else {
                        burc="yay";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;
            case 12:
                if (day>=1&&day<=31){
                    if (day<22){
                        burc="yay";
                    }else {
                        burc="oğlak";
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }break;

            default:
                System.out.println("geçersiz bir ay girdiniz");
        }
        System.out.println("burcunuz:" + burc);
    }
}