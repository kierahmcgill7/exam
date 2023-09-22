package typesofpeople;

public class Person {
    private String name;
    private String size;
    private String clothingItems;

    public Person(String name, String size, String clothingItems) {
        this.name = name;
        this.size = size;
        this.clothingItems = clothingItems;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getClothingItems() {
        return clothingItems;
    }

}

