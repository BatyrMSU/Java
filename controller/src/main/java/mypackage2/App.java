package mypackage2;

public class App {

    public static void main(String[] args) {

        Fabric fabric = new Fabric();
        Library lib = fabric.createLibrary();

        lib.showBookOfAuthor("Jules Verne");

    }

}
