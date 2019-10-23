package katas;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SantasListTest {
    @Test
    void findList_handlesSimpleCase() {
        var santasList = List.of("Jason", "Jackson", "Jordan", "Johny");
        var children = List.of("Jason", "Jordan", "Jennifer");

        assertEquals(List.of("Jason", "Jordan"), SantasList.findChildren(santasList, children));
    }

    @Test
    void findList_sortsResult() {
        var santasList = List.of("Jason", "Jackson", "Johnson", "JJ");
        var children = List.of("Jason", "James", "JJ");

        assertEquals(List.of("JJ", "Jason"), SantasList.findChildren(santasList, children));
    }

    @Test
    void findList_isCaseSensitive() {
        var santasList = List.of("jASon", "JAsoN", "JaSON", "jasON");
        var children = List.of("JasoN", "jASOn", "JAsoN", "jASon", "JASON");

        assertEquals(List.of("JAsoN", "jASon"), SantasList.findChildren(santasList, children));
    }

    @Test
    void findList_removesDuplicates() {
        var santasList = List.of("Jason", "Jackson", "Jordan", "Johny");
        var children = List.of("Jason", "Jordan", "Jennifer", "Jason");

        assertEquals(List.of("Jason", "Jordan"), SantasList.findChildren(santasList, children));
    }
}
