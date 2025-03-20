/*package UnitTests;
import org.antlr.v4.runtime.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

// Example from https://ssricardo.github.io/2018/junit-antlr-lexer/

public class LexerTest {
    private static final errorListener _errorListener = new errorListener();

    static List<Token> getTokensFromText(String txt) throws IOException {
        ByteArrayInputStream input_stream = new ByteArrayInputStream(txt.getBytes());
        CharStream char_stream = CharStreams.fromStream(input_stream);
        Lexer lexer = new HLASMLexer(char_stream);
        lexer.addErrorListener(_errorListener);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        return tokenStream.getTokens();
    }

    @Test
    public void testFunction() throws IOException {
        List<Token> tokens = getTokensFromText("LA 3,2");
        Assert.assertEquals(6, tokens.size());
    }


}
*/