package benjamin.newday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiamondTest {
    @Test
    void testValidInputA() {
        char character = 'A';
        String expectedDiamond = "A" + System.lineSeparator();

        String actualDiamond = Diamond.drawDiamond(character);

        Assertions.assertEquals(expectedDiamond, actualDiamond);
    }

    @Test
    void testValidInputZ() {
        char character = 'Z';
        String expectedDiamond = "                         A                         " + System.lineSeparator() +
                "                        B B                        " + System.lineSeparator() +
                "                       C   C                       " + System.lineSeparator() +
                "                      D     D                      " + System.lineSeparator() +
                "                     E       E                     " + System.lineSeparator() +
                "                    F         F                    " + System.lineSeparator() +
                "                   G           G                   " + System.lineSeparator() +
                "                  H             H                  " + System.lineSeparator() +
                "                 I               I                 " + System.lineSeparator() +
                "                J                 J                " + System.lineSeparator() +
                "               K                   K               " + System.lineSeparator() +
                "              L                     L              " + System.lineSeparator() +
                "             M                       M             " + System.lineSeparator() +
                "            N                         N            " + System.lineSeparator() +
                "           O                           O           " + System.lineSeparator() +
                "          P                             P          " + System.lineSeparator() +
                "         Q                               Q         " + System.lineSeparator() +
                "        R                                 R        " + System.lineSeparator() +
                "       S                                   S       " + System.lineSeparator() +
                "      T                                     T      " + System.lineSeparator() +
                "     U                                       U     " + System.lineSeparator() +
                "    V                                         V    " + System.lineSeparator() +
                "   W                                           W   " + System.lineSeparator() +
                "  X                                             X  " + System.lineSeparator() +
                " Y                                               Y " + System.lineSeparator() +
                "Z                                                 Z" + System.lineSeparator() +
                " Y                                               Y " + System.lineSeparator() +
                "  X                                             X  " + System.lineSeparator() +
                "   W                                           W   " + System.lineSeparator() +
                "    V                                         V    " + System.lineSeparator() +
                "     U                                       U     " + System.lineSeparator() +
                "      T                                     T      " + System.lineSeparator() +
                "       S                                   S       " + System.lineSeparator() +
                "        R                                 R        " + System.lineSeparator() +
                "         Q                               Q         " + System.lineSeparator() +
                "          P                             P          " + System.lineSeparator() +
                "           O                           O           " + System.lineSeparator() +
                "            N                         N            " + System.lineSeparator() +
                "             M                       M             " + System.lineSeparator() +
                "              L                     L              " + System.lineSeparator() +
                "               K                   K               " + System.lineSeparator() +
                "                J                 J                " + System.lineSeparator() +
                "                 I               I                 " + System.lineSeparator() +
                "                  H             H                  " + System.lineSeparator() +
                "                   G           G                   " + System.lineSeparator() +
                "                    F         F                    " + System.lineSeparator() +
                "                     E       E                     " + System.lineSeparator() +
                "                      D     D                      " + System.lineSeparator() +
                "                       C   C                       " + System.lineSeparator() +
                "                        B B                        " + System.lineSeparator() +
                "                         A                         " + System.lineSeparator();

        String actualDiamond = Diamond.drawDiamond(character);

        Assertions.assertEquals(expectedDiamond, actualDiamond);
    }

    @Test
    void testInvalidInput() {
        char character = '1';

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Diamond.drawDiamond(character);
        });
    }
}