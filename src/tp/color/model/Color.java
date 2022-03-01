package tp.color.model;

public class Color {

    private int red;
    private int green;
    private int blue;
    private String hex;


    public Color(int red, int green, int blue) throws IllegalArgumentException{
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(String hexadecimal) throws IllegalArgumentException{

        this.hex = hexadecimal;

        Color color =  new Color(
                Integer.valueOf(hexadecimal.substring(1, 3), 16),
                Integer.valueOf(hexadecimal.substring(3, 5), 16),
                Integer.valueOf(hexadecimal.substring(5, 7), 16)
        );

        this.red = color.getRed();
        this.green = color.getGreen();
        this.blue = color.getBlue();

    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red){
        this.red = red;
    }

    public int getGreen(){
        return this.green;
    }

    public void setGreen(int green){
        this.green = green;
    }

    public int getBlue(){
        return this.blue;
    }
}
