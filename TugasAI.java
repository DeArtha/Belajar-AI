public class TugasAI {

    public static void main(String[] args) {
        String asal[] = {"P", "K", "Sy", "Sg"};
        String[] seberang = new String[4];
        String[] seberangSementara = new String[4];
        String[] perahu = new String[2];
        String[] sisa = new String[2];
        String a = " ";
        String b = " ";
        String c = " ";

        for (int i = 0; i < asal.length; i++) {
            a += asal[i] + " ";
            seberangSementara[i] = "0";
            b += seberangSementara[i] + " ";
        }
        System.out.println("Keadaan Awal\n [" + a + "] = Daerah Asal\n [" + b + "] = Daerah Seberang\n\n");
        a = " ";
        b = " ";

        for (int i = 0; i < perahu.length; i++) {
            perahu[i] = asal[i];
            asal[i] = "0";
            sisa[i] = asal[i + 2];
            b += sisa[i] + " ";
            a += perahu[i] + " ";
        }

        System.out.println("Langkah 1 : [" + a + "] Menyeberang");
        System.out.println("Yang Belum Menyeberang : [" + b + "] \n\n");
        a = "";
        b = " ";
        c = " ";
        for (int i = 0; i < perahu.length; i++) {
            seberangSementara[i] = perahu[i];
            perahu[i] = "";
            if (seberangSementara[i].equalsIgnoreCase("P")) {
                perahu[i] = "P";
                seberangSementara[i] = "";
            }

            a += perahu[i] + "";
            b += seberangSementara[i] + " ";
            c += sisa[i] + " ";
        }

        System.out.println("Langkah 2 : [" + a + "] Kembali");
        System.out.println("Yang Belum Menyeberang : [" + c + "]");
        System.out.println("Yang Di Seberang : [" + b + "] \n\n");
        b = " ";
        a = " ";
        c = " ";
        for (int i = 0; i < perahu.length; i++) {
            if (perahu[i].equalsIgnoreCase("P")) {
                perahu[i + 1] = sisa[i];
                sisa[i] = "";
            }

            asal[i + 2] = sisa[i];
            b += sisa[i] + " ";
            a += perahu[i] + " ";
            c += seberangSementara[i] + " ";
        }
        System.out.println("Langkah 3 : [" + a + "] Menyeberang");
        System.out.println("Yang Belum Menyeberang : [" + b + "]");
        System.out.println("Yang Di Seberang : [" + c + "]\n\n");
        b = " ";
        a = "";
        c = " ";
        for (int i = 0; i < perahu.length; i++) {
            seberangSementara[i] = perahu[i];
            perahu[i] = "P ";

            if (seberangSementara[i].equalsIgnoreCase("Sy")) {
                perahu[i] = "K";
                seberangSementara[i] = "Sy";
                b += seberangSementara[i] + " ";
                seberangSementara[i - 1] = " ";
            }

            a += perahu[i] + "";
            c += sisa[i] + " ";
        }

        System.out.println("Langkah 4 : [" + a + "] Kembali");
        System.out.println("Yang Belum Menyeberang : [" + c + "]");
        System.out.println("Yang Di Seberang : [" + b + "] \n\n");
        b = " ";
        a = " ";
        c = " ";
        for (int i = 0; i < perahu.length; i++) {
            if (perahu[i].equalsIgnoreCase("K")) {
                perahu[i] = sisa[i];
                sisa[i] = "K";

            }

            asal[i] = sisa[i];
            b += sisa[i] + " ";
            a += perahu[i] + " ";
            c += seberangSementara[i] + " ";
        }

        System.out.println("Langkah 5 : [" + a + "] Menyeberang");
        System.out.println("Yang Belum Menyeberang : [" + b + "] ");
        System.out.println("Yang Di Seberang : [" + c + "]\n\n");
        a = "";
        b = " ";
        c = " ";
        for (int i = 0; i < perahu.length; i++) {
            seberangSementara[i] = perahu[i];
            perahu[i] = "P";
            seberang[i] = " ";
            if (seberangSementara[i].equalsIgnoreCase("Sg")) {
                perahu[i] = " ";
                seberangSementara[i + 1] = "Sg";
                seberang[i + 2] = seberangSementara[i + 1];

            }
            seberangSementara[0] = "Sy";
            if (i == 1) {
                seberang[i + 1] = seberangSementara[0];
            }

            b += seberangSementara[i] + " ";
            a += perahu[i] + "";
            c += sisa[i] + " ";

        }

        System.out.println("Langkah 6 : [" + a + "] Kembali");
        System.out.println("Yang Belum Menyeberang : [" + c + "]");
        System.out.println("Yang Di Seberang : [" + b + "] \n\n");
        b = " ";
        a = " ";
        for (int i = 0; i < perahu.length; i++) {
            if (sisa[i].equalsIgnoreCase("K")) {
                perahu[i] = "K";
                sisa[i] = "";
            }
            b += sisa[i] + " ";
            a += perahu[i] + " ";

        }

        System.out.println("Langkah 7 : [" + a + "] Menyeberang\n\n");

        a = " ";
        b = " ";
        for (int i = 0; i < seberang.length; i++) {
            if (i < 2) {
                seberangSementara[i] = perahu[i];
                perahu[i] = " ";
            }
            if (seberang[i].equalsIgnoreCase(" ")) {
                seberang[i] = seberangSementara[i];

            }
            asal[i] = "0";
            b += seberang[i] + " ";
            a += asal[i] + " ";

        }
        System.out.println("Keadaan Akhir\n [" + a + "] = Daerah Asal\n [" + b + "] = Daerah Seberang");

    }
}
