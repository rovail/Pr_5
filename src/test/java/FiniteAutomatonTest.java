import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FiniteAutomatonTest {

    @Test
    void testRecognize() {
        FiniteAutomaton fa = new FiniteAutomaton();

        assertEquals(FiniteAutomaton.State.F, fa.recognize("abcTESTabc"));
        assertEquals(FiniteAutomaton.State.F, fa.recognize("TEST"));
        assertEquals(FiniteAutomaton.State.F, fa.recognize("TTESTT"));

        assertNotEquals(FiniteAutomaton.State.F, fa.recognize("abcTES"));
        assertNotEquals(FiniteAutomaton.State.F, fa.recognize("T"));
        assertNotEquals(FiniteAutomaton.State.F, fa.recognize("TST"));
        assertNotEquals(FiniteAutomaton.State.F, fa.recognize("TEEST"));
    }

    @Test
    void testSpecialCases() {
        FiniteAutomaton fa = new FiniteAutomaton();

        assertEquals(FiniteAutomaton.State.F, fa.recognize("TTESTT"));
        assertEquals(FiniteAutomaton.State.F, fa.recognize("TESTTEST"));

        assertNotEquals(FiniteAutomaton.State.F, fa.recognize("TEEST"));
        assertNotEquals(FiniteAutomaton.State.F, fa.recognize("TTT"));
    }
}
