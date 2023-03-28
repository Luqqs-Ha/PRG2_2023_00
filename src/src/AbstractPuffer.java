import java.util.Random;

public abstract class AbstractPuffer<T> implements Puffer<T>
{
    int size = 0;
    T[] a;
    @SuppressWarnings("unchecked")
    AbstractPuffer(int s) {a = (T[]) new Object[s];}
    @SuppressWarnings("unchecked")
    AbstractPuffer()
    {
        Random x = new Random();
        int s = x.nextInt(3,101);
        a = (T[]) new Object[s];
    }

    @Override
    public void insert(T n)
    {
        if(size < a.length)
        {
            a[size++] = n;
        }
        else
        {
            throw new IllegalStateException("Puffer ist voll");
        }
    }

    @Override
    public int capacity()
    {
        return a.length;
    }

    @Override
    public int size() {
        return size;
    }
}
