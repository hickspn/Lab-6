/**
 * The Tree class for lab 6.
 */
public class Tree{

    /* instance variables */
    private String name;
    private String type;
    private boolean leafLoss;
    private String color;

    /**
     * Default constructor.
     */
    public Tree() {
        this.name = "";
        this.type = "";
        this.leafLoss = false;
        this.color = "";
    }

    /**
     * Constructor with parameters.
     */
    public Tree(String n, String t, boolean l, String c) {
        this.name = n;
        this.type = t;
        this.leafLoss = l;
        this.color = c;
    }

    /**
     * getter for name instance variable.
     */
    public String getName() {
        return this.name;
    }

    /**
     * setter for name instance variable.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for type instance variable.
     */
    public String getType() {
        return this.type;
    }

    /**
     * setter for type instance variable.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter for leafLoss instance variable.
     */
    public boolean isLeafLoss() {
        return this.leafLoss;
    }

    /**
     * setter for leafLoss instance variable.
     */
    public void setLeafLoss(boolean leafLoss) {
        this.leafLoss = leafLoss;
    }

    /**
     * getter for color instance variable.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * setter for color instance variable.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * print method for the tree.
     */
    public void print() {
        String doesMystery;
        if (this.leafLoss) {
            doesMystery = "does";
        } else {
            doesMystery = "does not";
        }
        System.out.println("This is a " + this.name + " tree. It is a "
                + this.type + " and its leaves are currently " + this.color
                + ". It " + doesMystery + " lose its leaves for the winter.");
    }


}
