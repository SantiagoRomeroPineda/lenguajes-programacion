// Generated from Bot.g4 by ANTLR 4.4
package co.edu.javeriana.bot;


	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, TRUE=2, FALSE=3, NUMBER=4, FLOAT=5, BOOLEAN=6, COMMENT=7, UP=8, 
		LEFT=9, RIGHT=10, DOWN=11, DROP=12, PICK=13, SEMICOLON=14, PLUS=15, SUBTRACTION=16, 
		MULTIPLICATION=17, DIVISION=18, COMMA=19, ASSIGN=20, QUESTION=21, DOLLAR=22, 
		IF=23, ELSE=24, ARROW_RIGHT=25, END=26, AND=27, OR=28, NOT=29, MINOR=30, 
		MAYOR=31, MINOREQ=32, MAYOREQ=33, EQUAL=34, NOTEQUAL=35, PARENTHESIS=36, 
		RIGHTPARENTHESIS=37, DEFINE=38, WHILE=39, BR_OPEN=40, BR_CLOSE=41, VAR=42, 
		ID=43, WS=44;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING", "'@T'", "'@F'", "NUMBER", "FLOAT", "BOOLEAN", "'#'", 
		"'^'", "LEFT", "RIGHT", "'V'", "'D'", "'P'", "';'", "'+'", "'-'", "'*'", 
		"'/'", "','", "'<-'", "'?'", "'$'", "'if'", "'else'", "'->'", "'end'", 
		"'&'", "'|'", "'!'", "MINOR", "MAYOR", "'<='", "'>='", "'='", "'<>'", 
		"'('", "')'", "'define'", "'while'", "'{'", "'}'", "'''", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_condition = 1, RULE_if_conditional = 2, RULE_while_cicle = 3, 
		RULE_parameters = 4, RULE_function = 5, RULE_up_movement = 6, RULE_left_movement = 7, 
		RULE_right_movement = 8, RULE_down_movement = 9, RULE_pick = 10, RULE_drop = 11, 
		RULE_declaration = 12, RULE_assign = 13, RULE_both = 14, RULE_output = 15, 
		RULE_expression = 16, RULE_arithmetic = 17, RULE_factor = 18, RULE_term = 19, 
		RULE_dato = 20, RULE_comment = 21, RULE_sentence = 22;
	public static final String[] ruleNames = {
		"program", "condition", "if_conditional", "while_cicle", "parameters", 
		"function", "up_movement", "left_movement", "right_movement", "down_movement", 
		"pick", "drop", "declaration", "assign", "both", "output", "expression", 
		"arithmetic", "factor", "term", "dato", "comment", "sentence"
	};

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



		Map<String, Object> symbolTable = new HashMap<String, Object>();
		private Bot bot;
		
		public BotParser(TokenStream input, Bot bot) {
			this(input);
			this.bot = bot;
		}


	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(46); sentence();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class If_conditionalContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public If_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterIf_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitIf_conditional(this);
		}
	}

	public final If_conditionalContext if_conditional() throws RecognitionException {
		If_conditionalContext _localctx = new If_conditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(IF);
			setState(55); condition();
			setState(56); match(ARROW_RIGHT);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(57); sentence();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(END);
			setState(64); match(SEMICOLON);
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

	public static class While_cicleContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode WHILE() { return getToken(BotParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterWhile_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitWhile_cicle(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_cicle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(WHILE);
			setState(67); match(PARENTHESIS);
			setState(68); condition();
			setState(69); match(RIGHTPARENTHESIS);
			setState(70); match(ARROW_RIGHT);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(71); sentence();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(END);
			setState(78); match(SEMICOLON);
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode COMMA() { return getToken(BotParser.COMMA, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(VAR);
			setState(81); match(ID);
			setState(83);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(82); match(COMMA);
				}
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

	public static class FunctionContext extends ParserRuleContext {
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode DEFINE() { return getToken(BotParser.DEFINE, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode ARROW_RIGHT() { return getToken(BotParser.ARROW_RIGHT, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(DEFINE);
			setState(86); match(ID);
			setState(87); match(PARENTHESIS);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(88); parameters();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(RIGHTPARENTHESIS);
			setState(95); match(ARROW_RIGHT);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << UP) | (1L << LEFT) | (1L << RIGHT) | (1L << DOWN) | (1L << DROP) | (1L << PICK) | (1L << DOLLAR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(96); sentence();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(END);
			setState(103); match(SEMICOLON);
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

	public static class Up_movementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode UP() { return getToken(BotParser.UP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Up_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterUp_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitUp_movement(this);
		}
	}

	public final Up_movementContext up_movement() throws RecognitionException {
		Up_movementContext _localctx = new Up_movementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_up_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(UP);
			setState(106); ((Up_movementContext)_localctx).expression = expression();
			setState(107); match(SEMICOLON);
			bot.up((int)((Up_movementContext)_localctx).expression.value);
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

	public static class Left_movementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode LEFT() { return getToken(BotParser.LEFT, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Left_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterLeft_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitLeft_movement(this);
		}
	}

	public final Left_movementContext left_movement() throws RecognitionException {
		Left_movementContext _localctx = new Left_movementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(LEFT);
			setState(111); ((Left_movementContext)_localctx).expression = expression();
			setState(112); match(SEMICOLON);
			bot.left((int)((Left_movementContext)_localctx).expression.value);
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

	public static class Right_movementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Right_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterRight_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitRight_movement(this);
		}
	}

	public final Right_movementContext right_movement() throws RecognitionException {
		Right_movementContext _localctx = new Right_movementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_right_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(RIGHT);
			setState(116); ((Right_movementContext)_localctx).expression = expression();
			setState(117); match(SEMICOLON);
			bot.right((int)((Right_movementContext)_localctx).expression.value);
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

	public static class Down_movementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOWN() { return getToken(BotParser.DOWN, 0); }
		public Down_movementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDown_movement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDown_movement(this);
		}
	}

	public final Down_movementContext down_movement() throws RecognitionException {
		Down_movementContext _localctx = new Down_movementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_down_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(DOWN);
			setState(121); ((Down_movementContext)_localctx).expression = expression();
			setState(122); match(SEMICOLON);
			bot.down((int)((Down_movementContext)_localctx).expression.value);
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

	public static class PickContext extends ParserRuleContext {
		public TerminalNode PICK() { return getToken(BotParser.PICK, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public PickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitPick(this);
		}
	}

	public final PickContext pick() throws RecognitionException {
		PickContext _localctx = new PickContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(PICK);
			setState(126); match(SEMICOLON);
			bot.pick();
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode DROP() { return getToken(BotParser.DROP, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDrop(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(DROP);
			setState(130); match(SEMICOLON);
			bot.drop();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(VAR);
			setState(134); ((DeclarationContext)_localctx).ID = match(ID);
			setState(135); match(SEMICOLON);
			symbolTable.put((((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null),0);
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

	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public ArithmeticContext arithmetic;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BotParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); ((AssignContext)_localctx).ID = match(ID);
			setState(139); match(ASSIGN);
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(140); ((AssignContext)_localctx).expression = expression();
				symbolTable.put((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), ((AssignContext)_localctx).expression.value);
				}
				break;
			case 2:
				{
				setState(143); ((AssignContext)_localctx).arithmetic = arithmetic();
				symbolTable.put((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), ((AssignContext)_localctx).arithmetic.value);
				}
				break;
			}
			setState(148); match(SEMICOLON);
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

	public static class BothContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public ArithmeticContext arithmetic;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BotParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public BothContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_both; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitBoth(this);
		}
	}

	public final BothContext both() throws RecognitionException {
		BothContext _localctx = new BothContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_both);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(VAR);
			setState(151); ((BothContext)_localctx).ID = match(ID);
			setState(152); match(ASSIGN);
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(153); ((BothContext)_localctx).expression = expression();
				symbolTable.put((((BothContext)_localctx).ID!=null?((BothContext)_localctx).ID.getText():null), ((BothContext)_localctx).expression.value);
				}
				break;
			case 2:
				{
				setState(156); ((BothContext)_localctx).arithmetic = arithmetic();
				symbolTable.put((((BothContext)_localctx).ID!=null?((BothContext)_localctx).ID.getText():null), ((BothContext)_localctx).arithmetic.value);
				}
				break;
			}
			setState(161); match(SEMICOLON);
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

	public static class OutputContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ArithmeticContext arithmetic;
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode DOLLAR() { return getToken(BotParser.DOLLAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(DOLLAR);
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(164); ((OutputContext)_localctx).expression = expression();
				System.out.println(((OutputContext)_localctx).expression.value);
				}
				break;
			case 2:
				{
				setState(167); ((OutputContext)_localctx).arithmetic = arithmetic();
				System.out.println(((OutputContext)_localctx).arithmetic.value);
				}
				break;
			}
			setState(172); match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Object value;
		public DatoContext dato;
		public Token ID;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case STRING:
			case TRUE:
			case FALSE:
			case NUMBER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); ((ExpressionContext)_localctx).dato = dato();
				((ExpressionContext)_localctx).value =   ((ExpressionContext)_localctx).dato.value;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); ((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).value =   symbolTable.get((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
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

	public static class ArithmeticContext extends ParserRuleContext {
		public Object value;
		public FactorContext t1;
		public FactorContext t2;
		public TerminalNode SUBTRACTION(int i) {
			return getToken(BotParser.SUBTRACTION, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SUBTRACTION() { return getTokens(BotParser.SUBTRACTION); }
		public List<TerminalNode> PLUS() { return getTokens(BotParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BotParser.PLUS, i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); ((ArithmeticContext)_localctx).t1 = factor();
			((ArithmeticContext)_localctx).value =  (int)((ArithmeticContext)_localctx).t1.value;
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUBTRACTION) {
				{
				setState(191);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(183); match(PLUS);
					setState(184); ((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).value = (int)_localctx.value + (int)((ArithmeticContext)_localctx).t2.value;
					}
					break;
				case SUBTRACTION:
					{
					setState(187); match(SUBTRACTION);
					setState(188); ((ArithmeticContext)_localctx).t2 = factor();
					((ArithmeticContext)_localctx).value = (int)_localctx.value - (int)((ArithmeticContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public Object value;
		public TermContext t1;
		public TermContext t2;
		public List<TerminalNode> DIVISION() { return getTokens(BotParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(BotParser.DIVISION, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(BotParser.MULTIPLICATION, i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(BotParser.MULTIPLICATION); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); ((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).value =  (int)((FactorContext)_localctx).t1.value;
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION || _la==DIVISION) {
				{
				setState(206);
				switch (_input.LA(1)) {
				case MULTIPLICATION:
					{
					setState(198); match(MULTIPLICATION);
					setState(199); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).value = (int)_localctx.value * (int)((FactorContext)_localctx).t2.value;
					}
					break;
				case DIVISION:
					{
					setState(202); match(DIVISION);
					setState(203); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).value = (int)_localctx.value / (int)((FactorContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token ID;
		public ArithmeticContext arithmetic;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PARENTHESIS() { return getToken(BotParser.PARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(BotParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value =   Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value =   symbolTable.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); match(PARENTHESIS);
				setState(216); ((TermContext)_localctx).arithmetic = arithmetic();
				((TermContext)_localctx).value =   ((TermContext)_localctx).arithmetic.value;
				setState(218); match(RIGHTPARENTHESIS);
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

	public static class DatoContext extends ParserRuleContext {
		public Object value;
		public Token STRING;
		public Token NUMBER;
		public Token FLOAT;
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(BotParser.FLOAT, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDato(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dato);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); ((DatoContext)_localctx).STRING = match(STRING);
				((DatoContext)_localctx).value =   (((DatoContext)_localctx).STRING!=null?((DatoContext)_localctx).STRING.getText():null);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(FALSE);
				((DatoContext)_localctx).value =   false;
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); match(TRUE);
				((DatoContext)_localctx).value =   true;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(228); ((DatoContext)_localctx).NUMBER = match(NUMBER);
				((DatoContext)_localctx).value =   Integer.parseInt((((DatoContext)_localctx).NUMBER!=null?((DatoContext)_localctx).NUMBER.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(230); ((DatoContext)_localctx).FLOAT = match(FLOAT);
				((DatoContext)_localctx).value =   Float.parseFloat((((DatoContext)_localctx).FLOAT!=null?((DatoContext)_localctx).FLOAT.getText():null));
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(BotParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(COMMENT);
			setState(235); match(STRING);
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

	public static class SentenceContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Left_movementContext left_movement() {
			return getRuleContext(Left_movementContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Right_movementContext right_movement() {
			return getRuleContext(Right_movementContext.class,0);
		}
		public Down_movementContext down_movement() {
			return getRuleContext(Down_movementContext.class,0);
		}
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Up_movementContext up_movement() {
			return getRuleContext(Up_movementContext.class,0);
		}
		public BothContext both() {
			return getRuleContext(BothContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sentence);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); down_movement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); up_movement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); left_movement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240); right_movement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241); pick();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242); drop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243); output();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244); comment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245); declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(246); assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(247); both();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\5\6V\n\6\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3"+
		"\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0095\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a2\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ad\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00b6\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c2\n\23"+
		"\f\23\16\23\u00c5\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u00d1\n\24\f\24\16\24\u00d4\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u00df\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00eb\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fb\n\30\3\30\2\2\31\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u0103\2\63\3\2\2\2\4\66\3\2\2"+
		"\2\68\3\2\2\2\bD\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16k\3\2\2\2\20p\3\2\2\2"+
		"\22u\3\2\2\2\24z\3\2\2\2\26\177\3\2\2\2\30\u0083\3\2\2\2\32\u0087\3\2"+
		"\2\2\34\u008c\3\2\2\2\36\u0098\3\2\2\2 \u00a5\3\2\2\2\"\u00b5\3\2\2\2"+
		"$\u00b7\3\2\2\2&\u00c6\3\2\2\2(\u00de\3\2\2\2*\u00ea\3\2\2\2,\u00ec\3"+
		"\2\2\2.\u00fa\3\2\2\2\60\62\5.\30\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\3\2\2\2\67\5\3"+
		"\2\2\289\7\31\2\29:\5\4\3\2:>\7\33\2\2;=\5.\30\2<;\3\2\2\2=@\3\2\2\2>"+
		"<\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\34\2\2BC\7\20\2\2C\7\3\2\2"+
		"\2DE\7)\2\2EF\7&\2\2FG\5\4\3\2GH\7\'\2\2HL\7\33\2\2IK\5.\30\2JI\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\34\2\2PQ\7\20"+
		"\2\2Q\t\3\2\2\2RS\7,\2\2SU\7-\2\2TV\7\25\2\2UT\3\2\2\2UV\3\2\2\2V\13\3"+
		"\2\2\2WX\7(\2\2XY\7-\2\2Y]\7&\2\2Z\\\5\n\6\2[Z\3\2\2\2\\_\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\'\2\2ae\7\33\2\2bd\5.\30\2cb"+
		"\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\34\2\2"+
		"ij\7\20\2\2j\r\3\2\2\2kl\7\n\2\2lm\5\"\22\2mn\7\20\2\2no\b\b\1\2o\17\3"+
		"\2\2\2pq\7\13\2\2qr\5\"\22\2rs\7\20\2\2st\b\t\1\2t\21\3\2\2\2uv\7\f\2"+
		"\2vw\5\"\22\2wx\7\20\2\2xy\b\n\1\2y\23\3\2\2\2z{\7\r\2\2{|\5\"\22\2|}"+
		"\7\20\2\2}~\b\13\1\2~\25\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\7\20\2"+
		"\2\u0081\u0082\b\f\1\2\u0082\27\3\2\2\2\u0083\u0084\7\16\2\2\u0084\u0085"+
		"\7\20\2\2\u0085\u0086\b\r\1\2\u0086\31\3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		"\u0089\7-\2\2\u0089\u008a\7\20\2\2\u008a\u008b\b\16\1\2\u008b\33\3\2\2"+
		"\2\u008c\u008d\7-\2\2\u008d\u0094\7\26\2\2\u008e\u008f\5\"\22\2\u008f"+
		"\u0090\b\17\1\2\u0090\u0095\3\2\2\2\u0091\u0092\5$\23\2\u0092\u0093\b"+
		"\17\1\2\u0093\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\20\2\2\u0097\35\3\2\2\2\u0098\u0099\7,\2"+
		"\2\u0099\u009a\7-\2\2\u009a\u00a1\7\26\2\2\u009b\u009c\5\"\22\2\u009c"+
		"\u009d\b\20\1\2\u009d\u00a2\3\2\2\2\u009e\u009f\5$\23\2\u009f\u00a0\b"+
		"\20\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\37\3\2\2\2\u00a5\u00ac\7\30"+
		"\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\b\21\1\2\u00a8\u00ad\3\2\2\2\u00a9"+
		"\u00aa\5$\23\2\u00aa\u00ab\b\21\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6\3"+
		"\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\20\2\2\u00af"+
		"!\3\2\2\2\u00b0\u00b1\5*\26\2\u00b1\u00b2\b\22\1\2\u00b2\u00b6\3\2\2\2"+
		"\u00b3\u00b4\7-\2\2\u00b4\u00b6\b\22\1\2\u00b5\u00b0\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6#\3\2\2\2\u00b7\u00b8\5&\24\2\u00b8\u00c3\b\23\1\2\u00b9"+
		"\u00ba\7\21\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\b\23\1\2\u00bc\u00c2\3"+
		"\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\b\23\1\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\5(\25\2\u00c7\u00d2\b\24\1\2\u00c8\u00c9\7\23\2\2"+
		"\u00c9\u00ca\5(\25\2\u00ca\u00cb\b\24\1\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd"+
		"\7\24\2\2\u00cd\u00ce\5(\25\2\u00ce\u00cf\b\24\1\2\u00cf\u00d1\3\2\2\2"+
		"\u00d0\u00c8\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7\6\2\2\u00d6\u00df\b\25\1\2\u00d7\u00d8\7-\2\2\u00d8\u00df\b\25"+
		"\1\2\u00d9\u00da\7&\2\2\u00da\u00db\5$\23\2\u00db\u00dc\b\25\1\2\u00dc"+
		"\u00dd\7\'\2\2\u00dd\u00df\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d7\3\2"+
		"\2\2\u00de\u00d9\3\2\2\2\u00df)\3\2\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00eb"+
		"\b\26\1\2\u00e2\u00e3\7\5\2\2\u00e3\u00eb\b\26\1\2\u00e4\u00e5\7\4\2\2"+
		"\u00e5\u00eb\b\26\1\2\u00e6\u00e7\7\6\2\2\u00e7\u00eb\b\26\1\2\u00e8\u00e9"+
		"\7\7\2\2\u00e9\u00eb\b\26\1\2\u00ea\u00e0\3\2\2\2\u00ea\u00e2\3\2\2\2"+
		"\u00ea\u00e4\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb+\3"+
		"\2\2\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\7\3\2\2\u00ee-\3\2\2\2\u00ef\u00fb"+
		"\5\24\13\2\u00f0\u00fb\5\16\b\2\u00f1\u00fb\5\20\t\2\u00f2\u00fb\5\22"+
		"\n\2\u00f3\u00fb\5\26\f\2\u00f4\u00fb\5\30\r\2\u00f5\u00fb\5 \21\2\u00f6"+
		"\u00fb\5,\27\2\u00f7\u00fb\5\32\16\2\u00f8\u00fb\5\34\17\2\u00f9\u00fb"+
		"\5\36\20\2\u00fa\u00ef\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f1\3\2\2\2"+
		"\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb/\3\2\2\2\23\63>LU]e\u0094\u00a1\u00ac\u00b5\u00c1"+
		"\u00c3\u00d0\u00d2\u00de\u00ea\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}