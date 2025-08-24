public class Cache implements Cacheable {

    Frame last;

    public Cache(Frame last){
        this.last = last;
    }

    @Override
    public void store(Frame frame) {
        System.out.println("Cached last frame? " + (getLast()!=null));

    }

    @Override
    public Frame getLast() {
        if(last == null){
            return null;
        }
        return last;
    }

    @Override
    public void updateLast(Frame f){
        last = f;
    }
    
}
