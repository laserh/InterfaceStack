import javax.naming.OperationNotSupportedException;

public interface Stack {
    void push(String element);
    String pop() throws OperationNotSupportedException;
    String peek();
    void clear();
    int getCount();
}
