package tp.color.model;

public class Color {

    private int red;
    private int green;
    private int blue;
    private String hex;

    private static final int lowerColorLimit = 0;
    private static final int higherColorLimit = 255;
    private static final int hexCodeLength = 7;

    /**
     * Constructeur avec code RGB
     * @param red int
     * @param green int
     * @param blue int
     */
    public Color(int red, int green, int blue) {
        if (checkColorValue(red) && checkColorValue(green) && checkColorValue(blue)) {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    /**
     * Constructeur avec un code hexadécimal en entrée (format #D3D3D3)
     * @param hexadecimal String (code hexadécimal)
     */
    public Color(String hexadecimal) {
        if (checkHexadecimal(hexadecimal)) {
            this.hex = hexadecimal;
            this.red = Integer.valueOf(this.hex.substring(1, 3), 16);
            this.green = Integer.valueOf(this.hex.substring(3, 5), 16);
            this.blue = Integer.valueOf(this.hex.substring(5, 7), 16);
        }
    }

    /**
     * Méthode pour formatage de code hexadécimal depuis valeurs RGB
     * @param red
     * @param green
     * @param blue
     * @return String hexadecimal
     */
    private String formatStringHex(int red, int green, int blue) {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    /**
     * Vérification du format de chaine hexadécimale
     * @param hexadecimal
     * @return boolean
     */
    private boolean checkHexadecimal(String hexadecimal) {
        if (hexadecimal == null || hexadecimal.charAt(0) != '#' || hexadecimal.length() != hexCodeLength || hexadecimal.chars().anyMatch(Character::isLowerCase)) {
            throw new IllegalArgumentException();
        } else {
            return true;
        }
    }

    /**
     * Vérification que la couleur est bien dans les limites établies par les constantes lowerColorLimit et higherColorLimit
     * @param color
     * @return boolean
     */
    private boolean checkColorValue(int color) {
        if (color < lowerColorLimit || color > higherColorLimit) {
            throw new IllegalArgumentException();
        } else {
            return true;
        }
    }

    /**
     * Getter pour couleur rouge
     * @return this.red
     */
    public int getRed() {
        return this.red;
    }

    /**
     * Setter pour couleur rouge avec redéfinition du code hexadecimal
     * @param red
     */
    public void setRed(int red) {
        if (checkColorValue(red)) {
            this.red = red;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    /**
     * Getter pour couleur verte
     * @return this.green
     */
    public int getGreen() {
        return this.green;
    }

    /**
     * Setter pour couleur verte avec redéfinition du code hexadécimal
     * @param green
     */
    public void setGreen(int green) {
        if (checkColorValue(green)) {
            this.green = green;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    /**
     * Getter pour couleur bleue
     * @return this.blue
     */
    public int getBlue() {
        return this.blue;
    }

    /**
     * Setter pour couleur bleue avec redéfinition du code hexadécimal
     * @param blue
     */
    public void setBlue(int blue) {
        if (checkColorValue(blue)) {
            this.blue = blue;
            this.hex = formatStringHex(this.red, this.green, this.blue);
        }
    }

    /**
     * Getter pour valeur de code hexadécimal
     * @return
     */
    public String getHexValue() {
        return this.hex;
    }

    /**
     * Setter pour code hexadécimal avec redéfinition des codes couleurs rgb associés
     * @param hex String (format #D3D3D3)
     */
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
