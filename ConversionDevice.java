public class ConversionDevice {
    private static final float FEET_TO_INCH_CONVERT_RATIO =12, YARDS_TO_FEET_CONVERT_RATIO =3, INCHES_TO_YARDS_RATIO =0.027f;

    public static float convertFeetToInches(float feet)
    {
        return FEET_TO_INCH_CONVERT_RATIO *feet;
    }
    public static float convertYardsToFeet(float yards)
    {
        return YARDS_TO_FEET_CONVERT_RATIO *yards;
    }
    public static float convertInchesToYards(float inches)
    {
        return INCHES_TO_YARDS_RATIO *inches;
    }
}
