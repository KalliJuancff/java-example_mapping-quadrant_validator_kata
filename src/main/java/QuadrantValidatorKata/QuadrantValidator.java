package QuadrantValidatorKata;

public class QuadrantValidator {
    private static final int SECOND = 2;
    private static final int THIRD = 3;

    public boolean isValid(int quadrant) {
        if (quadrant == SECOND || quadrant == THIRD) {
            return false;
        }

        return true;
    }
}
