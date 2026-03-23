package src.maratonajava.javacore.nio.test;

import java.nio.file.*;

public class PathMatcherTest1 {
    static void main() {
        Path path1 = Paths.get("pasta/subpasta1/subsubpasta1/file.java");
        Path path2 = Paths.get("pasta/subpasta2/subsubpasta2/file.txt");
        matches(path1, "glob:*.java");
        matches(path1, "glob:**/*.{bkp,txt,java}");
    }
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
