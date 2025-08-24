public interface Cacheable{
    void store(Frame frame);
    Frame getLast();
    void updateLast(Frame f);
}