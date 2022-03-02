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
        if (checkColorValue(red) && checkColorValue(green) && checkColorValue(blue)) {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    public Color(String hex) {
        if (checkHexadecimal(hex)) {
            this.hex = hex;
            this.red = Integer.valueOf(this.hex.substring(1, 3), 16);
            this.green = Integer.valueOf(this.hex.substring(3, 5), 16);
            this.blue = Integer.valueOf(this.hex.substring(5, 7), 16);
        }
    }

    private String formatStringHex(int red, int green, int blue) {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    private boolean checkHexadecimal(String hex) {
        if (hex == null || hex.charAt(0) != '#' || hex.length() != hexCodeLength || hex.chars().anyMatch(Character::isLowerCase)) {
            throw new IllegalArgumentException();
        } else {
            return true;
        }
    }

    private boolean checkColorValue(int color) {
        if (color < lowerColorLimit || color > higherColorLimit) {
            throw new IllegalArgumentException();
        } else {
            return true;
        }
    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        if (checkColorValue(red)) {
            this.red = red;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    public int getGreen() {
        return this.green;
    }

    public void setGreen(int green) {
        if (checkColorValue(green)) {
            this.green = green;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    public int getBlue() {
        return this.blue;
    }

    public void setBlue(int blue) {
        if (checkColorValue(blue)) {
            this.blue = blue;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    public String getHexValue() {
        return this.hex;
    }

    public void setHexValue(String hex) {
        if (checkHexadecimal(hex)) {
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
