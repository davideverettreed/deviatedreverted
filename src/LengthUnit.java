public enum LengthUnit {
    public static String fromInchesToFeet(int inches){
        int feet = inches / 12;
        int remainer = inches % 12;

        return String.valueOf(feet) + "ft " + String.valueOf(remainer) + "in";
    }
}
