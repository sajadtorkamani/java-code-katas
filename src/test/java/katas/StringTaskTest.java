package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTaskTest {
    @Test
    void perform_returnsCorrectResult() {
        assertEquals(".t.r", StringTask.perform("tour"));
        assertEquals(".c.d.w.r.s", StringTask.perform("Codewars"));
        assertEquals(".b.c.b", StringTask.perform("aBAcAba"));
    }
}
