package Antlr;

import Tools.utils;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class parseAndSave {
    public static void main(String[] args) throws Exception {
        // Ensure correct arguments
        /*if (args.length != 2) {
            System.out.println("./parseAndSave <input-file> <output-file>");
            return;
        }

        String inFile = args[0];
        String outFile = args[1];*/
        String inFile = "C:\\Users\\ajackson\\Documents\\GitHub\\HlasmGrammar\\src\\Antlr\\hlasm.txt";
        String outFile = "C:\\Users\\ajackson\\Documents\\GitHub\\HlasmGrammar\\src\\Antlr\\out.txt";

        CharStream input = CharStreams.fromFileName(inFile);

        HLASMLexer lexer = new HLASMLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HLASMParser parser = new HLASMParser(tokens);

        ParseTree tree = parser.prog();

        String strip = new utils().removeWhitespace(tree.toStringTree(parser));

        System.out.println(strip);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            writer.write(strip);
        }

        System.out.println("Parse tree saved to: " + outFile);
    }

}
