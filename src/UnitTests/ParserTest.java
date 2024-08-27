package UnitTests;
import Antlr.HLASMLexer;
import Antlr.HLASMParser;
import org.antlr.runtime.BitSet;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.Assert;
import org.junit.Test;

import java.io.Console;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {
    private HLASMParser createParseNoError(List<TestToken> tokens) {
        ListTokenSource token_source = new ListTokenSource(tokens);
        CommonTokenStream token_stream = new CommonTokenStream(token_source);
        return new HLASMParser(token_stream);
    }

    public static class TestToken implements Token {

        private final String _text;
        private final int tcod;

        // Constructor
        public TestToken(String text, int type) {
            this._text = text;
            this.tcod = type;
        }

        @Override
        public String getText() {
            return _text;
        }

        @Override
        public int getType() {
            return tcod;
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
        TestToken token1 = new TestToken("TAG", HLASMLexer.STRING);
        TestToken token2 = new TestToken("LA", HLASMLexer.OPCODE);
        TestToken token3 = new TestToken("1", HLASMLexer.REGISTER);
        TestToken token4 = new TestToken("*COMM", HLASMLexer.COMMENT);
        TestToken whitespace = new TestToken(" ", HLASMLexer.WHITESPACE);

        HLASMParser parser = createParseNoError(Arrays.asList(token1, whitespace, token2));
        Assert.assertEquals("TAG",parser.label().getText());
    }
}
