
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga indonesia = new Liga("indonesia");
        Liga inggris = new Liga("inggris");

        //Divisi
        Divisi utama = new Divisi("divisi utama",indonesia);
        Divisi isl = new Divisi("isl",indonesia);
        Divisi premiereLeague = new Divisi("premiere league",inggris);

        //Klub
        Klub psil = new Klub("psil",utama,indonesia);
        Klub persij = new Klub("persij",utama,indonesia);
        Klub arema = new Klub("arema",isl,indonesia);
        Klub persija = new Klub("persija",isl,indonesia);
        Klub chelsea = new Klub("chelsea",premiereLeague,inggris);
        Klub liverpool = new Klub("liverpool",premiereLeague,inggris);


        indonesia.setDaftarDivisi(utama);
        indonesia.setDaftarDivisi(isl);
        inggris.setDaftarDivisi(premiereLeague);


        utama.setDaftarKlub(psil);
        utama.setDaftarKlub(persij);
        isl.setDaftarKlub(arema);
        isl.setDaftarKlub(persija);
        premiereLeague.setDaftarKlub(chelsea);
        premiereLeague.setDaftarKlub(liverpool);


        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga indonesia : ");
        indonesia.getDaftarDivisi("indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga indonesia : ");
        utama.getDaftarKlubLiga("indonesia");
        System.out.println("Liga inggris : ");
        premiereLeague.getDaftarKlubLiga("inggris");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("utama : ");
        utama.getDaftarKlubDivisi("utama");
        System.out.println("isl : ");
        isl.getDaftarKlubDivisi("isl");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        psil.getDivisi("psil");
        persija.getDivisi("persija");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        persija.getLiga("persija");
    }
}

