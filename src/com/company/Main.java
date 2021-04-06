package com.company;

import java.util.Scanner;

public class Main {
    public static int[] usd(Scanner sc) {
        int size;
        do {
            System.out.println("Enter size");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        System.out.println("Enter element");
        int usd[] = new int[size];
        for (int i = 0; i < usd.length; i++) {
            usd[i] = sc.nextInt();
        }
        return  usd;
    }

    public static void maxusd(int usd[]) {
        int max = usd[0];
        for(int j = 1 ; j < usd.length ; j++){
            if( usd[j] > max){
                max =usd[j];
            }
        }
        System.out.println("max la: " +max);
    }

    public static void main(String[] args){
            // write your code here
            Scanner sc = new Scanner(System.in);
            int []usd=usd(sc);
            maxusd(usd);


        }

//        System.out.println("display usd");
//        for(int a: usd){
//            System.out.println(a);
//        }

//        System.out.println("Ti phu  giau nhat co so tie la : " + max);


    }

