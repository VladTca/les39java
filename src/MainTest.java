import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование метода repeatObj")
class MainTest {

    @Nested
    @DisplayName("Тесты без дубликатов")
    class NoDuplicatesTests {

        @Test
        @DisplayName("Список без дубликатов должен возвращать false")
        void testNoDuplicates() {
            List<String> list = List.of("Abc", "Def", "Ghi", "Jkl", "Mno", "Pqr");
            assertFalse(Main.repeatObj(list));
        }

        @Test
        @DisplayName("Пустой список должен возвращать false")
        void testEmptyList() {
            List<String> list = List.of();
            assertFalse(Main.repeatObj(list));
        }

    }

    @Nested
    @DisplayName("Тесты с дубликатами")
    class DuplicatesTests {

        @Test
        @DisplayName("Список с дубликатами должен возвращать true")
        void testWithDuplicates() {
            List<String> list = List.of("Abc", "Def", "Ghi", "Abc", "Jkl");
            assertTrue(Main.repeatObj(list));
        }

        @Test
        @DisplayName("Список, где все элементы одинаковые, должен возвращать true")
        void testAllDuplicates() {
            List<String> list = List.of("Abc", "Abc", "Abc", "Abc");
            assertTrue(Main.repeatObj(list));
        }
    }
}
