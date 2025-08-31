public class Player {
    private Frame last;
    void play(byte[] fileBytes){
        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        
        // draw UI
        // System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        Render render = new Render(fileBytes);
        render.drawUI();
        
        // cache
        // last = f;
        Cache cache = new Cache(f);
        System.out.println("Cached last frame? " + (cache.getLast()!=null));
    }
}