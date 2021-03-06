package com.BWINF2014.Bruchrechnen;

import java.util.Scanner;
import com.BWINF2014.Bruchrechnen.util.*;

public class Main {

    public static void main(String[] args) {
        int a; //a div b
        int b;
        double p;//p div q
        double q;
        String[] Aufgaben = new String[256];
        String[] Loesungen = new String[256];

        Scanner s = new Scanner(System.in);
        System.out.println("Leicht(1), Mittel(2) oder Schwer(3)?");
        try {
            switch (s.nextInt()) {


                //region Leicht
                case 1: {
                    boolean found;
                    System.out.println("Bitte Anzahl der Aufgaben eingeben");
                    int AufgCount = s.nextInt();
                    for (int i = 1; i <= AufgCount; i++) {
                        found = false;
                        while (!found) {
                           /*random[1] = (int) (Math.random() * 98 + 1);
                           random[2] = (int) (Math.random() * 98 + 1);*/
                            a = (int) MathUtil.Random(99, false);
                            b = (int) MathUtil.Random(99, false);
                            if (a < b) {
                                int aTmp = a;
                                while (!(b % aTmp == 0)) {
                                    aTmp--;
                                }
                                p = (double) a / aTmp;
                                q = (double) b / aTmp;

                                //Unused int pCount;


                                if ((MathUtil.Count(a) + MathUtil.Count(b)) == 4 && (p+q <= 10) && ((double) (p / q) == (double) (a/b)) && a != b) {
                                    found = true;
                                    Aufgaben[i] = (a + "/" + b);
                                    Loesungen[i] = (MathUtil.round(p, 5) + "/" + MathUtil.round(q,5));


                                }

                            } else {
                                int bTmp = b;
                                while (!(a % bTmp == 0)) {
                                    bTmp--;
                                }
                                p = (double) a / bTmp;
                                q = (double) b / bTmp;

                                if ((MathUtil.Count(a) + MathUtil.Count(b)) == 4 && (p+q <= 10) && ((double) (p / q) == (double) (a/b)) && a != b) {
                                    found = true;
                                    Aufgaben[i] = (a + "/" + b);
                                    Loesungen[i] = (MathUtil.round(p,5) + "/" + MathUtil.round(q,5));
                                }
                            }


                        }
                        System.out.println("Aufgabe " + i + " = " + Aufgaben[i]);
                        System.out.println("Lösungen Aufgabe " + i + " = " + Loesungen[i]);
                    }


                break;
                }
    //endregion

                //region Mittel
                case 2: {
                    boolean found;
                    System.out.println("Bitte Anzahl der Aufgaben eingeben");
                    int AufgCount = s.nextInt();
                    for (int i = 1; i <= AufgCount; i++) {
                        found = false;
                        while (!found) {

                            a = (int) MathUtil.Random(999, false);
                            b = (int) MathUtil.Random(99, false);

                            if (a < b) {
                                int aTmp = a;
                                while (!(b % aTmp == 0)) {
                                    aTmp--;
                                }

                                p = (double) a / aTmp;
                                q = (double) b / aTmp;

                                if ((MathUtil.Count(a) + MathUtil.Count(b)) == 5 && ( (p+q) > 10) && (p+q <= 20) && ((double) (p / q) == (double) (a/b)) && a != b) {
                                    found = true;
                                    Aufgaben[i] = (a + "/" + b);
                                    Loesungen[i] = (MathUtil.round(p,5) + "/" + MathUtil.round(q,5));


                                }

                            } else {
                                int bTmp = b;
                                while (!(a % bTmp == 0)) {
                                    bTmp--;
                                }

                                p = (double) a / bTmp;
                                q = (double) b / bTmp;

                                if ((MathUtil.Count(a) + MathUtil.Count(b)) == 5 && ( (p+q) > 10) && (p+q <= 20) && ((double) (p / q) == (double) (a/b)) && a != b) {
                                    found = true;
                                    Aufgaben[i] = (a + "/" + b);
                                    Loesungen[i] = (MathUtil.round(p,5) + "/" + MathUtil.round(q,5));
                                }
                            }


                        }
                        System.out.println("Aufgabe " + i + " = " + Aufgaben[i]);
                        System.out.println("Lösungen Aufgabe " + i + " = " + Loesungen[i]);
                    }

                    break;
                }
    //endregion

                //region Schwer
                case 3: {
                    boolean found;
                    System.out.println("Bitte Anzahl der Aufgaben eingeben");
                    int AufgCount = s.nextInt();
                    for (int i = 1; i <= AufgCount; i++) {
                        found = false;

                        while (!found) {

                            a = (int) MathUtil.Random(999, false);
                            b = (int) MathUtil.Random(99, false);

                            if (a < b) {
                                int aTmp = a;
                                while (!(b % aTmp == 0) && aTmp != 1) {
                                    aTmp--;
                                }

                                p = (double) a / aTmp;
                                q = (double) b / aTmp;

                                if ((MathUtil.Count(a) + MathUtil.Count(b)) == 5 && ( (p+q) > 20) && (p+q <= 30) && ((double) (p / q) == (double) (a/b)) && a != b) {
                                    found = true;
                                    Aufgaben[i] = (a + "/" + b);
                                    Loesungen[i] = (MathUtil.round(p,5) + "/" + MathUtil.round(q,5));


                                }

                            } else {
                                int bTmp = b;
                                while (!(a % bTmp == 0) && bTmp != 1) {
                                    bTmp--;
                                }

                                p = (double) a / bTmp;
                                q = (double) b / bTmp;

                                if ((MathUtil.Count(a) + MathUtil.Count(b)) == 5 && ( (p+q) > 20) && (p+q <= 30) && ((float) (p / q) == (float) (a/b))) {
                                    found = true;
                                    Aufgaben[i] = (a + "/" + b);
                                    Loesungen[i] = (MathUtil.round(p,10) + "/" + MathUtil.round(q,10));
                                }
                            }


                        }

                        System.out.println("Aufgabe " + i + " = " + Aufgaben[i]);
                        System.out.println("Lösungen Aufgabe " + i + " = " + Loesungen[i]);
                    }

                    //break;
                }
    //endregion
            }
        } catch (Exception e) {
            System.out.println("Schwerwiegender Fehler:\n" + e.toString());

            e.printStackTrace();

           
        }

    }
}
