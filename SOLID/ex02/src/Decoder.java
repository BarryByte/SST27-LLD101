class Decoder implements Decodable{
    Frame frame;

    @Override
    public Frame decode(byte[] data) {
        return new Frame(data);
    }
}