package standard;

public class HdmiImpl2 implements Hdmi {
    @Override
    public void display(byte[] data) {
        System.out.println("implementation 2");
        System.out.println(new String(data));
    }
}
