package tp.color.model;

public class Color {

    private int red;
    private int green;
    private int blue;


    public Color(int red, int green, int blue) throws IllegalArgumentException{
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(String hexadecimal) throws IllegalArgumentException{

        java.awt.Color color =  java.awt.Color.decode(hexadecimal);
        this.red = color.getRed();
        this.green = color.getGreen();
        this.blue = color.getBlue();

    }

    public int getRed() {
        return this.red;
    }

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }
}
