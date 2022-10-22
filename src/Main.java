import adapter.HdmiVgaAdapter;
import ancien.VideoProjecteur;
import standard.HdmiImpl;
import standard.Ordinateur;

public class Main {
    public static void main(String[] args) {

        Ordinateur ordinateur = new Ordinateur();
        ordinateur.setHdmi(new HdmiImpl());
        String str = "bonjour ayoub";
        HdmiVgaAdapter vgaAdapter = new HdmiVgaAdapter();
        vgaAdapter.setVga(new VideoProjecteur());
        ordinateur.setHdmi(vgaAdapter);
        ordinateur.afficher(str.getBytes());

    }
}