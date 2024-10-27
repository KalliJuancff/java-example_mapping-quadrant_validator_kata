package QuadrantValidatorKata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuadrantValidatorShould {
    private static final int FIRST = 1;
    private static final int SECOND = 2;

    @Test
    public void take_as_valid_first_quadrant() {
        assertThat(new QuadrantValidator().isValid(FIRST)).isTrue();
    }


    @Test
    public void take_as_invalid_second_quadrant() {
        assertThat(new QuadrantValidator().isValid(SECOND)).isFalse();
    }
}


// { 1 } -> True
// {2, 3, 4} -> False