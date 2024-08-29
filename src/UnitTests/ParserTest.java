package UnitTests;
import Antlr.HLASMLexer;
import Antlr.HLASMParser;
import org.antlr.v4.runtime.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserTest {
    public static final noErrorListener _noErrorListener = new noErrorListener();

    private HLASMParser createParseNoError(List<TestToken> tokens) {
        ListTokenSource token_source = new ListTokenSource(tokens);
        CommonTokenStream token_stream = new CommonTokenStream(token_source);
        HLASMParser parser = new HLASMParser(token_stream);
        parser.addErrorListener(_noErrorListener);
        return parser;
    }

    public static class TestToken implements Token {

        private final String _text;
        private final int _tcode;

        // Constructor
        public TestToken(String text, int type) {
            this._text = text;
            this._tcode = type;
        }

        @Override
        public String getText() {
            return _text;
        }

        @Override
        public int getType() {
            return _tcode;
        }

        @Override
        public int getLine() {
            return 0;
        }

        @Override
        public int getCharPositionInLine() {
            return 0;
        }

        @Override
        public int getChannel() {
            return 0;
        }

        @Override
        public int getTokenIndex() {
            return 0;
        }

        @Override
        public int getStartIndex() {
            return 0;
        }

        @Override
        public int getStopIndex() {
            return 0;
        }

        @Override
        public TokenSource getTokenSource() {
            return null;
        }

        @Override
        public CharStream getInputStream() {
            return null;
        }
    }

    @Test
    public void testFunctionPlain() {
        List<TestToken> line = getTestTokens();

        HLASMParser parser = createParseNoError(line);
        Assert.assertEquals("TAG",parser.label().getText());
        Assert.assertEquals(" ",parser.whitespace().getText());
        Assert.assertEquals("LA",parser.opcode().getText());
        Assert.assertEquals(" ",parser.whitespace().getText());
        Assert.assertEquals("1",parser.register().getText());
        Assert.assertEquals("3",parser.register().getText());
        Assert.assertEquals(" ",parser.whitespace().getText());
        Assert.assertEquals("*COMM",parser.comment().getText());
    }

    private static List<TestToken> getTestTokens() {
        TestToken token1 = new TestToken("TAG", HLASMLexer.STRING);
        TestToken token2 = new TestToken("LA", HLASMLexer.OPCODE);
        TestToken token3 = new TestToken("1", HLASMLexer.REGISTER);

        // TestToken comma = new TestToken(",", HLASMLexer.STRING);

        TestToken token4 = new TestToken("3", HLASMLexer.REGISTER);
        TestToken token5 = new TestToken("*COMM", HLASMLexer.COMMENT);

        TestToken whitespace = new TestToken(" ", HLASMLexer.WHITESPACE);

        return Arrays.asList(token1,
                whitespace,
                token2,
                whitespace,
                token3,
                // comma
                token4,
                whitespace,
                token5);
    }
}
