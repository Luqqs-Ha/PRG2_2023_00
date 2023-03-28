import java.util.NoSuchElementException;

public class StackArray<T> extends AbstractPuffer<T> implements Stack<T>
{
    public StackArray(int maxSize)
    {
        super(maxSize);
    }

    public  StackArray()
    {
        super();
    }

    @Override
    public T top() {
        if(size > 0)
            return a[size - 1];
        else
            throw new NoSuchElementException("Stack is empty");
    }

    @Override
    public void remove() {
        if(size > 0)
        {
            T removedItem = a[size - 1];
            a[size - 1] = null;
            size--;
        }
        else
            throw new NoSuchElementException("Stack is empty");
    }
}
