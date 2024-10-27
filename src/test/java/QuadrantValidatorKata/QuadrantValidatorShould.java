package QuadrantValidatorKata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class QuadrantValidatorShould {
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;


    @Test
    public void take_as_valid_first_quadrant() {
        assertThat(new QuadrantValidator().isValid(FIRST)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {SECOND, THIRD, FOURTH})
    public void take_as_invalid_rest_of_quadrants(int quadrant) {
        assertThat(new QuadrantValidator().isValid(quadrant)).isFalse();
    }
}


// { 1 } -> True
// {2, 3, 4} -> False