package tp.color.model;

public class Color {

    private int red;
    private int green;
    private int blue;
    private String hex;

    public Color(int red, int green, int blue) {

        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
        else {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
        }

    }

    public Color(String hexadecimal) {

        if (hexadecimal == null || hexadecimal.charAt(0) != '#' || hexadecimal.length() != 7 || hexadecimal.chars().anyMatch(Character::isLowerCase)) {
            throw new IllegalArgumentException();
        } else {
            this.hex = hexadecimal;
            this.red = Integer.valueOf(this.hex.substring(1, 3), 16);
            this.green = Integer.valueOf(this.hex.substring(3, 5), 16);
            this.blue = Integer.valueOf(this.hex.substring(5, 7), 16);
        }

    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException();
        } else {
            this.red = red;
            this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
        }
    }

    public int getGreen() {
        return this.green;
    }

    public void setGreen(int green) {
        if (green < 0 || green > 255) {
            throw new IllegalArgumentException();
        } else {
            this.green = green;
            this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
        }
    }

    public int getBlue() {
        return this.blue;
    }

    public void setBlue(int blue) {
        if (blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        } else {
            this.blue = blue;
            this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
        }
    }

    public String getHexValue() {
        return this.hex;
    }

    public void setHexValue(String hex) {

        if (hex == null || hex.charAt(0) != '#' || hex.length() != 7 || hex.chars().anyMatch(Character::isLowerCase)) {
            throw new IllegalArgumentException();
        } else {
            this.hex = hex;
            this.red = Integer.valueOf(this.hex.substring(1, 3), 16);
            this.green = Integer.valueOf(this.hex.substring(3, 5), 16);
            this.blue = Integer.valueOf(this.hex.substring(5, 7), 16);
        }
    }

    @Override
    public String toString() {
        return "[value=" + this.getHexValue() + ", r=" + this.getRed() + ", g=" + this.getGreen() + ", b=" + this.getBlue() + "]";
    }
}
