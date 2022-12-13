import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> Name = new LinkedList<String>();

    public void push(String name) {
        Name.add(name);
    }
    public String pop() {
        return Name.remove(Name.size()-1);
    }
    public boolean vazia() {
        return Name.isEmpty();
    }
    public String toString() {
        return Name.toString();
    }
}