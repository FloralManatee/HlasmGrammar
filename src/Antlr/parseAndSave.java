package Antlr;

import Tools.utils;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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
        String inFile = "C:\\Users\\ajackson\\Documents\\GitHub\\HlasmGrammar\\src\\Antlr\\grammar.txt";
        String outFile = "C:\\Users\\ajackson\\Documents\\GitHub\\HlasmGrammar\\src\\Antlr\\out.txt";

        CharStream input = CharStreams.fromFileName(inFile);

        ANTLRv4Lexer lexer = new ANTLRv4Lexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ANTLRv4Parser parser = new ANTLRv4Parser(tokens);

        ParseTree tree = parser.grammarSpec();

        String string = tree.toStringTree(parser);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            writer.write(string);
        }

        System.out.println("Parse tree saved to: " + outFile);
    }

}
