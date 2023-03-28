public interface Puffer<T> {

    void insert(T n);
    void remove();
    int size();
    int capacity();
}
