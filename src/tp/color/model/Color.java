package tp.color.model;

public class Color {

    private int red;
    private int green;
    private int blue;
    private String hex;

    private static final int lowerColorLimit = 0;
    private static final int higherColorLimit = 255;
    private static final int hexCodeLength = 7;

    public Color(int red, int green, int blue) {
        if (red < lowerColorLimit || red > higherColorLimit || green < lowerColorLimit || green > higherColorLimit || blue < lowerColorLimit || blue > higherColorLimit) {
            throw new IllegalArgumentException();
        } else {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.hex = String.format("#%02X%02X%02X", this.red, this.green, this.blue);
        }
    }

    public Color(String hexadecimal) {
        if (hexadecimal == null || hexadecimal.charAt(0) != '#' || hexadecimal.length() != hexCodeLength || hexadecimal.chars().anyMatch(Character::isLowerCase)) {
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
        if (red < lowerColorLimit || red > higherColorLimit) {
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
        if (green < lowerColorLimit || green > higherColorLimit) {
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
        if (blue < lowerColorLimit || blue > higherColorLimit) {
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
        if (hex == null || hex.charAt(0) != '#' || hex.length() != hexCodeLength || hex.chars().anyMatch(Character::isLowerCase)) {
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
