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
		REAL_FLOAT=8, ONCOMMENT=9, MLCOMMENT=10, CODEBLOCK=11, WS=12, PLUS=13, 
		MINUS=14, MULT=15, DIV=16, POW=17, FAC=18, ASSIGN=19, AND=20, OR=21, NOT=22, 
		XOR=23, REMAIN=24, COND_IF=25, COLON=26, EQUAL=27, GREQUAL=28, LEEQUAL=29, 
		NOTEQUAL=30, GREATER=31, LESS=32, PARENTHESIS_OPEN=33, PARENTHESIS_CLOSE=34, 
		COMMA=35, NEWLINE=36, TRUE=37, FALSE=38, IF=39, THEN=40, ELSE=41, BEGIN=42, 
		END=43, WHILE=44, READ=45, WRITE=46, MODULE=47, INPUT=48, OUTPUT=49, RETURN=50, 
		IDENTIFIER=51, OTHER=52, INDENT=53, DEDENT=54;
	public static final int
		RULE_comment = 0, RULE_compoundStat = 1, RULE_simpleStat = 2, RULE_stat = 3, 
		RULE_end = 4, RULE_variableDeclarator = 5, RULE_callModule = 6, RULE_assign = 7, 
		RULE_boolExp = 8, RULE_textExp = 9, RULE_mathOp = 10, RULE_logicalOp = 11, 
		RULE_compareOp = 12, RULE_mathExp = 13, RULE_read = 14, RULE_write = 15, 
		RULE_ifCondition = 16, RULE_whileLoop = 17, RULE_codeBlock = 18, RULE_moduleInput = 19, 
		RULE_moduleOutput = 20, RULE_createModule = 21, RULE_returnValue = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"comment", "compoundStat", "simpleStat", "stat", "end", "variableDeclarator", 
			"callModule", "assign", "boolExp", "textExp", "mathOp", "logicalOp", 
			"compareOp", "mathExp", "read", "write", "ifCondition", "whileLoop", 
			"codeBlock", "moduleInput", "moduleOutput", "createModule", "returnValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", null, null, null, null, null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'='", null, null, null, 
			null, "'%'", "'?'", "':'", "'=='", "'>='", "'<='", "'<>'", "'>'", "'<'", 
			"'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REAL", "BOOL", "STRING", "SEPARATOR", "TXT", "REAL_INT", "REAL_HEX", 
			"REAL_FLOAT", "ONCOMMENT", "MLCOMMENT", "CODEBLOCK", "WS", "PLUS", "MINUS", 
			"MULT", "DIV", "POW", "FAC", "ASSIGN", "AND", "OR", "NOT", "XOR", "REMAIN", 
			"COND_IF", "COLON", "EQUAL", "GREQUAL", "LEEQUAL", "NOTEQUAL", "GREATER", 
			"LESS", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "COMMA", "NEWLINE", 
			"TRUE", "FALSE", "IF", "THEN", "ELSE", "BEGIN", "END", "WHILE", "READ", 
			"WRITE", "MODULE", "INPUT", "OUTPUT", "RETURN", "IDENTIFIER", "OTHER", 
			"INDENT", "DEDENT"
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode ONCOMMENT() { return getToken(vocabularyParser.ONCOMMENT, 0); }
		public TerminalNode MLCOMMENT() { return getToken(vocabularyParser.MLCOMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==ONCOMMENT || _la==MLCOMMENT) ) {
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
	public static class CompoundStatContext extends ParserRuleContext {
		public Token OTHER;
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public CreateModuleContext createModule() {
			return getRuleContext(CreateModuleContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(vocabularyParser.OTHER, 0); }
		public CompoundStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterCompoundStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitCompoundStat(this);
		}
	}

	public final CompoundStatContext compoundStat() throws RecognitionException {
		CompoundStatContext _localctx = new CompoundStatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compoundStat);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONCOMMENT:
			case MLCOMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				comment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				ifCondition();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				whileLoop();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				createModule();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				((CompoundStatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((CompoundStatContext)_localctx).OTHER!=null?((CompoundStatContext)_localctx).OTHER.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SimpleStatContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public CallModuleContext callModule() {
			return getRuleContext(CallModuleContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public SimpleStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterSimpleStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitSimpleStat(this);
		}
	}

	public final SimpleStatContext simpleStat() throws RecognitionException {
		SimpleStatContext _localctx = new SimpleStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStat);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				variableDeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				write();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				read();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				callModule();
				setState(61);
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
	public static class StatContext extends ParserRuleContext {
		public CompoundStatContext compoundStat() {
			return getRuleContext(CompoundStatContext.class,0);
		}
		public SimpleStatContext simpleStat() {
			return getRuleContext(SimpleStatContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONCOMMENT:
			case MLCOMMENT:
			case IF:
			case WHILE:
			case MODULE:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				compoundStat();
				}
				break;
			case READ:
			case WRITE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				simpleStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class EndContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(vocabularyParser.EOF, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			stat();
			setState(70);
			match(EOF);
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
		enterRule(_localctx, 10, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENTIFIER);
			setState(73);
			match(COLON);
			setState(74);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			match(SEPARATOR);
			System.out.println("variableDeclarator");
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
	public static class CallModuleContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(vocabularyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vocabularyParser.IDENTIFIER, i);
		}
		public TerminalNode PARENTHESIS_OPEN() { return getToken(vocabularyParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(vocabularyParser.PARENTHESIS_CLOSE, 0); }
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public CallModuleContext callModule() {
			return getRuleContext(CallModuleContext.class,0);
		}
		public CallModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterCallModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitCallModule(this);
		}
	}

	public final CallModuleContext callModule() throws RecognitionException {
		CallModuleContext _localctx = new CallModuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IDENTIFIER);
			setState(79);
			match(PARENTHESIS_OPEN);
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(80);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(81);
				mathExp(0);
				}
				break;
			case 3:
				{
				setState(82);
				boolExp(0);
				}
				break;
			case 4:
				{
				setState(83);
				textExp(0);
				}
				break;
			case 5:
				{
				setState(84);
				callModule();
				}
				break;
			}
			setState(87);
			match(PARENTHESIS_CLOSE);
			System.out.println("Call Module");
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
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(ASSIGN);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(92);
				boolExp(0);
				}
				break;
			case 2:
				{
				setState(93);
				textExp(0);
				}
				break;
			case 3:
				{
				setState(94);
				mathExp(0);
				}
				break;
			}
			setState(97);
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
	public static class BoolExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(vocabularyParser.NOT, 0); }
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public TerminalNode PARENTHESIS_OPEN() { return getToken(vocabularyParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(vocabularyParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode TRUE() { return getToken(vocabularyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(vocabularyParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
		public CallModuleContext callModule() {
			return getRuleContext(CallModuleContext.class,0);
		}
		public TerminalNode REAL_INT() { return getToken(vocabularyParser.REAL_INT, 0); }
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
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
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(100);
				match(NOT);
				setState(101);
				boolExp(7);
				}
				break;
			case 2:
				{
				setState(102);
				match(PARENTHESIS_OPEN);
				setState(103);
				boolExp(0);
				setState(104);
				match(PARENTHESIS_CLOSE);
				}
				break;
			case 3:
				{
				setState(106);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(107);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(108);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(109);
				callModule();
				}
				break;
			case 7:
				{
				setState(110);
				match(REAL_INT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(113);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(116);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AND:
					case OR:
					case XOR:
						{
						setState(114);
						logicalOp();
						}
						break;
					case EQUAL:
					case GREQUAL:
					case LEEQUAL:
					case NOTEQUAL:
					case GREATER:
					case LESS:
						{
						setState(115);
						compareOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118);
					boolExp(9);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_textExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			match(TXT);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_textExp);
					setState(128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(129);
					match(PLUS);
					setState(130);
					textExp(2);
					}
					} 
				}
				setState(135);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(vocabularyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(vocabularyParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(vocabularyParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(vocabularyParser.DIV, 0); }
		public TerminalNode POW() { return getToken(vocabularyParser.POW, 0); }
		public MathOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterMathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitMathOp(this);
		}
	}

	public final MathOpContext mathOp() throws RecognitionException {
		MathOpContext _localctx = new MathOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0) ) {
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
	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(vocabularyParser.AND, 0); }
		public TerminalNode OR() { return getToken(vocabularyParser.OR, 0); }
		public TerminalNode XOR() { return getToken(vocabularyParser.XOR, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitLogicalOp(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 11534336L) != 0) ) {
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
	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(vocabularyParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(vocabularyParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(vocabularyParser.LESS, 0); }
		public TerminalNode GREQUAL() { return getToken(vocabularyParser.GREQUAL, 0); }
		public TerminalNode LEEQUAL() { return getToken(vocabularyParser.LEEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(vocabularyParser.NOTEQUAL, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitCompareOp(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0) ) {
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
		public MathExpContext mathExp;
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
		public CallModuleContext callModule() {
			return getRuleContext(CallModuleContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
		public MathOpContext mathOp() {
			return getRuleContext(MathOpContext.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_mathExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(143);
				match(REAL_FLOAT);
				}
				break;
			case 2:
				{
				setState(144);
				match(REAL_HEX);
				}
				break;
			case 3:
				{
				setState(145);
				match(REAL_INT);
				}
				break;
			case 4:
				{
				setState(146);
				match(PARENTHESIS_OPEN);
				setState(147);
				((MathExpContext)_localctx).mathExp = mathExp(0);
				setState(148);
				match(PARENTHESIS_CLOSE);
				}
				break;
			case 5:
				{
				setState(150);
				callModule();
				}
				break;
			case 6:
				{
				setState(151);
				match(IDENTIFIER);
				System.out.println("mathExp" + " " + (((MathExpContext)_localctx).mathExp!=null?_input.getText(((MathExpContext)_localctx).mathExp.start,((MathExpContext)_localctx).mathExp.stop):null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mathExp);
					setState(155);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(156);
					mathOp();
					setState(157);
					((MathExpContext)_localctx).mathExp = mathExp(4);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(vocabularyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vocabularyParser.IDENTIFIER, i);
		}
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public CallModuleContext callModule() {
			return getRuleContext(CallModuleContext.class,0);
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
		enterRule(_localctx, 28, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(READ);
			setState(165);
			match(IDENTIFIER);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(166);
				boolExp(0);
				}
				break;
			case 2:
				{
				setState(167);
				mathExp(0);
				}
				break;
			case 3:
				{
				setState(168);
				textExp(0);
				}
				break;
			case 4:
				{
				setState(169);
				callModule();
				}
				break;
			case 5:
				{
				setState(170);
				match(IDENTIFIER);
				}
				break;
			}
			setState(173);
			match(SEPARATOR);
			System.out.println("Read");
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
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
		}
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public CallModuleContext callModule() {
			return getRuleContext(CallModuleContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 30, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WRITE);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(177);
				boolExp(0);
				}
				break;
			case 2:
				{
				setState(178);
				mathExp(0);
				}
				break;
			case 3:
				{
				setState(179);
				textExp(0);
				}
				break;
			case 4:
				{
				setState(180);
				callModule();
				}
				break;
			case 5:
				{
				setState(181);
				match(IDENTIFIER);
				}
				break;
			}
			setState(184);
			match(SEPARATOR);
			System.out.println("Write");
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
		public TerminalNode THEN() { return getToken(vocabularyParser.THEN, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
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
		enterRule(_localctx, 32, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IF);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(188);
				boolExp(0);
				}
				break;
			case 2:
				{
				setState(189);
				textExp(0);
				}
				break;
			case 3:
				{
				setState(190);
				mathExp(0);
				}
				break;
			}
			setState(193);
			match(THEN);
			setState(194);
			codeBlock();
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(195);
				match(ELSE);
				setState(196);
				codeBlock();
				}
				break;
			}
			System.out.println("IF statement");
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
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TextExpContext textExp() {
			return getRuleContext(TextExpContext.class,0);
		}
		public MathExpContext mathExp() {
			return getRuleContext(MathExpContext.class,0);
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
		enterRule(_localctx, 34, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WHILE);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(202);
				boolExp(0);
				}
				break;
			case 2:
				{
				setState(203);
				textExp(0);
				}
				break;
			case 3:
				{
				setState(204);
				mathExp(0);
				}
				break;
			}
			setState(207);
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
		public List<TerminalNode> CODEBLOCK() { return getTokens(vocabularyParser.CODEBLOCK); }
		public TerminalNode CODEBLOCK(int i) {
			return getToken(vocabularyParser.CODEBLOCK, i);
		}
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
		enterRule(_localctx, 36, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CODEBLOCK);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(212);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CODEBLOCK:
						{
						setState(210);
						match(CODEBLOCK);
						}
						break;
					case ONCOMMENT:
					case MLCOMMENT:
					case IF:
					case WHILE:
					case READ:
					case WRITE:
					case MODULE:
					case IDENTIFIER:
					case OTHER:
						{
						setState(211);
						stat();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			System.out.println("Code Block");
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
	public static class ModuleInputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(vocabularyParser.INPUT, 0); }
		public TerminalNode COLON() { return getToken(vocabularyParser.COLON, 0); }
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public ModuleInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterModuleInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitModuleInput(this);
		}
	}

	public final ModuleInputContext moduleInput() throws RecognitionException {
		ModuleInputContext _localctx = new ModuleInputContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_moduleInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT) {
				{
				setState(219);
				match(INPUT);
				setState(220);
				match(COLON);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(221);
					variableDeclarator();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			System.out.println("Module Input");
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
	public static class ModuleOutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(vocabularyParser.OUTPUT, 0); }
		public TerminalNode COLON() { return getToken(vocabularyParser.COLON, 0); }
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
		public TerminalNode REAL() { return getToken(vocabularyParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(vocabularyParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(vocabularyParser.STRING, 0); }
		public ModuleOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).enterModuleOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vocabularyListener ) ((vocabularyListener)listener).exitModuleOutput(this);
		}
	}

	public final ModuleOutputContext moduleOutput() throws RecognitionException {
		ModuleOutputContext _localctx = new ModuleOutputContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_moduleOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(231);
				match(OUTPUT);
				setState(232);
				match(COLON);
				setState(233);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				match(SEPARATOR);
				}
			}

			System.out.println("Module Output");
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
		public TerminalNode IDENTIFIER() { return getToken(vocabularyParser.IDENTIFIER, 0); }
		public ModuleInputContext moduleInput() {
			return getRuleContext(ModuleInputContext.class,0);
		}
		public ModuleOutputContext moduleOutput() {
			return getRuleContext(ModuleOutputContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(vocabularyParser.BEGIN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(vocabularyParser.END, 0); }
		public List<ReturnValueContext> returnValue() {
			return getRuleContexts(ReturnValueContext.class);
		}
		public ReturnValueContext returnValue(int i) {
			return getRuleContext(ReturnValueContext.class,i);
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
		enterRule(_localctx, 42, RULE_createModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(MODULE);
			setState(240);
			match(IDENTIFIER);
			setState(241);
			moduleInput();
			setState(242);
			moduleOutput();
			setState(243);
			match(BEGIN);
			setState(244);
			codeBlock();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN) {
				{
				{
				setState(245);
				returnValue();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(END);
			System.out.println("Create Module");
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
		public TerminalNode SEPARATOR() { return getToken(vocabularyParser.SEPARATOR, 0); }
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
		enterRule(_localctx, 44, RULE_returnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(RETURN);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(255);
				mathExp(0);
				}
				break;
			case 2:
				{
				setState(256);
				boolExp(0);
				}
				break;
			case 3:
				{
				setState(257);
				textExp(0);
				}
				break;
			}
			setState(260);
			match(SEPARATOR);
			System.out.println("Return a value");
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
		case 8:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		case 9:
			return textExp_sempred((TextExpContext)_localctx, predIndex);
		case 13:
			return mathExp_sempred((MathExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean textExp_sempred(TextExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mathExp_sempred(MathExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00016\u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"D\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"V\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bp\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bu\b\b\u0001\b\u0001\b\u0005\by\b\b\n\b\f\b|\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0084\b\t\n\t\f\t\u0087\t\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u009a\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a0\b\r"+
		"\n\r\f\r\u00a3\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ac\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00b7\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c0"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c6"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00ce\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00d5\b\u0012\n\u0012\f\u0012\u00d8\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00df\b\u0013\n\u0013\f\u0013\u00e2\t\u0013\u0003\u0013\u00e4\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00ec\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00f7\b\u0015\n\u0015\f\u0015\u00fa\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0103"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0003\u0010"+
		"\u0012\u001a\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0005\u0001\u0000\t\n\u0001"+
		"\u0000\u0001\u0003\u0001\u0000\r\u0011\u0002\u0000\u0014\u0015\u0017\u0017"+
		"\u0001\u0000\u001b \u0123\u0000.\u0001\u0000\u0000\u0000\u00026\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000"+
		"\u0000\bE\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fN\u0001"+
		"\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000"+
		"\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0088\u0001\u0000\u0000\u0000"+
		"\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000"+
		"\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00a4\u0001\u0000\u0000\u0000"+
		"\u001e\u00b0\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\""+
		"\u00c9\u0001\u0000\u0000\u0000$\u00d1\u0001\u0000\u0000\u0000&\u00e3\u0001"+
		"\u0000\u0000\u0000(\u00eb\u0001\u0000\u0000\u0000*\u00ef\u0001\u0000\u0000"+
		"\u0000,\u00fe\u0001\u0000\u0000\u0000./\u0007\u0000\u0000\u0000/\u0001"+
		"\u0001\u0000\u0000\u000007\u0003\u0000\u0000\u000017\u0003 \u0010\u0000"+
		"27\u0003\"\u0011\u000037\u0003*\u0015\u000045\u00054\u0000\u000057\u0006"+
		"\u0001\uffff\uffff\u000060\u0001\u0000\u0000\u000061\u0001\u0000\u0000"+
		"\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u00007\u0003\u0001\u0000\u0000\u00008@\u0003\u000e\u0007\u0000"+
		"9@\u0003\n\u0005\u0000:@\u0003\u001e\u000f\u0000;@\u0003\u001c\u000e\u0000"+
		"<=\u0003\f\u0006\u0000=>\u0005\u0004\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000"+
		"\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AD\u0003\u0002\u0001\u0000BD\u0003\u0004\u0002\u0000"+
		"CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0007\u0001\u0000"+
		"\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0005\u0000\u0000\u0001G\t\u0001"+
		"\u0000\u0000\u0000HI\u00053\u0000\u0000IJ\u0005\u001a\u0000\u0000JK\u0007"+
		"\u0001\u0000\u0000KL\u0005\u0004\u0000\u0000LM\u0006\u0005\uffff\uffff"+
		"\u0000M\u000b\u0001\u0000\u0000\u0000NO\u00053\u0000\u0000OU\u0005!\u0000"+
		"\u0000PV\u00053\u0000\u0000QV\u0003\u001a\r\u0000RV\u0003\u0010\b\u0000"+
		"SV\u0003\u0012\t\u0000TV\u0003\f\u0006\u0000UP\u0001\u0000\u0000\u0000"+
		"UQ\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\"\u0000"+
		"\u0000XY\u0006\u0006\uffff\uffff\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0005"+
		"3\u0000\u0000[_\u0005\u0013\u0000\u0000\\`\u0003\u0010\b\u0000]`\u0003"+
		"\u0012\t\u0000^`\u0003\u001a\r\u0000_\\\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0005\u0004\u0000\u0000b\u000f\u0001\u0000\u0000\u0000cd\u0006\b\uffff"+
		"\uffff\u0000de\u0005\u0016\u0000\u0000ep\u0003\u0010\b\u0007fg\u0005!"+
		"\u0000\u0000gh\u0003\u0010\b\u0000hi\u0005\"\u0000\u0000ip\u0001\u0000"+
		"\u0000\u0000jp\u0005%\u0000\u0000kp\u0005&\u0000\u0000lp\u00053\u0000"+
		"\u0000mp\u0003\f\u0006\u0000np\u0005\u0006\u0000\u0000oc\u0001\u0000\u0000"+
		"\u0000of\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000pz\u0001\u0000\u0000\u0000qt\n\b\u0000\u0000ru\u0003"+
		"\u0016\u000b\u0000su\u0003\u0018\f\u0000tr\u0001\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0003\u0010\b\twy\u0001"+
		"\u0000\u0000\u0000xq\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0011\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0006\t\uffff\uffff\u0000~\u007f"+
		"\u0005\u0005\u0000\u0000\u007f\u0085\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\n\u0001\u0000\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0084\u0003"+
		"\u0012\t\u0002\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0007\u0002\u0000\u0000\u0089\u0015\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0007\u0003\u0000\u0000\u008b\u0017\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0007\u0004\u0000\u0000\u008d\u0019\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0006\r\uffff\uffff\u0000\u008f\u009a\u0005\b"+
		"\u0000\u0000\u0090\u009a\u0005\u0007\u0000\u0000\u0091\u009a\u0005\u0006"+
		"\u0000\u0000\u0092\u0093\u0005!\u0000\u0000\u0093\u0094\u0003\u001a\r"+
		"\u0000\u0094\u0095\u0005\"\u0000\u0000\u0095\u009a\u0001\u0000\u0000\u0000"+
		"\u0096\u009a\u0003\f\u0006\u0000\u0097\u0098\u00053\u0000\u0000\u0098"+
		"\u009a\u0006\r\uffff\uffff\u0000\u0099\u008e\u0001\u0000\u0000\u0000\u0099"+
		"\u0090\u0001\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099"+
		"\u0092\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u00a1\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\n\u0003\u0000\u0000\u009c\u009d\u0003\u0014\n\u0000\u009d\u009e"+
		"\u0003\u001a\r\u0004\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009b\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001b\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"-\u0000\u0000\u00a5\u00ab\u00053\u0000\u0000\u00a6\u00ac\u0003\u0010\b"+
		"\u0000\u00a7\u00ac\u0003\u001a\r\u0000\u00a8\u00ac\u0003\u0012\t\u0000"+
		"\u00a9\u00ac\u0003\f\u0006\u0000\u00aa\u00ac\u00053\u0000\u0000\u00ab"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0004\u0000\u0000\u00ae\u00af\u0006\u000e\uffff\uffff\u0000"+
		"\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b6\u0005.\u0000\u0000\u00b1"+
		"\u00b7\u0003\u0010\b\u0000\u00b2\u00b7\u0003\u001a\r\u0000\u00b3\u00b7"+
		"\u0003\u0012\t\u0000\u00b4\u00b7\u0003\f\u0006\u0000\u00b5\u00b7\u0005"+
		"3\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u0004\u0000\u0000\u00b9\u00ba\u0006\u000f"+
		"\uffff\uffff\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00bf\u0005"+
		"\'\u0000\u0000\u00bc\u00c0\u0003\u0010\b\u0000\u00bd\u00c0\u0003\u0012"+
		"\t\u0000\u00be\u00c0\u0003\u001a\r\u0000\u00bf\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005(\u0000\u0000"+
		"\u00c2\u00c5\u0003$\u0012\u0000\u00c3\u00c4\u0005)\u0000\u0000\u00c4\u00c6"+
		"\u0003$\u0012\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006"+
		"\u0010\uffff\uffff\u0000\u00c8!\u0001\u0000\u0000\u0000\u00c9\u00cd\u0005"+
		",\u0000\u0000\u00ca\u00ce\u0003\u0010\b\u0000\u00cb\u00ce\u0003\u0012"+
		"\t\u0000\u00cc\u00ce\u0003\u001a\r\u0000\u00cd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003$\u0012\u0000"+
		"\u00d0#\u0001\u0000\u0000\u0000\u00d1\u00d6\u0005\u000b\u0000\u0000\u00d2"+
		"\u00d5\u0005\u000b\u0000\u0000\u00d3\u00d5\u0003\u0006\u0003\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0006\u0012\uffff\uffff\u0000"+
		"\u00da%\u0001\u0000\u0000\u0000\u00db\u00dc\u00050\u0000\u0000\u00dc\u00e0"+
		"\u0005\u001a\u0000\u0000\u00dd\u00df\u0003\n\u0005\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00db\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0006\u0013\uffff\uffff\u0000\u00e6\'\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u00051\u0000\u0000\u00e8\u00e9\u0005\u001a"+
		"\u0000\u0000\u00e9\u00ea\u0007\u0001\u0000\u0000\u00ea\u00ec\u0005\u0004"+
		"\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0006\u0014"+
		"\uffff\uffff\u0000\u00ee)\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005/\u0000"+
		"\u0000\u00f0\u00f1\u00053\u0000\u0000\u00f1\u00f2\u0003&\u0013\u0000\u00f2"+
		"\u00f3\u0003(\u0014\u0000\u00f3\u00f4\u0005*\u0000\u0000\u00f4\u00f8\u0003"+
		"$\u0012\u0000\u00f5\u00f7\u0003,\u0016\u0000\u00f6\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005+\u0000\u0000"+
		"\u00fc\u00fd\u0006\u0015\uffff\uffff\u0000\u00fd+\u0001\u0000\u0000\u0000"+
		"\u00fe\u0102\u00052\u0000\u0000\u00ff\u0103\u0003\u001a\r\u0000\u0100"+
		"\u0103\u0003\u0010\b\u0000\u0101\u0103\u0003\u0012\t\u0000\u0102\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u0004\u0000\u0000\u0105\u0106\u0006\u0016\uffff\uffff\u0000\u0106"+
		"-\u0001\u0000\u0000\u0000\u00176?CU_otz\u0085\u0099\u00a1\u00ab\u00b6"+
		"\u00bf\u00c5\u00cd\u00d4\u00d6\u00e0\u00e3\u00eb\u00f8\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}