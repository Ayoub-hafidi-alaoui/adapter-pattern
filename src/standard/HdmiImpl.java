package standard;

import java.nio.charset.StandardCharsets;

public class HdmiImpl implements Hdmi {
    @Override
    public void display(byte[] data) {
        System.out.println("---------------hdmi---------------");
        System.out.println(new String(data, StandardCharsets.UTF_8));
        System.out.println("------------hdmi-------------------x");
    }
}
