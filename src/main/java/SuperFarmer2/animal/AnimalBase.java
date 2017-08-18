package SuperFarmer2.animal;

public enum AnimalBase {
    RABBIT("rabbit"),
    SHEEP("sheep"),
    PIG("pig"),
    COW("cow"),
    HORSE("horse"),
    SMALL_DOG("small dog"),
    BIG_DOG("big dog"),
    WOLF("wolf"),
    FOX("fox");

    private String name;

    AnimalBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
