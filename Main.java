class Main {
  public static void main(String[] args) {
        Tree tree1 = new Tree();
        //declare and initialize a Tree with the given parameters
        Tree tree2 = new Tree("maple", "broadleaf", true, "red");

        //print the first Tree
        tree1.print();
        //print the second Tree
        tree2.print();

        //use mutators to change tree1
        tree1.setName("spruce");
        tree1.setType("conifer");
        //print the first Tree again
        tree1.print();
  }
}