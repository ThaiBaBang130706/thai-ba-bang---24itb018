public class Retangle {
    private float length;
    private float width;
    public Retangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public Retangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea(){
        return length*width;
    }
    public float getPerimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Retangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
