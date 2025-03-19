package UnitTests;
import org.antlr.v4.runtime.*;

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
}
