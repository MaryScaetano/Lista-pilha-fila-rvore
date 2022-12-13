import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<String> pessoas = new LinkedList<String>();

    public void push(String pessoa) {
        pessoas.add(pessoa);
    }

    public String pop() {
        return pessoas.remove(0);
    }

    public boolean vazia() {
        return pessoas.isEmpty();
    }

    public String toString() {
        return pessoas.toString();
    }
}