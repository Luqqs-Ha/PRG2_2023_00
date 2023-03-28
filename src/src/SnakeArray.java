import java.util.NoSuchElementException;

public class SnakeArray<T> extends AbstractPuffer<T> implements Snake<T>{

    public SnakeArray(int maxSize)
    {
        super(maxSize);
    }

    public  SnakeArray()
    {
        super();
    }

    @Override
    public T front() {
        if(size > 0)
            return a[size - 1];
        else
            throw new NoSuchElementException("Snake is empty");
    }

    @Override
    public void remove() {
        if(size > 0)
        {
            T removedItem = a[0];
            a[0] = null;
            for(int i = 0; i < size - 1;i++)
            {
                a[i] = a[i + 1];
            }
            size--;
        }
        else
            throw new NoSuchElementException("Snake is empty");
    }
}
