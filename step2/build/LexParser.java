// Generated from Lex.g by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, KEYWORD=34, IDENTIFIER=35, OPERATOR=36, INTLITERAL=37, 
		FLOATLITERAL=38, STRINGLITERAL=39, DIGITS=40, WORDS=41, COMMENT=42, WS=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'WHILE'", "'ELSE'", "'READ'", "'!='", "'END'", "';'", 
		"'='", "'IF'", "'FUNCTION'", "':='", "'<='", "'('", "'CONTINUE'", "'*'", 
		"'RETURN'", "','", "'VOID'", "'STRING'", "'ENDWHILE'", "'BREAK'", "'INT'", 
		"'>='", "'<'", "'>'", "'PROGRAM'", "'ENDIF'", "'FLOAT'", "')'", "'BEGIN'", 
		"'+'", "'-'", "'WRITE'", "KEYWORD", "IDENTIFIER", "OPERATOR", "INTLITERAL", 
		"FLOATLITERAL", "STRINGLITERAL", "DIGITS", "WORDS", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl = 4, 
		RULE_str = 5, RULE_var_decl = 6, RULE_var_type = 7, RULE_any_type = 8, 
		RULE_id_list = 9, RULE_id_tail = 10, RULE_param_decl_list = 11, RULE_param_decl = 12, 
		RULE_param_decl_tail = 13, RULE_func_declarations = 14, RULE_func_decl = 15, 
		RULE_func_body = 16, RULE_stmt_list = 17, RULE_stmt = 18, RULE_base_stmt = 19, 
		RULE_assign_stmt = 20, RULE_assign_expr = 21, RULE_read_stmt = 22, RULE_write_stmt = 23, 
		RULE_return_stmt = 24, RULE_expr = 25, RULE_expr_prefix = 26, RULE_factor = 27, 
		RULE_factor_prefix = 28, RULE_postfix_expr = 29, RULE_call_expr = 30, 
		RULE_expr_list = 31, RULE_expr_list_tail = 32, RULE_primary = 33, RULE_addop = 34, 
		RULE_mulop = 35, RULE_if_stmt = 36, RULE_else_part = 37, RULE_cond = 38, 
		RULE_compop = 39, RULE_while_stmt = 40, RULE_aug_stmt_list = 41, RULE_aug_stmt = 42, 
		RULE_aug_if_stmt = 43, RULE_aug_else_part = 44;
	public static final String[] ruleNames = {
		"program", "id", "pgm_body", "decl", "string_decl", "str", "var_decl", 
		"var_type", "any_type", "id_list", "id_tail", "param_decl_list", "param_decl", 
		"param_decl_tail", "func_declarations", "func_decl", "func_body", "stmt_list", 
		"stmt", "base_stmt", "assign_stmt", "assign_expr", "read_stmt", "write_stmt", 
		"return_stmt", "expr", "expr_prefix", "factor", "factor_prefix", "postfix_expr", 
		"call_expr", "expr_list", "expr_list_tail", "primary", "addop", "mulop", 
		"if_stmt", "else_part", "cond", "compop", "while_stmt", "aug_stmt_list", 
		"aug_stmt", "aug_if_stmt", "aug_else_part"
	};

	@Override
	public String getGrammarFileName() { return "Lex.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(T__7);
			setState(91); id();
			setState(92); match(T__3);
			setState(93); pgm_body();
			setState(94); match(T__27);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(IDENTIFIER);
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

	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterPgm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitPgm_body(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); decl();
			setState(99); func_declarations();
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); string_decl();
				setState(102); decl();
				}
				break;
			case T__11:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); var_decl();
				setState(105); decl();
				}
				break;
			case T__31:
			case T__30:
			case T__29:
			case T__27:
			case T__24:
			case T__23:
			case T__19:
			case T__17:
			case T__13:
			case T__12:
			case T__6:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class String_declContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitString_decl(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__14);
			setState(111); id();
			setState(112); match(T__22);
			setState(113); str();
			setState(114); match(T__26);
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(LexParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(STRINGLITERAL);
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

	public static class Var_declContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); var_type();
			setState(119); id_list();
			setState(120); match(T__26);
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

	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_any_type);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case T__11:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); var_type();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(T__15);
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

	public static class Id_listContext extends ParserRuleContext {
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); id();
			setState(129); id_tail();
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

	public static class Id_tailContext extends ParserRuleContext {
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterId_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitId_tail(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_tail);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(T__16);
				setState(132); id();
				setState(133); id_tail();
				}
				break;
			case T__26:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterParam_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitParam_decl_list(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param_decl_list);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case T__11:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); param_decl();
				setState(139); param_decl_tail();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); var_type();
			setState(145); id();
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

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterParam_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitParam_decl_tail(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_tail);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(T__16);
				setState(148); param_decl();
				setState(149); param_decl_tail();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_declarations(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_declarations);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); func_decl();
				setState(155); func_declarations();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declContext extends ParserRuleContext {
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(T__23);
			setState(161); any_type();
			setState(162); id();
			setState(163); match(T__20);
			setState(164); param_decl_list();
			setState(165); match(T__4);
			setState(166); match(T__3);
			setState(167); func_body();
			setState(168); match(T__27);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); decl();
			setState(171); stmt_list();
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

	public static class Stmt_listContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_list);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__31:
			case T__29:
			case T__24:
			case T__17:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); stmt();
				setState(174); stmt_list();
				}
				break;
			case T__30:
			case T__27:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case T__29:
			case T__17:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); base_stmt();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); if_stmt();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); while_stmt();
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

	public static class Base_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterBase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitBase_stmt(this);
		}
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_base_stmt);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); assign_stmt();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); read_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); write_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(187); return_stmt();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); assign_expr();
			setState(191); match(T__26);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); id();
			setState(194); match(T__22);
			setState(195); expr();
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

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(T__29);
			setState(198); match(T__20);
			setState(199); id_list();
			setState(200); match(T__4);
			setState(201); match(T__26);
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

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitWrite_stmt(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(T__0);
			setState(204); match(T__20);
			setState(205); id_list();
			setState(206); match(T__4);
			setState(207); match(T__26);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(T__17);
			setState(210); expr();
			setState(211); match(T__26);
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

	public static class ExprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); expr_prefix(0);
			setState(214); factor();
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

	public static class Expr_prefixContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr_prefix(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		return expr_prefix(0);
	}

	private Expr_prefixContext expr_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, _parentState);
		Expr_prefixContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_prefix);
					setState(217);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(218); factor();
					setState(219); addop();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); factor_prefix(0);
			setState(227); postfix_expr();
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

	public static class Factor_prefixContext extends ParserRuleContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public Factor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFactor_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFactor_prefix(this);
		}
	}

	public final Factor_prefixContext factor_prefix() throws RecognitionException {
		return factor_prefix(0);
	}

	private Factor_prefixContext factor_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_prefixContext _localctx = new Factor_prefixContext(_ctx, _parentState);
		Factor_prefixContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_factor_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Factor_prefixContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_factor_prefix);
					setState(230);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(231); postfix_expr();
					setState(232); mulop();
					}
					} 
				}
				setState(238);
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

	public static class Postfix_exprContext extends ParserRuleContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterPostfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitPostfix_expr(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_postfix_expr);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); call_expr();
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

	public static class Call_exprContext extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); id();
			setState(244); match(T__20);
			setState(245); expr_list();
			setState(246); match(T__4);
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

	public static class Expr_listContext extends ParserRuleContext {
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_list);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); expr();
				setState(249); expr_list_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_list_tail);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(T__16);
				setState(255); expr();
				setState(256); expr_list_tail();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(LexParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(LexParser.FLOATLITERAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); match(T__20);
				setState(262); expr();
				setState(263); match(T__4);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); id();
				}
				break;
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(266); match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); match(FLOATLITERAL);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class If_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(T__24);
			setState(275); match(T__20);
			setState(276); cond();
			setState(277); match(T__4);
			setState(278); decl();
			setState(279); stmt_list();
			setState(280); else_part();
			setState(281); match(T__6);
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

	public static class Else_partContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_else_part);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); match(T__30);
				setState(284); decl();
				setState(285); stmt_list();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); expr();
			setState(291); compop();
			setState(292); expr();
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

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__21) | (1L << T__10) | (1L << T__9) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class While_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(T__31);
			setState(297); match(T__20);
			setState(298); cond();
			setState(299); match(T__4);
			setState(300); decl();
			setState(301); aug_stmt_list();
			setState(302); match(T__13);
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

	public static class Aug_stmt_listContext extends ParserRuleContext {
		public Aug_stmtContext aug_stmt() {
			return getRuleContext(Aug_stmtContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public Aug_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_stmt_list(this);
		}
	}

	public final Aug_stmt_listContext aug_stmt_list() throws RecognitionException {
		Aug_stmt_listContext _localctx = new Aug_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_aug_stmt_list);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case T__31:
			case T__29:
			case T__24:
			case T__19:
			case T__17:
			case T__12:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); aug_stmt();
				setState(305); aug_stmt_list();
				}
				break;
			case T__30:
			case T__13:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Aug_stmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Aug_if_stmtContext aug_if_stmt() {
			return getRuleContext(Aug_if_stmtContext.class,0);
		}
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public Aug_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_stmt(this);
		}
	}

	public final Aug_stmtContext aug_stmt() throws RecognitionException {
		Aug_stmtContext _localctx = new Aug_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aug_stmt);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case T__29:
			case T__17:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); base_stmt();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); aug_if_stmt();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(312); while_stmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(313); match(T__19);
				setState(314); match(T__26);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(315); match(T__12);
				setState(316); match(T__26);
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

	public static class Aug_if_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Aug_else_partContext aug_else_part() {
			return getRuleContext(Aug_else_partContext.class,0);
		}
		public Aug_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_if_stmt(this);
		}
	}

	public final Aug_if_stmtContext aug_if_stmt() throws RecognitionException {
		Aug_if_stmtContext _localctx = new Aug_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aug_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(T__24);
			setState(320); match(T__20);
			setState(321); cond();
			setState(322); match(T__4);
			setState(323); decl();
			setState(324); aug_stmt_list();
			setState(325); aug_else_part();
			setState(326); match(T__6);
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

	public static class Aug_else_partContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public Aug_else_partContext aug_else_part() {
			return getRuleContext(Aug_else_partContext.class,0);
		}
		public Aug_else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_else_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_else_part(this);
		}
	}

	public final Aug_else_partContext aug_else_part() throws RecognitionException {
		Aug_else_partContext _localctx = new Aug_else_partContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_aug_else_part);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); match(T__30);
				setState(329); decl();
				setState(330); aug_stmt_list();
				setState(331); aug_else_part();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26: return expr_prefix_sempred((Expr_prefixContext)_localctx, predIndex);
		case 28: return factor_prefix_sempred((Factor_prefixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_prefix_sempred(Factor_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_prefix_sempred(Expr_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\5\n\u0081\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\5\r\u0091\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u009b\n\17\3\20\3\20\3\20\3\20\5\20\u00a1\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00b4\n\23\3\24\3\24\3\24\5\24\u00b9\n\24\3\25\3\25"+
		"\3\25\3\25\5\25\u00bf\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u00e0\n\34\f\34\16\34\u00e3"+
		"\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u00ed\n\36\f\36\16"+
		"\36\u00f0\13\36\3\37\3\37\5\37\u00f4\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\5"+
		"!\u00ff\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0106\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u010f"+
		"\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u0123"+
		"\n\'\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\5+\u0137\n"+
		"+\3,\3,\3,\3,\3,\3,\3,\5,\u0140\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\5.\u0151\n.\3.\2\4\66:/\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\6\4\2\30\30\36\36\3\2!\""+
		"\4\2\3\3\21\21\6\2\7\7\n\n\16\16\31\33\u0141\2\\\3\2\2\2\4b\3\2\2\2\6"+
		"d\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20|\3\2\2\2\22"+
		"\u0080\3\2\2\2\24\u0082\3\2\2\2\26\u008a\3\2\2\2\30\u0090\3\2\2\2\32\u0092"+
		"\3\2\2\2\34\u009a\3\2\2\2\36\u00a0\3\2\2\2 \u00a2\3\2\2\2\"\u00ac\3\2"+
		"\2\2$\u00b3\3\2\2\2&\u00b8\3\2\2\2(\u00be\3\2\2\2*\u00c0\3\2\2\2,\u00c3"+
		"\3\2\2\2.\u00c7\3\2\2\2\60\u00cd\3\2\2\2\62\u00d3\3\2\2\2\64\u00d7\3\2"+
		"\2\2\66\u00da\3\2\2\28\u00e4\3\2\2\2:\u00e7\3\2\2\2<\u00f3\3\2\2\2>\u00f5"+
		"\3\2\2\2@\u00fe\3\2\2\2B\u0105\3\2\2\2D\u010e\3\2\2\2F\u0110\3\2\2\2H"+
		"\u0112\3\2\2\2J\u0114\3\2\2\2L\u0122\3\2\2\2N\u0124\3\2\2\2P\u0128\3\2"+
		"\2\2R\u012a\3\2\2\2T\u0136\3\2\2\2V\u013f\3\2\2\2X\u0141\3\2\2\2Z\u0150"+
		"\3\2\2\2\\]\7\34\2\2]^\5\4\3\2^_\7 \2\2_`\5\6\4\2`a\7\b\2\2a\3\3\2\2\2"+
		"bc\7%\2\2c\5\3\2\2\2de\5\b\5\2ef\5\36\20\2f\7\3\2\2\2gh\5\n\6\2hi\5\b"+
		"\5\2io\3\2\2\2jk\5\16\b\2kl\5\b\5\2lo\3\2\2\2mo\3\2\2\2ng\3\2\2\2nj\3"+
		"\2\2\2nm\3\2\2\2o\t\3\2\2\2pq\7\25\2\2qr\5\4\3\2rs\7\r\2\2st\5\f\7\2t"+
		"u\7\t\2\2u\13\3\2\2\2vw\7)\2\2w\r\3\2\2\2xy\5\20\t\2yz\5\24\13\2z{\7\t"+
		"\2\2{\17\3\2\2\2|}\t\2\2\2}\21\3\2\2\2~\u0081\5\20\t\2\177\u0081\7\24"+
		"\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\5\4"+
		"\3\2\u0083\u0084\5\26\f\2\u0084\25\3\2\2\2\u0085\u0086\7\23\2\2\u0086"+
		"\u0087\5\4\3\2\u0087\u0088\5\26\f\2\u0088\u008b\3\2\2\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\27\3\2\2\2\u008c"+
		"\u008d\5\32\16\2\u008d\u008e\5\34\17\2\u008e\u0091\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008f\3\2\2\2\u0091\31\3\2\2\2\u0092"+
		"\u0093\5\20\t\2\u0093\u0094\5\4\3\2\u0094\33\3\2\2\2\u0095\u0096\7\23"+
		"\2\2\u0096\u0097\5\32\16\2\u0097\u0098\5\34\17\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b\35\3\2\2"+
		"\2\u009c\u009d\5 \21\2\u009d\u009e\5\36\20\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\37\3\2\2"+
		"\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\5\4\3\2\u00a5"+
		"\u00a6\7\17\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\37\2\2\u00a8\u00a9"+
		"\7 \2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7\b\2\2\u00ab!\3\2\2\2\u00ac"+
		"\u00ad\5\b\5\2\u00ad\u00ae\5$\23\2\u00ae#\3\2\2\2\u00af\u00b0\5&\24\2"+
		"\u00b0\u00b1\5$\23\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00af"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4%\3\2\2\2\u00b5\u00b9\5(\25\2\u00b6"+
		"\u00b9\5J&\2\u00b7\u00b9\5R*\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\'\3\2\2\2\u00ba\u00bf\5*\26\2\u00bb\u00bf\5"+
		".\30\2\u00bc\u00bf\5\60\31\2\u00bd\u00bf\5\62\32\2\u00be\u00ba\3\2\2\2"+
		"\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf)\3"+
		"\2\2\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\7\t\2\2\u00c2+\3\2\2\2\u00c3\u00c4"+
		"\5\4\3\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\5\64\33\2\u00c6-\3\2\2\2\u00c7"+
		"\u00c8\7\6\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb"+
		"\7\37\2\2\u00cb\u00cc\7\t\2\2\u00cc/\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce"+
		"\u00cf\7\17\2\2\u00cf\u00d0\5\24\13\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2"+
		"\7\t\2\2\u00d2\61\3\2\2\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\5\64\33\2\u00d5"+
		"\u00d6\7\t\2\2\u00d6\63\3\2\2\2\u00d7\u00d8\5\66\34\2\u00d8\u00d9\58\35"+
		"\2\u00d9\65\3\2\2\2\u00da\u00e1\b\34\1\2\u00db\u00dc\f\4\2\2\u00dc\u00dd"+
		"\58\35\2\u00dd\u00de\5F$\2\u00de\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\67\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\5:\36\2\u00e5\u00e6\5<\37\2\u00e69"+
		"\3\2\2\2\u00e7\u00ee\b\36\1\2\u00e8\u00e9\f\4\2\2\u00e9\u00ea\5<\37\2"+
		"\u00ea\u00eb\5H%\2\u00eb\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef;\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\5D#\2\u00f2\u00f4\5> \2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f4=\3\2\2\2\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7"+
		"\17\2\2\u00f7\u00f8\5@!\2\u00f8\u00f9\7\37\2\2\u00f9?\3\2\2\2\u00fa\u00fb"+
		"\5\64\33\2\u00fb\u00fc\5B\"\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\3\2\2\2"+
		"\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ffA\3\2\2\2\u0100\u0101\7"+
		"\23\2\2\u0101\u0102\5\64\33\2\u0102\u0103\5B\"\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0104\3\2\2\2\u0106C\3\2\2\2"+
		"\u0107\u0108\7\17\2\2\u0108\u0109\5\64\33\2\u0109\u010a\7\37\2\2\u010a"+
		"\u010f\3\2\2\2\u010b\u010f\5\4\3\2\u010c\u010f\7\'\2\2\u010d\u010f\7("+
		"\2\2\u010e\u0107\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010fE\3\2\2\2\u0110\u0111\t\3\2\2\u0111G\3\2\2\2\u0112"+
		"\u0113\t\4\2\2\u0113I\3\2\2\2\u0114\u0115\7\13\2\2\u0115\u0116\7\17\2"+
		"\2\u0116\u0117\5N(\2\u0117\u0118\7\37\2\2\u0118\u0119\5\b\5\2\u0119\u011a"+
		"\5$\23\2\u011a\u011b\5L\'\2\u011b\u011c\7\35\2\2\u011cK\3\2\2\2\u011d"+
		"\u011e\7\5\2\2\u011e\u011f\5\b\5\2\u011f\u0120\5$\23\2\u0120\u0123\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"M\3\2\2\2\u0124\u0125\5\64\33\2\u0125\u0126\5P)\2\u0126\u0127\5\64\33"+
		"\2\u0127O\3\2\2\2\u0128\u0129\t\5\2\2\u0129Q\3\2\2\2\u012a\u012b\7\4\2"+
		"\2\u012b\u012c\7\17\2\2\u012c\u012d\5N(\2\u012d\u012e\7\37\2\2\u012e\u012f"+
		"\5\b\5\2\u012f\u0130\5T+\2\u0130\u0131\7\26\2\2\u0131S\3\2\2\2\u0132\u0133"+
		"\5V,\2\u0133\u0134\5T+\2\u0134\u0137\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0132\3\2\2\2\u0136\u0135\3\2\2\2\u0137U\3\2\2\2\u0138\u0140\5(\25\2"+
		"\u0139\u0140\5X-\2\u013a\u0140\5R*\2\u013b\u013c\7\20\2\2\u013c\u0140"+
		"\7\t\2\2\u013d\u013e\7\27\2\2\u013e\u0140\7\t\2\2\u013f\u0138\3\2\2\2"+
		"\u013f\u0139\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140W\3\2\2\2\u0141\u0142\7\13\2\2\u0142\u0143\7\17\2\2\u0143"+
		"\u0144\5N(\2\u0144\u0145\7\37\2\2\u0145\u0146\5\b\5\2\u0146\u0147\5T+"+
		"\2\u0147\u0148\5Z.\2\u0148\u0149\7\35\2\2\u0149Y\3\2\2\2\u014a\u014b\7"+
		"\5\2\2\u014b\u014c\5\b\5\2\u014c\u014d\5T+\2\u014d\u014e\5Z.\2\u014e\u0151"+
		"\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"[\3\2\2\2\25n\u0080\u008a\u0090\u009a\u00a0\u00b3\u00b8\u00be\u00e1\u00ee"+
		"\u00f3\u00fe\u0105\u010e\u0122\u0136\u013f\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}