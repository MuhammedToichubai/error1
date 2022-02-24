package com.company;

public class Main {

    public static void main(String[] args) {
//        Эгерде берилген сан,квадрат эмес болсо,анда Error ду ыргытыныз.
//        (4,9,16 булсандар2,3,4сандарынынквадраты болупсаналат)

        error(4,9,16); //Егерде маанисине квадрат эмес бир санды берсениз Error ду ыргытат.

    }

    public static void error(int ... a ) {
        for (int it: a) {
          double db = Math.sqrt(it);
          int pow = it / (int) db;
          if (db == pow) {
            System.out.print((int) db+ " ");
          }
          else if (db != pow) {
            throw new Error();

          }
        }
    }

}
