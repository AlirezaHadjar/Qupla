package lexer;
// Generated from .\vocabulary.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vocabulary extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            REAL = 1, BOOL = 2, STRING = 3, TXT = 4, INT = 5, HEX = 6, FLOAT = 7, ID = 8, WS = 9, PLUS = 10,
            MINUS = 11, MULT = 12, Div = 13, POW = 14, FAC = 15, ASSIGN = 16, AND = 17, OR = 18, NOT = 19,
            XOR = 20, REMAIN = 21, IFO = 22, EQUAL = 23, GREQUAL = 24, LEEQUAL = 25, NOTEQUAL = 26,
            OLCOMMENT = 27, MLCOMMENT = 28, TRUE = 29, FALSE = 30, IF = 31, THEN = 32, BEGIN = 33,
            END = 34, WHILE = 35, ELSE = 36, READ = 37, WRITE = 38, MODULE = 39, INPUT = 40, OUTPUT = 41;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "REAL", "BOOL", "STRING", "TXT", "INT", "HEX", "FLOAT", "ID", "WS", "PLUS",
                "MINUS", "MULT", "Div", "POW", "FAC", "ASSIGN", "AND", "OR", "NOT", "XOR",
                "REMAIN", "IFO", "EQUAL", "GREQUAL", "LEEQUAL", "NOTEQUAL", "OLCOMMENT",
                "MLCOMMENT", "TRUE", "FALSE", "IF", "THEN", "BEGIN", "END", "WHILE",
                "ELSE", "READ", "WRITE", "MODULE", "INPUT", "OUTPUT"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'Real'", "'Bool'", "'String'", null, null, null, null, null, null,
                "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'='", "'and'", "'or'", "'not'",
                "'xor'", "'%'", "'?'", "'=='", "'>='", "'<='", "'<>'", "'%%'", "'%%%'",
                "'true'", "'false'", "'if'", "'then'", "'Begin'", "'End'", "'While'",
                "'Else'", "'read'", "'write'", "'Module'", "'Input'", "'Output'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "REAL", "BOOL", "STRING", "TXT", "INT", "HEX", "FLOAT", "ID", "WS",
                "PLUS", "MINUS", "MULT", "Div", "POW", "FAC", "ASSIGN", "AND", "OR",
                "NOT", "XOR", "REMAIN", "IFO", "EQUAL", "GREQUAL", "LEEQUAL", "NOTEQUAL",
                "OLCOMMENT", "MLCOMMENT", "TRUE", "FALSE", "IF", "THEN", "BEGIN", "END",
                "WHILE", "ELSE", "READ", "WRITE", "MODULE", "INPUT", "OUTPUT"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public vocabulary(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "vocabulary.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0114\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2" +
                    "\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7" +
                    "\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\6\6\6q\n\6\r\6\16\6r\3\7\3\7\3\7\6\7" +
                    "x\n\7\r\7\16\7y\3\b\6\b}\n\b\r\b\16\b~\3\b\3\b\6\b\u0083\n\b\r\b\16\b" +
                    "\u0084\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\n\6\n\u008f\n\n\r\n" +
                    "\16\n\u0090\3\n\6\n\u0094\n\n\r\n\16\n\u0095\5\n\u0098\n\n\3\13\3\13\3" +
                    "\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22" +
                    "\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26" +
                    "\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33" +
                    "\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3" +
                    "#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'" +
                    "\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*" +
                    "\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17" +
                    "\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35" +
                    "9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\n\n\2##%(*,\60\60\62;B]_ac|\4\2" +
                    "ZZzz\5\2\62;CHch\3\2\62;\4\2C\\c|\7\2\60\60\62;C\\aac|\3\2\13\13\3\2\f" +
                    "\f\2\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
                    "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
                    "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
                    "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
                    "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2" +
                    "\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2" +
                    "\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S" +
                    "\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7_\3\2\2\2\tf\3\2\2\2\13p\3\2\2\2\rt\3" +
                    "\2\2\2\17|\3\2\2\2\21\u0086\3\2\2\2\23\u0097\3\2\2\2\25\u0099\3\2\2\2" +
                    "\27\u009b\3\2\2\2\31\u009d\3\2\2\2\33\u009f\3\2\2\2\35\u00a1\3\2\2\2\37" +
                    "\u00a3\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2\2%\u00ab\3\2\2\2\'\u00ae\3" +
                    "\2\2\2)\u00b2\3\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61" +
                    "\u00bd\3\2\2\2\63\u00c0\3\2\2\2\65\u00c3\3\2\2\2\67\u00c6\3\2\2\29\u00c9" +
                    "\3\2\2\2;\u00cd\3\2\2\2=\u00d2\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C" +
                    "\u00e0\3\2\2\2E\u00e6\3\2\2\2G\u00ea\3\2\2\2I\u00f0\3\2\2\2K\u00f5\3\2" +
                    "\2\2M\u00fa\3\2\2\2O\u0100\3\2\2\2Q\u0107\3\2\2\2S\u010d\3\2\2\2UV\7T" +
                    "\2\2VW\7g\2\2WX\7c\2\2XY\7n\2\2Y\4\3\2\2\2Z[\7D\2\2[\\\7q\2\2\\]\7q\2" +
                    "\2]^\7n\2\2^\6\3\2\2\2_`\7U\2\2`a\7v\2\2ab\7t\2\2bc\7k\2\2cd\7p\2\2de" +
                    "\7i\2\2e\b\3\2\2\2fj\7$\2\2gi\t\2\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk" +
                    "\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7$\2\2n\n\3\2\2\2oq\4\62;\2po\3\2\2\2q" +
                    "r\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\f\3\2\2\2tu\7\62\2\2uw\t\3\2\2vx\t\4\2" +
                    "\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\16\3\2\2\2{}\t\5\2\2|{\3\2" +
                    "\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\7" +
                    "\60\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084" +
                    "\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\20\3\2\2\2\u0086\u008a\t\6\2" +
                    "\2\u0087\u0089\t\7\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088" +
                    "\3\2\2\2\u008a\u008b\3\2\2\2\u008b\22\3\2\2\2\u008c\u008a\3\2\2\2\u008d" +
                    "\u008f\t\b\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2" +
                    "\2\2\u0090\u0091\3\2\2\2\u0091\u0098\3\2\2\2\u0092\u0094\t\t\2\2\u0093" +
                    "\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2" +
                    "\2\2\u0096\u0098\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0093\3\2\2\2\u0098" +
                    "\24\3\2\2\2\u0099\u009a\7-\2\2\u009a\26\3\2\2\2\u009b\u009c\7/\2\2\u009c" +
                    "\30\3\2\2\2\u009d\u009e\7,\2\2\u009e\32\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0" +
                    "\34\3\2\2\2\u00a1\u00a2\7`\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4" +
                    " \3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7c\2\2\u00a8" +
                    "\u00a9\7p\2\2\u00a9\u00aa\7f\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7q\2\2\u00ac" +
                    "\u00ad\7t\2\2\u00ad&\3\2\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7q\2\2\u00b0" +
                    "\u00b1\7v\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7z\2\2\u00b3\u00b4\7q\2\2\u00b4" +
                    "\u00b5\7t\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7\'\2\2\u00b7,\3\2\2\2\u00b8" +
                    "\u00b9\7A\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc" +
                    "\60\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf\62\3\2\2\2\u00c0" +
                    "\u00c1\7>\2\2\u00c1\u00c2\7?\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4" +
                    "\u00c5\7@\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7\'\2\2\u00c7\u00c8\7\'\2\2" +
                    "\u00c88\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cb\7\'\2\2\u00cb\u00cc\7" +
                    "\'\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0" +
                    "\7w\2\2\u00d0\u00d1\7g\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4" +
                    "\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7" +
                    ">\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7h\2\2\u00da@\3\2\2\2\u00db\u00dc" +
                    "\7v\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df" +
                    "B\3\2\2\2\u00e0\u00e1\7D\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7i\2\2\u00e3" +
                    "\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7G\2\2\u00e7" +
                    "\u00e8\7p\2\2\u00e8\u00e9\7f\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7Y\2\2\u00eb" +
                    "\u00ec\7j\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2" +
                    "\u00efH\3\2\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2" +
                    "\2\u00f3\u00f4\7g\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7" +
                    "g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7f\2\2\u00f9L\3\2\2\2\u00fa\u00fb" +
                    "\7y\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7v\2\2\u00fe" +
                    "\u00ff\7g\2\2\u00ffN\3\2\2\2\u0100\u0101\7O\2\2\u0101\u0102\7q\2\2\u0102" +
                    "\u0103\7f\2\2\u0103\u0104\7w\2\2\u0104\u0105\7n\2\2\u0105\u0106\7g\2\2" +
                    "\u0106P\3\2\2\2\u0107\u0108\7K\2\2\u0108\u0109\7p\2\2\u0109\u010a\7r\2" +
                    "\2\u010a\u010b\7w\2\2\u010b\u010c\7v\2\2\u010cR\3\2\2\2\u010d\u010e\7" +
                    "Q\2\2\u010e\u010f\7w\2\2\u010f\u0110\7v\2\2\u0110\u0111\7r\2\2\u0111\u0112" +
                    "\7w\2\2\u0112\u0113\7v\2\2\u0113T\3\2\2\2\16\2hjry~\u0084\u0088\u008a" +
                    "\u0090\u0095\u0097\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}