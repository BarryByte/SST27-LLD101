class Render implements Renderable{

    byte[] fileBytes;

    public Render(byte[] fileBytes){
        this.fileBytes = fileBytes;
    }

    @Override
    public void drawUI() {
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");

    }

}