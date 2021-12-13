public class Rectangle extends Shape{
    public int aLength;
    public int aBreadth;

    public Rectangle(int aArea, int aLength, int aBreadth) {
        super(aArea);
        this.aLength = aLength;
        this.aBreadth = aBreadth;
    }

    public int getaLength() {
        return aLength;
    }

    public void setaLength(int aLength) {
        this.aLength = aLength;
    }

    public int getaBreadth() {
        return aBreadth;
    }

    public void setaBreadth(int aBreadth) {
        this.aBreadth = aBreadth;
    }

    @Override
    public void dajObsah() {
        System.out.println("Obsah je: " + (aLength * aBreadth));
    }

    @Override
    public void dajObvod() {
        System.out.println("Obvod je: " + 2 * (aLength + aBreadth));
    }

    @Override
    public void vypisInfo() {
        System.out.println("Sirka je: " + getaBreadth());
        System.out.println("Dlzka j: " + getaLength());
    }
}
