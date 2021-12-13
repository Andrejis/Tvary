public abstract class Shape {
    public int aArea;

    public Shape(int aArea) {
        this.aArea = aArea;
    }

    public int getaShape() {
        return aArea;
    }

    public void setaShape(int aArea) {
        this.aArea = aArea;
    }

    public abstract void dajObsah();

    public abstract void dajObvod();

    public abstract void vypisInfo();

}
