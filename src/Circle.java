public class Circle extends Shape{
    public int aRadius;


    public Circle(int aArea, int aRadius, int aRadius2) {
        super(aArea);
        this.aRadius = aRadius;

    }

    public int getaRadius() {
        return aRadius;
    }

    public void setaRadius(int aRadius) {
        this.aRadius = aRadius;
    }

    @Override
    public void dajObsah() {
        System.out.println("Obsah je: " + 3.14 * (aRadius * aRadius));
    }

    @Override
    public void dajObvod() {
        System.out.println("Obvod je: " + 2 * (3.14 * aRadius));
    }

    @Override
    public void vypisInfo() {
        System.out.println("Dlzka polomeru je: " + aRadius);
    }
}
