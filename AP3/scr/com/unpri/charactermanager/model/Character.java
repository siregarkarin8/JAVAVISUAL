package scr.com.unpri.charactermanager.model;

public class Character {
    private String name;
    private int level;
    private CharacterType type;
    private int hitPoints; // Bagian A
    private int mana;      // Bagian B

    private static int totalCharacterCreated = 0;

    // Constructor default (level = 1, HP = 100, mana = 75)
    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.hitPoints = 100;
        this.mana = 75;
        totalCharacterCreated++;
    }

    // Constructor lengkap
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = 100;
        this.mana = 75;
        totalCharacterCreated++;
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public CharacterType getType() { return type; }
    public void setType(CharacterType type) { this.type = type; }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public int getMana() { return mana; }
    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh negatif!");
        }
        this.mana = mana;
    }

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    // Method tambahan
    public void levelUp() {
        this.level++;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    // toString() final
    @Override
    public String toString() {
        return "Character{name='" + name + "', type=" + type + ", level=" + level +
               ", HP=" + hitPoints + ", mana=" + mana + "}";
    }
   
// Bagian A: equals() untuk bandingkan nama
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Character other = (Character) obj;
    return this.name.equalsIgnoreCase(other.name);
}

@Override 
public int hashCode() {
    return name.toLowerCase().hashCode();

}

}
