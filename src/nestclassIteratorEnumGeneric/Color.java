package nestclassIteratorEnumGeneric;

public enum Color implements Behaviour {
    Red("red",1), GREEN("green",2), BlANK("blank",3);

    private String name;
    private int index;

    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (Color c : Color.values()) {
            if(c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex (int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return this.index+ '_' + this.name;
    }

    @Override
    public String getInfo() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.index+ ':' + this.name);
    }

}
