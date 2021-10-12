package mypackage2;

import org.jetbrains.annotations.NotNull;

public class App {

    public static void main(@NotNull String[] args) {

        String name = "";
        for (int i = 0; i < args.length; i++) {
            name += args[i];
            if (i == args.length-1) break;
            name += " ";
        }

        Fabric fabric = new Fabric();
        Library lib = fabric.createLibrary();

        lib.showBookOfAuthor(name);

    }

}
