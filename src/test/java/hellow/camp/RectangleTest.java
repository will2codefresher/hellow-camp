package hellow.camp;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(3.1 ,4.2);
    }

    @Test
    public void should_get_circumference() {
        // given

        // when
        double circumference = rectangle.circumference();

        // then
        assertThat(circumference).isEqualTo(14.6);

    }

    @Test
    public void should_get_area() {
        // given

        // when
        double area = rectangle.area();

        // then
        assertThat(area).isEqualTo(13);
    }
}