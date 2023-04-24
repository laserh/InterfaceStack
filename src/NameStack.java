import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

public class NameStack implements Stack {
    private ArrayList<String> names = new ArrayList<>();

    @Override
    public void push(String element) {
        names.add(element);
    }

    @Override
    public String pop() throws OperationNotSupportedException {
        int lastIx = names.size() - 1;

        if (lastIx < 0)
            throw new OperationNotSupportedException("Stack");
        String s = names.remove(lastIx);
        return s;

    }

    @Override
    public String peek() {
        int lastIx = names.size() - 1;
        String s = names.get(lastIx);
        return s;
    }

    @Override
    public void clear() {
        names.clear();

    }

    @Override
    public int getCount() {

        return names.size();
    }
}
