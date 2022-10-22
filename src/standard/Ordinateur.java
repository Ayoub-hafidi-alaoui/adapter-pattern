package standard;

public class Ordinateur {
    private Hdmi hdmi;

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    public void afficher(byte[] data) {
        hdmi.display(data);
    }
}
