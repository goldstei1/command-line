import java.io.PrintWriter;

import java.util.Arrays;

/**
 * Sort the strings given on the command line.
 */
public class Sort {
    public static void main(String[] args) {
        // Prepare output.
        PrintWriter pen = new PrintWriter(System.out,true);
 
        // Set up a new sorter of the appropriate type.
        Sorter<String> sorter = new BuiltinSorter<String>();

        // Do the actual work.
        sorter.sort(args, StandardStringComparator.comparator);

        // And print the results.
        pen.println(Arrays.toString(args));
    } // sort(String[])
} // Sort
