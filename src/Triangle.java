public class Triangle extends Shape{
    public int aLength;
    public int aBreadth;
    public int aTretia;

    public Triangle(int aArea, int aLength, int aBreadth, int aTretia) {
        super(aArea);
        this.aLength = aLength;
        this.aBreadth = aBreadth;
        this.aTretia = aTretia;
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

    public int getaTretia() {
        return aTretia;
    }

    public void setaTretia(int aTretia) {
        this.aTretia = aTretia;
    }

    @Override
    public void dajObsah() {
        System.out.println("Obsah je: " + ((aLength * aBreadth) / 2));
    }

    @Override
    public void dajObvod() {
        System.out.println("Obvod je: " + (aTretia + aBreadth + aLength));
    }

    @Override
    public void vypisInfo() {
        System.out.println("Sirka je: " + getaBreadth());
        System.out.println("Dlzka j: " + getaLength());
        System.out.println("Tretia strana je: " + getaTretia());
    }
}
