package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char first = 'A';
        char last = 'Z';
         for (char ch = first; ch <= last; ch++) {
            System.out.print(ch);
        }
    }
}
