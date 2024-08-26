public class nametag {
    //saves users name
    String name = null;
    //constructor, default
    public nametag() {
        name = "unkown";
    }
    //constructor, full
    public nametag(String newName) {
        name = newName;
    }
    //getter
    public String GetName() {
        return name;
    }

    //setter
    public void SetName(String newName) {
        name = newName;
    }
    //toString
    public String toString() {
        return name;
    }
    //equals
    public boolean equals(nametag nametag) {
        return name.equals(nametag.name);
    }
}