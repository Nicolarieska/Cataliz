/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Disk {
    static int move = 1;

    public static void main(String[] args) {
        Scanner nico = new Scanner(System.in);
        System.out.print("Masukan Jumlah Disk: ");
        int Cakram = nico.nextInt();
        hanoi (Cakram, 'A', 'B', 'C');}

    static void hanoi (int Cakram, char awal, char bantu, char tujuan){

    if (Cakram >= 1) { 
        hanoi (Cakram-1, awal, tujuan, bantu);
        move(Cakram, awal, tujuan);
        hanoi (Cakram-1, bantu, awal, tujuan);
        }
    }

    static void move (int step, char start, char destination){
        System.out.println("Langkah "+move);
        move++;
        System.out.print("Pindahkan Cakram "+step);
        System.out.print(" dari "+start);
        System.out.println(" ke "+destination);
    }
}
