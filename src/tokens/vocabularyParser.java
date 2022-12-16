// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class vocabularyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REAL=1, BOOL=2, STRING=3, SEPARATOR=4, TXT=5, REAL_INT=6, REAL_HEX=7, 
		REAL_FLOAT=8, ONCOMMENT=9, MLCOMMENT=10, WS=11, PLUS=12, MINUS=13, MULT=14, 
		DIV=15, POW=16, FAC=17, ASSIGN=18, AND=19, OR=20, NOT=21, XOR=22, REMAIN=23, 
		COND_IF=24, COLON=25, EQUAL=26, GREQUAL=27, LEEQUAL=28, NOTEQUAL=29, GREATER=30, 
		LESS=31, PARENTHESIS_OPEN=32, PARENTHESIS_CLOSE=33, TRUE=34, FALSE=35, 
		IF=36, THEN=37, ELSE=38, BEGIN=39, END=40, WHILE=41, READ=42, WRITE=43, 
		MODULE=44, INPUT=45, OUTPUT=46, ERROR=47, FOR=48, CLASS=49, CONSTRUCTOR=50, 
		DESTRUCTOR=51, BREAK=52, CONTINUE=53, SWITCH=54, CASE=55, PROTECTED=56, 
		PRIVATE=57, PUBLIC=58, THIS=59, RETURN=60, TRY=61, CATCH=62, FINALLY=63, 
		THROW=64, NEW=65, DELETE=66, INCLUDE=67, USING=68, NAMESPACE=69, IMPORT=70, 
		EXTENDS=71, INTERFACE=72, ENUM=73, STATIC=74, ABSTRACT=75, FINAL=76, CONST=77, 
		DO=78, STRUCT=79, DEFAULT=80, IMPLEMENTS=81, SUPER=82, THROWS=83, VOID=84, 
		IDENTIFIER=85, OTHER=86;
	public static final int
		RULE_stat = 0, RULE_variableDeclarator = 1, RULE_assign = 2, RULE_boolExp = 3, 
		RULE_textExp = 4, RULE_op = 5, RULE_mathExp = 6, RULE_read = 7, RULE_write = 8, 
		RULE_ifCondition = 9, RULE_whileLoop = 10, RULE_codeBlock = 11, RULE_createModule = 12, 
		RULE_returnValue = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "variableDeclarator", "assign", "boolExp", "textExp", "op", "mathExp", 
			"read", "write", "ifCondition", "whileLoop", "codeBlock", "createModule", 
			"returnValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'='", null, null, null, null, 
			"'%'", "'?'", "':'", "'=='", "'>='", "'<='", "'<>'", "'>'", "'<'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REAL", "BOOL", "STRING", "SEPARATOR", "TXT", "REAL_INT", "REAL_HEX", 
			"REAL_FLOAT", "ONCOMMENT", "MLCOMMENT", "WS", "PLUS", "MINUS", "MULT", 
			"DIV", "POW", "FAC", "ASSIGN", "AND", "OR", "NOT", "XOR", "REMAIN", "COND_IF", 
			"COLON", "EQUAL", "GREQUAL", "LEEQUAL", "NOTEQUAL", "GREATER", "LESS", 
			"PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "TRUE", "FALSE", "IF", "THEN", 
			"ELSE", "BEGIN", "END", "WHILE", "READ", "WRITE", "MODULE", "INPUT", 
			"OUTPUT", "ERROR", "FOR", "CLASS", "CONSTRUCTOR", "DESTRUCTOR", "BREAK", 
			"CONTINUE", "SWITCH", "CASE", "PROTECTED", "PRIVATE", "PUBLIC", "THIS", 
			"RETURN", "TRY", "CATCH", "FINALLY", "THROW", "NEW", "DELETE", "INCLUDE", 
			"USING", "NAMESPACE", "IMPORT", "EXTENDS", "INTERFACE", "ENUM", "STATIC", 
			"ABSTRACT", "FINAL", "CONST", "DO", "STRUCT", "DEFAULT", "IMPLEMENTS", 
			"SUPER", "THROWS", "VOID", "IDENTIFIER", "OTHER"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vocabularyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(vocabularyParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				ifCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				variableDeclarator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				whileLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				write();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(vocabularyParser.COLON, 0); }
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public TerminalNode REAL() { return getToken(vocabularyParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(vocabularyParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(vocabularyParser.STRING, 0); }
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(IDENTIFIER);
			setState(39);
			match(COLON);
			setState(40);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			match(SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(vocabularyParser.ASSIGN, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(IDENTIFIER);
				setState(44);
				match(ASSIGN);
				setState(45);
				boolExp();
				setState(46);
				match(SEPARATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(ASSIGN);
				setState(50);
				textExp(0);
				setState(51);
				match(SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(IDENTIFIER);
				setState(54);
				match(ASSIGN);
				setState(55);
				mathExp(0);
				setState(56);
				match(SEPARATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(vocabularyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(vocabularyParser.FALSE, 0); }
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitBoolExp(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		BoolExpContext _localctx = new BoolExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_boolExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextExpContext extends ParserRuleContext {
		public TerminalNode TXT() { return getToken(vocabularyParser.TXT, 0); }
		public List<TextExpContext> textExp() {
			return getRuleContexts(TextExpContext.class);
		}
		public TextExpContext textExp(int i) {
			return getRuleContext(TextExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(vocabularyParser.PLUS, 0); }
		public TextExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterTextExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitTextExp(this);
		}
	}

	public final TextExpContext textExp() throws RecognitionException {
		return textExp(0);
	}

	private TextExpContext textExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TextExpContext _localctx = new TextExpContext(_ctx, _parentState);
		TextExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_textExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			match(TXT);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_textExp);
					setState(65);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(66);
					match(PLUS);
					setState(67);
					textExp(2);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(vocabularyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(vocabularyParser.MINUS, 0); }
		public TerminalNode REMAIN() { return getToken(vocabularyParser.REMAIN, 0); }
		public TerminalNode DIV() { return getToken(vocabularyParser.DIV, 0); }
		public TerminalNode POW() { return getToken(vocabularyParser.POW, 0); }
		public TerminalNode MULT() { return getToken(vocabularyParser.MULT, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8515584L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathExpContext extends ParserRuleContext {
		public TerminalNode REAL_FLOAT() { return getToken(vocabularyParser.REAL_FLOAT, 0); }
		public TerminalNode REAL_HEX() { return getToken(vocabularyParser.REAL_HEX, 0); }
		public TerminalNode REAL_INT() { return getToken(vocabularyParser.REAL_INT, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(vocabularyParser.PARENTHESIS_OPEN, 0); }
		public List<MathExpContext> mathExp() {
			return getRuleContexts(MathExpContext.class);
		}
		public MathExpContext mathExp(int i) {
			return getRuleContext(MathExpContext.class,i);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(vocabularyParser.PARENTHESIS_CLOSE, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public MathExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterMathExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitMathExp(this);
		}
	}

	public final MathExpContext mathExp() throws RecognitionException {
		return mathExp(0);
	}

	private MathExpContext mathExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpContext _localctx = new MathExpContext(_ctx, _parentState);
		MathExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_mathExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_FLOAT:
				{
				setState(76);
				match(REAL_FLOAT);
				}
				break;
			case REAL_HEX:
				{
				setState(77);
				match(REAL_HEX);
				}
				break;
			case REAL_INT:
				{
				setState(78);
				match(REAL_INT);
				}
				break;
			case PARENTHESIS_OPEN:
				{
				setState(79);
				match(PARENTHESIS_OPEN);
				setState(80);
				mathExp(0);
				setState(81);
				match(PARENTHESIS_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mathExp);
					setState(85);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(86);
					op();
					setState(87);
					mathExp(2);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(vocabularyParser.READ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(READ);
				setState(95);
				match(IDENTIFIER);
				setState(96);
				boolExp();
				setState(97);
				match(SEPARATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(READ);
				setState(100);
				match(IDENTIFIER);
				setState(101);
				textExp(0);
				setState(102);
				match(SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(READ);
				setState(105);
				match(IDENTIFIER);
				setState(106);
				mathExp(0);
				setState(107);
				match(SEPARATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(vocabularyParser.WRITE, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(WRITE);
				setState(112);
				boolExp();
				setState(113);
				match(SEPARATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(WRITE);
				setState(116);
				textExp(0);
				setState(117);
				match(SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(WRITE);
				setState(120);
				mathExp(0);
				setState(121);
				match(SEPARATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vocabularyParser.IF, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(vocabularyParser.PARENTHESIS_OPEN, 0); }
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(vocabularyParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode THEN() { return getToken(vocabularyParser.THEN, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(vocabularyParser.ELSE, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IF);
			setState(126);
			match(PARENTHESIS_OPEN);
			setState(127);
			boolExp();
			setState(128);
			match(PARENTHESIS_CLOSE);
			setState(129);
			match(THEN);
			setState(130);
			codeBlock();
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(131);
				match(ELSE);
				setState(132);
				boolExp();
				}
				break;
			}
			setState(135);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vocabularyParser.WHILE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(vocabularyParser.PARENTHESIS_OPEN, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(vocabularyParser.PARENTHESIS_CLOSE, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WHILE);
			setState(138);
			match(PARENTHESIS_OPEN);
			setState(139);
			boolExp();
			setState(140);
			match(PARENTHESIS_CLOSE);
			setState(141);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					stat();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(vocabularyParser.MODULE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(vocabularyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vocabularyParser.IDENTIFIER, i);
		}
		public TerminalNode INPUT() { return getToken(vocabularyParser.INPUT, 0); }
		public List<TerminalNode> COLON() { return getTokens(vocabularyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(vocabularyParser.COLON, i);
		}
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public TerminalNode OUTPUT() { return getToken(vocabularyParser.OUTPUT, 0); }
		public TerminalNode BEGIN() { return getToken(vocabularyParser.BEGIN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(vocabularyParser.END, 0); }
		public TerminalNode REAL() { return getToken(vocabularyParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(vocabularyParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(vocabularyParser.STRING, 0); }
		public ReturnValueContext returnValue() {
			return getRuleContext(ReturnValueContext.class,0);
		}
		public CreateModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterCreateModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitCreateModule(this);
		}
	}

	public final CreateModuleContext createModule() throws RecognitionException {
		CreateModuleContext _localctx = new CreateModuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(MODULE);
			setState(150);
			match(IDENTIFIER);
			setState(151);
			match(INPUT);
			setState(152);
			match(COLON);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(153);
				match(IDENTIFIER);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(SEPARATOR);
			setState(160);
			match(OUTPUT);
			setState(161);
			match(COLON);
			setState(162);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(BEGIN);
			setState(164);
			codeBlock();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(165);
				returnValue();
				}
			}

			setState(168);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnValueContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(vocabularyParser.RETURN, 0); }
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public ReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitReturnValue(this);
		}
	}

	public final ReturnValueContext returnValue() throws RecognitionException {
		ReturnValueContext _localctx = new ReturnValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(RETURN);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_INT:
			case REAL_HEX:
			case REAL_FLOAT:
			case PARENTHESIS_OPEN:
				{
				setState(171);
				mathExp(0);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(172);
				boolExp();
				}
				break;
			case TXT:
				{
				setState(173);
				textExp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return textExp_sempred((TextExpContext)_localctx, predIndex);
		case 6:
			return mathExp_sempred((MathExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean textExp_sempred(TextExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mathExp_sempred(MathExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004E\b\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0086\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b\u0091\b\u000b\n\u000b"+
		"\f\u000b\u0094\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u009b\b\f\n\f\f\f\u009e\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a7\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00af\b\r\u0001\r\u0000\u0002\b\f\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003\u0001\u0000"+
		"\u0001\u0003\u0001\u0000\"#\u0002\u0000\f\u0010\u0017\u0017\u00b9\u0000"+
		"$\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004:\u0001"+
		"\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000"+
		"\u0000\nI\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000em\u0001"+
		"\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000"+
		"\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0092\u0001\u0000\u0000"+
		"\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000"+
		"\u0000\u001c%\u0003\u0004\u0002\u0000\u001d%\u0003\u0012\t\u0000\u001e"+
		"%\u0003\u0002\u0001\u0000\u001f%\u0003\u0014\n\u0000 %\u0003\u0010\b\u0000"+
		"!%\u0003\u000e\u0007\u0000\"#\u0005V\u0000\u0000#%\u0006\u0000\uffff\uffff"+
		"\u0000$\u001c\u0001\u0000\u0000\u0000$\u001d\u0001\u0000\u0000\u0000$"+
		"\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001"+
		"\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"%\u0001\u0001\u0000\u0000\u0000&\'\u0005U\u0000\u0000\'(\u0005\u0019\u0000"+
		"\u0000()\u0007\u0000\u0000\u0000)*\u0005\u0004\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+,\u0005U\u0000\u0000,-\u0005\u0012\u0000\u0000-.\u0003"+
		"\u0006\u0003\u0000./\u0005\u0004\u0000\u0000/;\u0001\u0000\u0000\u0000"+
		"01\u0005U\u0000\u000012\u0005\u0012\u0000\u000023\u0003\b\u0004\u0000"+
		"34\u0005\u0004\u0000\u00004;\u0001\u0000\u0000\u000056\u0005U\u0000\u0000"+
		"67\u0005\u0012\u0000\u000078\u0003\f\u0006\u000089\u0005\u0004\u0000\u0000"+
		"9;\u0001\u0000\u0000\u0000:+\u0001\u0000\u0000\u0000:0\u0001\u0000\u0000"+
		"\u0000:5\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0007"+
		"\u0001\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0006\u0004\uffff"+
		"\uffff\u0000?@\u0005\u0005\u0000\u0000@F\u0001\u0000\u0000\u0000AB\n\u0001"+
		"\u0000\u0000BC\u0005\f\u0000\u0000CE\u0003\b\u0004\u0002DA\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IJ\u0007\u0002\u0000\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0006\u0006"+
		"\uffff\uffff\u0000LT\u0005\b\u0000\u0000MT\u0005\u0007\u0000\u0000NT\u0005"+
		"\u0006\u0000\u0000OP\u0005 \u0000\u0000PQ\u0003\f\u0006\u0000QR\u0005"+
		"!\u0000\u0000RT\u0001\u0000\u0000\u0000SK\u0001\u0000\u0000\u0000SM\u0001"+
		"\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000"+
		"T[\u0001\u0000\u0000\u0000UV\n\u0001\u0000\u0000VW\u0003\n\u0005\u0000"+
		"WX\u0003\f\u0006\u0002XZ\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\\r\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005*"+
		"\u0000\u0000_`\u0005U\u0000\u0000`a\u0003\u0006\u0003\u0000ab\u0005\u0004"+
		"\u0000\u0000bn\u0001\u0000\u0000\u0000cd\u0005*\u0000\u0000de\u0005U\u0000"+
		"\u0000ef\u0003\b\u0004\u0000fg\u0005\u0004\u0000\u0000gn\u0001\u0000\u0000"+
		"\u0000hi\u0005*\u0000\u0000ij\u0005U\u0000\u0000jk\u0003\f\u0006\u0000"+
		"kl\u0005\u0004\u0000\u0000ln\u0001\u0000\u0000\u0000m^\u0001\u0000\u0000"+
		"\u0000mc\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000n\u000f\u0001"+
		"\u0000\u0000\u0000op\u0005+\u0000\u0000pq\u0003\u0006\u0003\u0000qr\u0005"+
		"\u0004\u0000\u0000r|\u0001\u0000\u0000\u0000st\u0005+\u0000\u0000tu\u0003"+
		"\b\u0004\u0000uv\u0005\u0004\u0000\u0000v|\u0001\u0000\u0000\u0000wx\u0005"+
		"+\u0000\u0000xy\u0003\f\u0006\u0000yz\u0005\u0004\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{o\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000"+
		"{w\u0001\u0000\u0000\u0000|\u0011\u0001\u0000\u0000\u0000}~\u0005$\u0000"+
		"\u0000~\u007f\u0005 \u0000\u0000\u007f\u0080\u0003\u0006\u0003\u0000\u0080"+
		"\u0081\u0005!\u0000\u0000\u0081\u0082\u0005%\u0000\u0000\u0082\u0085\u0003"+
		"\u0016\u000b\u0000\u0083\u0084\u0005&\u0000\u0000\u0084\u0086\u0003\u0006"+
		"\u0003\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0016"+
		"\u000b\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0005)\u0000"+
		"\u0000\u008a\u008b\u0005 \u0000\u0000\u008b\u008c\u0003\u0006\u0003\u0000"+
		"\u008c\u008d\u0005!\u0000\u0000\u008d\u008e\u0003\u0016\u000b\u0000\u008e"+
		"\u0015\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u0000\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0017\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005,\u0000\u0000\u0096\u0097\u0005U\u0000\u0000\u0097\u0098\u0005"+
		"-\u0000\u0000\u0098\u009c\u0005\u0019\u0000\u0000\u0099\u009b\u0005U\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a1\u0005.\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0019\u0000\u0000\u00a2\u00a3\u0007\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005\'\u0000\u0000\u00a4\u00a6\u0003\u0016\u000b\u0000\u00a5"+
		"\u00a7\u0003\u001a\r\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005(\u0000\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005"+
		"<\u0000\u0000\u00ab\u00af\u0003\f\u0006\u0000\u00ac\u00af\u0003\u0006"+
		"\u0003\u0000\u00ad\u00af\u0003\b\u0004\u0000\u00ae\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u001b\u0001\u0000\u0000\u0000\f$:FS[m{\u0085\u0092\u009c"+
		"\u00a6\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}