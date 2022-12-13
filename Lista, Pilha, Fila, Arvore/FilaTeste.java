import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FilaTeste {

    public static void main(String[] args) {

        Fila fila1 = new Fila();

        fila1.push("M");
        fila1.push("A");
        System.out.println(fila1);

        String p1 = fila1.pop();
        System.out.println(p1);
        System.out.println(fila1);

        Queue<String> FilaJava = new LinkedList<String>();
        FilaJava.add("Mari");
        String p2 = FilaJava.poll();
        System.out.println(p2);
    }
}