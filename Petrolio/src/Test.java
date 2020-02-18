public class Test {
    public static void main(String[] args) {
        Petrolifera p = new Petrolifera();
        Sito s = new Sito();
        p.addSito(s);
        Marini pm = new Marini();
        Terrestri pt = new Terrestri();
        s.addPozzo(pm);
        s.addPozzo(pt);
        pm.setProfondita(50f);
        pm.setCapacitaEstrattiva(5000f);
        pm.setAttivo(true);
        pm.setCodice((int)(Math.random()));
        pm.toString();
        pt.setCodice((int)(Math.random()));
        pt.setAttivo(true);
        pt.setTerreno(Terreni.SABBIOSO);
        pt.setCapacitaEstrattiva(9000f);
        pt.toString();
        s.setGreggioEstratto();
        s.setProfonditaMediaPozzi();
        s.toString();
    }
}
