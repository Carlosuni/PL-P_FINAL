package cup.lexico;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*

/* Tokens nuevos */
/* Comentarios */
PercenComment = "%" .*
/* Numeros enteros decimales y octales */
NumberDec = [0-9]+
NumOctal = [0-7]+ "o"
/* Numeros reales simples con coma y con notacion cientifica */
RealNum = {NumberDec} "." {NumberDec}
SciencNum = ({NumberDec} | {RealNum}) ([eE]| "e-" | "e+") {NumberDec}
/* Booleanos */
BoolWord = "true" | "false"
/* Variable: Palabras alfanumericas (para nombres variables) */
Variable = ([a-z] | [A-Z] | [0-9])* ([a-z]) ([a-z] | [A-Z] | [0-9])*
/* Palabras reservadas (TODO: comprobar su necesidad con implementacion de la gramatica */
/* RestrictedWord = "TRUE" | "FALSE" | "REAL" | "BOOLEANO" | "SI" | "SINO" | "ENTONCES" | "FINSI" | "AND" | "OR" | "NOT" | "MIENTRAS" | "FINMIENTRAS" */ 


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {Whitespace} {    }
  ";"          { return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          { return symbolFactory.newSymbol("PLUS", PLUS); }
  "-"          { return symbolFactory.newSymbol("MINUS", MINUS); }
  "*"          { return symbolFactory.newSymbol("TIMES", TIMES); }
  "n"          { return symbolFactory.newSymbol("UMINUS", UMINUS); }
  "("          { return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          { return symbolFactory.newSymbol("RPAREN", RPAREN); }
  {NumberDec}     { return symbolFactory.newSymbol("NUMBERDEC", NUMBERDEC, Integer.parseInt(yytext())); }
  {PercenComment}     { return symbolFactory.newSymbol("PERCCOMM", PERCCOMM); }
  {NumOctal}     { return symbolFactory.newSymbol("NUMOCTAL", NUMOCTAL); }
  {RealNum}     { return symbolFactory.newSymbol("REALNUM", REALNUM, Double.parseDouble(yytext())); }
  {SciencNum}     { return symbolFactory.newSymbol("SCIENCNUM", SCIENCNUM, Double.parseDouble(yytext())); }
  {BoolWord}     { return symbolFactory.newSymbol("BOOLWORD", BOOLWORD, Boolean.parseBoolean(yytext())); }
  "INF"          { return symbolFactory.newSymbol("INF", INF); }
  "/"          { return symbolFactory.newSymbol("DIV", DIV); }
  "AND"          { return symbolFactory.newSymbol("AND", AND); }
  "OR"          { return symbolFactory.newSymbol("OR", OR); }
  "NOT"          { return symbolFactory.newSymbol("NOT", NOT); }
  "=="          { return symbolFactory.newSymbol("EQUALTO", EQUALTO); }
  "<="          { return symbolFactory.newSymbol("GREATERTHAN", GREATERTHAN); }
  ">="          { return symbolFactory.newSymbol("LOWERTHAN", LOWERTHAN); }
  "="          { return symbolFactory.newSymbol("ASIGN", ASIGN); }
  "SI"    { return symbolFactory.newSymbol("SI", SI); }
  "ENTONCES"    { return symbolFactory.newSymbol("ENTONCES", ENTONCES); }
  "SINO"    { return symbolFactory.newSymbol("SINO", SINO); }
  "FINSI"    { return symbolFactory.newSymbol("FINSI", FINSI); }  
  "MIENTRAS"    { return symbolFactory.newSymbol("MIENTRAS", MIENTRAS); }  
  "FINMIENTRAS"    { return symbolFactory.newSymbol("FINMIENTRAS", FINMIENTRAS); }
  "REAL"    { return symbolFactory.newSymbol("REALTYPE", REALTYPE); }
  "BOOLEANO"    { return symbolFactory.newSymbol("BOOLEANTYPE", BOOLEANTYPE); }
  ","          { return symbolFactory.newSymbol("COMMA", COMMA); }
  {Variable}     { return symbolFactory.newSymbol("VARIABLE", VARIABLE, yytext()); }
}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
