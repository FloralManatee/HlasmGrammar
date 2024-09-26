package Antlr;

import org.antlr.v4.runtime.*;

public class HLASMParserExample {
    public static void main(String[] args) {
        String input = "USING *\nLA R3,R4\nEQU *\n* Comment\nL 5,4\n\r";

        CharStream inputStream = CharStreams.fromString(input);

        HLASMLexer lexer = new HLASMLexer(inputStream);

        TokenStream tokenStream = new CommonTokenStream(lexer);

        HLASMParser parser = new HLASMParser(tokenStream);

        parser.removeErrorListeners();
        parser.addErrorListener(new ConsoleErrorListener());

        HLASMParser.ProgContext tree = parser.prog();

        BuildASTVisitor visitor = new BuildASTVisitor();
        visitor.visit(tree);
    }
}

