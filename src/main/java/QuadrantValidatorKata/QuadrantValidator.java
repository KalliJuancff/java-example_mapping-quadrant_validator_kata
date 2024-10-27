package QuadrantValidatorKata;

public class QuadrantValidator {
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;

    public boolean isValid(int quadrant) {
        if (quadrant == SECOND || quadrant == THIRD || quadrant == FOURTH) {
            return false;
        }

        return true;
    }
}
