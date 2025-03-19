package Tools;

import caseStudy1.HLASM1Lexer;
import caseStudy1.HLASM1Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class doParse {
    public static void main(String[] args) throws IOException {
        parseStudy1();
    }

    public static void parseStudy1() throws IOException {
        String inFile = "C:\\Users\\ajackson\\Documents\\GitHub\\HlasmGrammar\\src\\caseStudy1\\ASM01.txt";
        String outFile = "C:\\Users\\ajackson\\Documents\\GitHub\\HlasmGrammar\\src\\caseStudy1\\out.txt";
        CharStream input = CharStreams.fromFileName(inFile);
        HLASM1Lexer lexer = new HLASM1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HLASM1Parser parser = new HLASM1Parser(tokens);
        ParseTree tree = parser.prog();
        String string = tree.toStringTree(parser);
        System.out.println(string);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            writer.write(string);
        }
        System.out.println("Parse tree saved to: " + outFile);
    }
}
