package tp.color.model;

public class Color {

    private int red;
    private int green;
    private int blue;
    private String hex;

    public Color(int red, int green, int blue) throws IllegalArgumentException {

        if (red < 0 || red >= 255) {
            throw new IllegalArgumentException();
        } else if (green < 0 || green >= 255) {
            throw new IllegalArgumentException();
        } else if (blue < 0 || blue >= 255) {
            throw new IllegalArgumentException();
        }

        this.red = red;
        this.green = green;
        this.blue = blue;

        this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
    }

    public Color(String hexadecimal) throws IllegalArgumentException {

        if (hexadecimal.charAt(0) != '#') {
            throw new IllegalArgumentException();
        } else if ((hexadecimal.length() != 7)) {
            throw new IllegalArgumentException();
        } else {
            this.hex = hexadecimal;
            Color color = new Color(
                    Integer.valueOf(this.hex.substring(1, 3), 16),
                    Integer.valueOf(this.hex.substring(3, 5), 16),
                    Integer.valueOf(this.hex.substring(5, 7), 16)
            );

            this.red = color.getRed();
            this.green = color.getGreen();
            this.blue = color.getBlue();
        }

    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = red;
        this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
    }

    public int getGreen() {
        return this.green;
    }

    public void setGreen(int green) {
        this.green = green;
        this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
    }

    public int getBlue() {
        return this.blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
        this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
    }

    public String getHex() {
        return this.hex;
    }

    public void setHex(String hex) {

        if (hex.charAt(0) != '#') {
            throw new IllegalArgumentException();
        } else if ((hex.length() != 7)) {
            throw new IllegalArgumentException();
        } else {

            this.hex = hex;
            Color color = new Color(
                    Integer.valueOf(hex.substring(1, 3), 16),
                    Integer.valueOf(hex.substring(3, 5), 16),
                    Integer.valueOf(hex.substring(5, 7), 16)
            );

            this.red = color.getRed();
            this.green = color.getGreen();
            this.blue = color.getBlue();
        }
    }

    @Override
    public String toString() {
        return "[value=" + this.getHex() + ", r=" + this.getRed() + ", g=" + this.getGreen() + ", b=" + this.getBlue() + "]";
    }
}
