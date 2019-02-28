package pl.epoint.dockerlab.signals;

import sun.misc.Signal;

import java.io.File;

/**
 * Example of signal handling.
 *
 * @author Kamil Murawski
 */
public class SignalHandlingApplication {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.print("Directory name missing!");

        } else {
            String directoryName = args[0];
            System.out.println("Looking for changes in directory: " + directoryName);
            File folder = new File(directoryName);

            Signal.handle(new Signal("INT"), sig -> {
                System.out.println(
                        "\nApplication was interrupted!");
            });
            while (true) {
                File[] listOfFiles = folder.listFiles();
                System.out.print("> ");
                for (int i = 0; i < listOfFiles.length; ++i) {
                    System.out.print(listOfFiles[i].getName() + " ");
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println();
            }
        }
    }
}
