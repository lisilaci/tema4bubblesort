package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] SalesGuy1 = {500, 500, 500, 500, 500, 500, 500, 500, 500, 500};
        suma(SalesGuy1);
        int[] SalesGuy2 = {800, 800, 800, 800, 800, 800, 800, 800};
        suma(SalesGuy2);
        int[] SalesGuy3 = {900, 900, 900, 900, 900};
        suma(SalesGuy3);
        int[] SalesGuy4 = {300, 300, 300, 300, 300, 300, 300, 300, 300};
        suma(SalesGuy4);
        int[] SalesGuy5 = {1300, 1300, 1300, 1300, 1300};
        suma(SalesGuy5);

//        SalesRepresentative sg1 = new SalesRepresentative();
//        SalesRepresentative sg2 = new SalesRepresentative();
//        SalesRepresentative sg3 = new SalesRepresentative();
//        SalesRepresentative sg4 = new SalesRepresentative();
//        SalesRepresentative sg5 = new SalesRepresentative();

        SalesRepresentative sort = new SalesRepresentative();
        int[] saleGuys = {suma(SalesGuy1), suma(SalesGuy2), suma(SalesGuy3), suma(SalesGuy4), suma(SalesGuy5)};


//        SalesRepresentative [] sales  = {sg1, sg2, sg3, sg4, sg5};
        System.out.println(Arrays.toString(saleGuys));
        sort.bubbleSort(saleGuys);
        System.out.println("Sorted array:");
        sort.printArray(saleGuys);
        System.out.println(Arrays.toString(saleGuys));

    }

    public static int suma(int[] SalesGuy1) {
        int sum = 0;
        for (int i = 0; i < SalesGuy1.length; i++) {
            sum = sum + SalesGuy1[i];
        }
        return sum;
    }

}
