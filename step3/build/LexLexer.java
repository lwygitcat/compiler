// Generated from Lex.g by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'"
	};
	public static final String[] ruleNames = {
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"KEYWORD", "IDENTIFIER", "OPERATOR", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"DIGITS", "WORDS", "COMMENT", "WS"
	};


	    SymbolTable symtab = new SymbolTable();
	    int count = 0;
	    Scope currscope;
	     


	public LexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lex.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0148\n#\3$\3"+
		"$\5$\u014c\n$\3$\3$\3$\7$\u0151\n$\f$\16$\u0154\13$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u0163\n%\3&\6&\u0166\n&\r&\16&\u0167\3\'\7\'"+
		"\u016b\n\'\f\'\16\'\u016e\13\'\3\'\3\'\6\'\u0172\n\'\r\'\16\'\u0173\3"+
		"\'\6\'\u0177\n\'\r\'\16\'\u0178\3\'\3\'\5\'\u017d\n\'\3(\3(\7(\u0181\n"+
		"(\f(\16(\u0184\13(\3(\3(\3)\3)\3*\6*\u018b\n*\r*\16*\u018c\3+\3+\3+\3"+
		"+\7+\u0193\n+\f+\16+\u0196\13+\3+\3+\3+\3+\3,\6,\u019d\n,\r,\16,\u019e"+
		"\3,\3,\3\u0182\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\t\6\2,-//\61\61??"+
		"\5\2*+>>@@\4\2..==\3\2\62;\4\2C\\c|\3\2\f\f\5\2\13\f\16\17\"\"\u01c6\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7a\3\2\2\2\tf\3\2\2\2\13k\3"+
		"\2\2\2\rn\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25y\3\2\2\2\27\u0082"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u0093\3"+
		"\2\2\2!\u0095\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a3\3\2\2\2)\u00aa"+
		"\3\2\2\2+\u00b3\3\2\2\2-\u00b9\3\2\2\2/\u00bd\3\2\2\2\61\u00c0\3\2\2\2"+
		"\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00cc\3\2\2\29\u00d2\3\2\2\2;\u00d8"+
		"\3\2\2\2=\u00da\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u0147\3\2\2\2G\u014b\3\2\2\2I\u0162\3\2\2\2K\u0165\3\2\2\2M\u017c\3\2"+
		"\2\2O\u017e\3\2\2\2Q\u0187\3\2\2\2S\u018a\3\2\2\2U\u018e\3\2\2\2W\u019c"+
		"\3\2\2\2YZ\7\61\2\2Z\4\3\2\2\2[\\\7Y\2\2\\]\7J\2\2]^\7K\2\2^_\7N\2\2_"+
		"`\7G\2\2`\6\3\2\2\2ab\7G\2\2bc\7N\2\2cd\7U\2\2de\7G\2\2e\b\3\2\2\2fg\7"+
		"T\2\2gh\7G\2\2hi\7C\2\2ij\7F\2\2j\n\3\2\2\2kl\7#\2\2lm\7?\2\2m\f\3\2\2"+
		"\2no\7G\2\2op\7P\2\2pq\7F\2\2q\16\3\2\2\2rs\7=\2\2s\20\3\2\2\2tu\7?\2"+
		"\2u\22\3\2\2\2vw\7K\2\2wx\7H\2\2x\24\3\2\2\2yz\7H\2\2z{\7W\2\2{|\7P\2"+
		"\2|}\7E\2\2}~\7V\2\2~\177\7K\2\2\177\u0080\7Q\2\2\u0080\u0081\7P\2\2\u0081"+
		"\26\3\2\2\2\u0082\u0083\7<\2\2\u0083\u0084\7?\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0086\7>\2\2\u0086\u0087\7?\2\2\u0087\32\3\2\2\2\u0088\u0089\7*\2\2\u0089"+
		"\34\3\2\2\2\u008a\u008b\7E\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7P\2\2\u008d"+
		"\u008e\7V\2\2\u008e\u008f\7K\2\2\u008f\u0090\7P\2\2\u0090\u0091\7W\2\2"+
		"\u0091\u0092\7G\2\2\u0092\36\3\2\2\2\u0093\u0094\7,\2\2\u0094 \3\2\2\2"+
		"\u0095\u0096\7T\2\2\u0096\u0097\7G\2\2\u0097\u0098\7V\2\2\u0098\u0099"+
		"\7W\2\2\u0099\u009a\7T\2\2\u009a\u009b\7P\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\7.\2\2\u009d$\3\2\2\2\u009e\u009f\7X\2\2\u009f\u00a0\7Q\2\2\u00a0\u00a1"+
		"\7K\2\2\u00a1\u00a2\7F\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5"+
		"\7V\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7P\2\2\u00a8"+
		"\u00a9\7I\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7P\2\2\u00ac"+
		"\u00ad\7F\2\2\u00ad\u00ae\7Y\2\2\u00ae\u00af\7J\2\2\u00af\u00b0\7K\2\2"+
		"\u00b0\u00b1\7N\2\2\u00b1\u00b2\7G\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7D\2"+
		"\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8"+
		"\7M\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc"+
		"\7V\2\2\u00bc.\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf\60"+
		"\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c5\7R\2\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7Q\2\2\u00c7"+
		"\u00c8\7I\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7O\2\2"+
		"\u00cb\66\3\2\2\2\u00cc\u00cd\7G\2\2\u00cd\u00ce\7P\2\2\u00ce\u00cf\7"+
		"F\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7H\2\2\u00d18\3\2\2\2\u00d2\u00d3"+
		"\7H\2\2\u00d3\u00d4\7N\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7C\2\2\u00d6"+
		"\u00d7\7V\2\2\u00d7:\3\2\2\2\u00d8\u00d9\7+\2\2\u00d9<\3\2\2\2\u00da\u00db"+
		"\7D\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7I\2\2\u00dd\u00de\7K\2\2\u00de"+
		"\u00df\7P\2\2\u00df>\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1@\3\2\2\2\u00e2\u00e3"+
		"\7/\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7Y\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7"+
		"\7K\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7G\2\2\u00e9D\3\2\2\2\u00ea\u00eb"+
		"\7R\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ee\7I\2\2\u00ee"+
		"\u00ef\7T\2\2\u00ef\u00f0\7C\2\2\u00f0\u0148\7O\2\2\u00f1\u00f2\7D\2\2"+
		"\u00f2\u00f3\7G\2\2\u00f3\u00f4\7I\2\2\u00f4\u00f5\7K\2\2\u00f5\u0148"+
		"\7P\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8\7P\2\2\u00f8\u0148\7F\2\2\u00f9"+
		"\u00fa\7H\2\2\u00fa\u00fb\7W\2\2\u00fb\u00fc\7P\2\2\u00fc\u00fd\7E\2\2"+
		"\u00fd\u00fe\7V\2\2\u00fe\u00ff\7K\2\2\u00ff\u0100\7Q\2\2\u0100\u0148"+
		"\7P\2\2\u0101\u0102\7T\2\2\u0102\u0103\7G\2\2\u0103\u0104\7C\2\2\u0104"+
		"\u0148\7F\2\2\u0105\u0106\7Y\2\2\u0106\u0107\7T\2\2\u0107\u0108\7K\2\2"+
		"\u0108\u0109\7V\2\2\u0109\u0148\7G\2\2\u010a\u010b\7K\2\2\u010b\u0148"+
		"\7H\2\2\u010c\u010d\7G\2\2\u010d\u010e\7N\2\2\u010e\u010f\7U\2\2\u010f"+
		"\u0148\7G\2\2\u0110\u0111\7G\2\2\u0111\u0112\7P\2\2\u0112\u0113\7F\2\2"+
		"\u0113\u0114\7K\2\2\u0114\u0148\7H\2\2\u0115\u0116\7Y\2\2\u0116\u0117"+
		"\7J\2\2\u0117\u0118\7K\2\2\u0118\u0119\7N\2\2\u0119\u0148\7G\2\2\u011a"+
		"\u011b\7G\2\2\u011b\u011c\7P\2\2\u011c\u011d\7F\2\2\u011d\u011e\7Y\2\2"+
		"\u011e\u011f\7J\2\2\u011f\u0120\7K\2\2\u0120\u0121\7N\2\2\u0121\u0148"+
		"\7G\2\2\u0122\u0123\7E\2\2\u0123\u0124\7Q\2\2\u0124\u0125\7P\2\2\u0125"+
		"\u0126\7V\2\2\u0126\u0127\7K\2\2\u0127\u0128\7P\2\2\u0128\u0129\7W\2\2"+
		"\u0129\u0148\7G\2\2\u012a\u012b\7D\2\2\u012b\u012c\7T\2\2\u012c\u012d"+
		"\7G\2\2\u012d\u012e\7C\2\2\u012e\u0148\7M\2\2\u012f\u0130\7T\2\2\u0130"+
		"\u0131\7G\2\2\u0131\u0132\7V\2\2\u0132\u0133\7W\2\2\u0133\u0134\7T\2\2"+
		"\u0134\u0148\7P\2\2\u0135\u0136\7K\2\2\u0136\u0137\7P\2\2\u0137\u0148"+
		"\7V\2\2\u0138\u0139\7X\2\2\u0139\u013a\7Q\2\2\u013a\u013b\7K\2\2\u013b"+
		"\u0148\7F\2\2\u013c\u013d\7U\2\2\u013d\u013e\7V\2\2\u013e\u013f\7T\2\2"+
		"\u013f\u0140\7K\2\2\u0140\u0141\7P\2\2\u0141\u0148\7I\2\2\u0142\u0143"+
		"\7H\2\2\u0143\u0144\7N\2\2\u0144\u0145\7Q\2\2\u0145\u0146\7C\2\2\u0146"+
		"\u0148\7V\2\2\u0147\u00ea\3\2\2\2\u0147\u00f1\3\2\2\2\u0147\u00f6\3\2"+
		"\2\2\u0147\u00f9\3\2\2\2\u0147\u0101\3\2\2\2\u0147\u0105\3\2\2\2\u0147"+
		"\u010a\3\2\2\2\u0147\u010c\3\2\2\2\u0147\u0110\3\2\2\2\u0147\u0115\3\2"+
		"\2\2\u0147\u011a\3\2\2\2\u0147\u0122\3\2\2\2\u0147\u012a\3\2\2\2\u0147"+
		"\u012f\3\2\2\2\u0147\u0135\3\2\2\2\u0147\u0138\3\2\2\2\u0147\u013c\3\2"+
		"\2\2\u0147\u0142\3\2\2\2\u0148F\3\2\2\2\u0149\u014c\7a\2\2\u014a\u014c"+
		"\5S*\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u0152\3\2\2\2\u014d"+
		"\u0151\7a\2\2\u014e\u0151\5S*\2\u014f\u0151\5Q)\2\u0150\u014d\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153H\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0163\t\2\2\2\u0156\u0157\7?\2\2\u0157\u0163\7?\2\2\u0158\u0159\7#\2"+
		"\2\u0159\u0163\7?\2\2\u015a\u0163\t\3\2\2\u015b\u015c\7>\2\2\u015c\u0163"+
		"\7?\2\2\u015d\u015e\7@\2\2\u015e\u0163\7?\2\2\u015f\u0160\7<\2\2\u0160"+
		"\u0163\7?\2\2\u0161\u0163\t\4\2\2\u0162\u0155\3\2\2\2\u0162\u0156\3\2"+
		"\2\2\u0162\u0158\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u015b\3\2\2\2\u0162"+
		"\u015d\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0161\3\2\2\2\u0163J\3\2\2\2"+
		"\u0164\u0166\t\5\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168L\3\2\2\2\u0169\u016b\5Q)\2\u016a\u0169"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7\60\2\2\u0170\u0172\5"+
		"Q)\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u017d\3\2\2\2\u0175\u0177\5Q)\2\u0176\u0175\3\2\2"+
		"\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\7\60\2\2\u017b\u017d\3\2\2\2\u017c\u016c\3\2\2\2"+
		"\u017c\u0176\3\2\2\2\u017dN\3\2\2\2\u017e\u0182\7$\2\2\u017f\u0181\13"+
		"\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7$"+
		"\2\2\u0186P\3\2\2\2\u0187\u0188\t\5\2\2\u0188R\3\2\2\2\u0189\u018b\t\6"+
		"\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018dT\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190\7/\2\2\u0190"+
		"\u0194\3\2\2\2\u0191\u0193\n\7\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7\f\2\2\u0198\u0199\3\2\2\2\u0199\u019a\b+"+
		"\2\2\u019aV\3\2\2\2\u019b\u019d\t\b\2\2\u019c\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b,\2\2\u01a1X\3\2\2\2\21\2\u0147\u014b\u0150\u0152\u0162\u0167"+
		"\u016c\u0173\u0178\u017c\u0182\u018c\u0194\u019e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}