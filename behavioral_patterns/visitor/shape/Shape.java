public interface Shape {
    public String getType();
    public void accept(Visitor visitor);
}
