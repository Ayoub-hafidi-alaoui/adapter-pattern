package adapter;

import ancien.VGA;
import standard.Hdmi;

public class HdmiVgaAdapter implements Hdmi {
    private VGA vga;

    @Override
    public void display(byte[] data) {
        vga.print("from bvga");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
