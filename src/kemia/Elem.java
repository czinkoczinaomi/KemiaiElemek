
package kemia;

/**
 *
 * @author Nami
 */
public class Elem {
    private String felfedezesKora;
    private String neve;
    private String vegyJel;
    private int rendszam;
    private String felfedezo;

    public Elem(String sor) {
        String[] s= sor.split(";");
        this.felfedezesKora=s[0];
        this.neve=s[1];
        this.vegyJel=s[2];
        this.rendszam=Integer.parseInt(s[3]);
        this.felfedezo=s[4];
    }

    public String getFelfedezesKora() {
        return felfedezesKora;
    }

    public String getNeve() {
        return neve;
    }

    public String getVegyJel() {
        return vegyJel;
    }

    public int getRendszam() {
        return rendszam;
    }

    public String getFelfedezo() {
        return felfedezo;
    }

    @Override
    public String toString() {
        return "Elem{" + "felfedezesKora=" + felfedezesKora + ", neve=" + neve + ", vegyJel=" + vegyJel + ", rendszam=" + rendszam + ", felfedezo=" + felfedezo + '}';
    }
    
    
}
