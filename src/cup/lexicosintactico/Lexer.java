/* The following code was generated by JFlex 1.3.5 on 5/8/19 4:43 AM */

package cup.lexicosintactico;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 5/8/19 4:43 AM from the specification file
 * <tt>file:/home/DATA/CLOUD/0_MEGA_UC3M/WS/ECLIPSE/JAVA/UNI/PL/PL-P_FINAL/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\16\0\4\0\1\3\3\0"+
    "\1\0\1\6\2\0\1\32\1\33\1\5\1\16\1\54\1\15\1\12"+
    "\1\4\10\10\2\7\1\0\1\30\1\45\1\44\1\46\2\0\1\37"+
    "\1\53\1\50\1\40\1\13\1\36\2\27\1\34\2\27\1\52\1\51"+
    "\1\35\1\41\2\27\1\42\1\47\1\43\6\27\4\0\1\0\1\0"+
    "\1\23\3\26\1\14\1\22\5\26\1\24\1\26\1\31\1\11\2\26"+
    "\1\20\1\25\1\17\1\21\5\26\4\0\41\0\2\0\4\0\4\0"+
    "\1\0\2\0\1\0\7\0\1\0\4\0\1\0\5\0\27\0\1\0"+
    "\37\0\1\0\u01ca\0\4\0\14\0\16\0\5\0\7\0\1\0\1\0"+
    "\1\0\21\0\160\0\5\0\1\0\2\0\2\0\4\0\10\0\1\0"+
    "\1\0\3\0\1\0\1\0\1\0\24\0\1\0\123\0\1\0\213\0"+
    "\1\0\5\0\2\0\236\0\11\0\46\0\2\0\1\0\7\0\47\0"+
    "\7\0\1\0\1\0\55\0\1\0\1\0\1\0\2\0\1\0\2\0"+
    "\1\0\1\0\10\0\33\0\5\0\3\0\15\0\5\0\6\0\1\0"+
    "\4\0\13\0\5\0\53\0\37\0\4\0\2\0\1\0\143\0\1\0"+
    "\1\0\10\0\1\0\6\0\2\0\2\0\1\0\4\0\2\0\12\0"+
    "\3\0\2\0\1\0\17\0\1\0\1\0\1\0\36\0\33\0\2\0"+
    "\131\0\13\0\1\0\16\0\12\0\41\0\11\0\2\0\4\0\1\0"+
    "\5\0\26\0\4\0\1\0\11\0\1\0\3\0\1\0\5\0\22\0"+
    "\31\0\3\0\104\0\1\0\1\0\13\0\67\0\33\0\1\0\4\0"+
    "\66\0\3\0\1\0\22\0\1\0\7\0\12\0\2\0\2\0\12\0"+
    "\1\0\7\0\1\0\7\0\1\0\3\0\1\0\10\0\2\0\2\0"+
    "\2\0\26\0\1\0\7\0\1\0\1\0\3\0\4\0\2\0\1\0"+
    "\1\0\7\0\2\0\2\0\2\0\3\0\1\0\10\0\1\0\4\0"+
    "\2\0\1\0\3\0\2\0\2\0\12\0\4\0\7\0\1\0\5\0"+
    "\3\0\1\0\6\0\4\0\2\0\2\0\26\0\1\0\7\0\1\0"+
    "\2\0\1\0\2\0\1\0\2\0\2\0\1\0\1\0\5\0\4\0"+
    "\2\0\2\0\3\0\3\0\1\0\7\0\4\0\1\0\1\0\7\0"+
    "\14\0\3\0\1\0\13\0\3\0\1\0\11\0\1\0\3\0\1\0"+
    "\26\0\1\0\7\0\1\0\2\0\1\0\5\0\2\0\1\0\1\0"+
    "\10\0\1\0\3\0\1\0\3\0\2\0\1\0\17\0\2\0\2\0"+
    "\2\0\12\0\1\0\1\0\17\0\3\0\1\0\10\0\2\0\2\0"+
    "\2\0\26\0\1\0\7\0\1\0\2\0\1\0\5\0\2\0\1\0"+
    "\1\0\7\0\2\0\2\0\2\0\3\0\10\0\2\0\4\0\2\0"+
    "\1\0\3\0\2\0\2\0\12\0\1\0\1\0\20\0\1\0\1\0"+
    "\1\0\6\0\3\0\3\0\1\0\4\0\3\0\2\0\1\0\1\0"+
    "\1\0\2\0\3\0\2\0\3\0\3\0\3\0\14\0\4\0\5\0"+
    "\3\0\3\0\1\0\4\0\2\0\1\0\6\0\1\0\16\0\12\0"+
    "\11\0\1\0\7\0\3\0\1\0\10\0\1\0\3\0\1\0\27\0"+
    "\1\0\12\0\1\0\5\0\3\0\1\0\7\0\1\0\3\0\1\0"+
    "\4\0\7\0\2\0\1\0\2\0\6\0\2\0\2\0\2\0\12\0"+
    "\22\0\2\0\1\0\10\0\1\0\3\0\1\0\27\0\1\0\12\0"+
    "\1\0\5\0\2\0\1\0\1\0\7\0\1\0\3\0\1\0\4\0"+
    "\7\0\2\0\7\0\1\0\1\0\2\0\2\0\2\0\12\0\1\0"+
    "\2\0\17\0\2\0\1\0\10\0\1\0\3\0\1\0\51\0\2\0"+
    "\1\0\7\0\1\0\3\0\1\0\4\0\1\0\10\0\1\0\10\0"+
    "\2\0\2\0\2\0\12\0\12\0\6\0\2\0\2\0\1\0\22\0"+
    "\3\0\30\0\1\0\11\0\1\0\1\0\2\0\7\0\3\0\1\0"+
    "\4\0\6\0\1\0\1\0\1\0\10\0\22\0\2\0\15\0\60\0"+
    "\1\0\2\0\7\0\4\0\10\0\10\0\1\0\12\0\47\0\2\0"+
    "\1\0\1\0\2\0\2\0\1\0\1\0\2\0\1\0\6\0\4\0"+
    "\1\0\7\0\1\0\3\0\1\0\1\0\1\0\1\0\2\0\2\0"+
    "\1\0\4\0\1\0\2\0\6\0\1\0\2\0\1\0\2\0\5\0"+
    "\1\0\1\0\1\0\6\0\2\0\12\0\2\0\4\0\40\0\1\0"+
    "\27\0\2\0\6\0\12\0\13\0\1\0\1\0\1\0\1\0\1\0"+
    "\4\0\2\0\10\0\1\0\44\0\4\0\24\0\1\0\2\0\5\0"+
    "\13\0\1\0\44\0\11\0\1\0\71\0\53\0\24\0\1\0\12\0"+
    "\6\0\6\0\4\0\4\0\3\0\1\0\3\0\2\0\7\0\3\0"+
    "\4\0\15\0\14\0\1\0\17\0\2\0\46\0\1\0\1\0\5\0"+
    "\1\0\2\0\53\0\1\0\u014d\0\1\0\4\0\2\0\7\0\1\0"+
    "\1\0\1\0\4\0\2\0\51\0\1\0\4\0\2\0\41\0\1\0"+
    "\4\0\2\0\7\0\1\0\1\0\1\0\4\0\2\0\17\0\1\0"+
    "\71\0\1\0\4\0\2\0\103\0\2\0\3\0\40\0\20\0\20\0"+
    "\125\0\14\0\u026c\0\2\0\21\0\1\0\32\0\5\0\113\0\3\0"+
    "\3\0\17\0\15\0\1\0\4\0\3\0\13\0\22\0\3\0\13\0"+
    "\22\0\2\0\14\0\15\0\1\0\3\0\1\0\2\0\14\0\64\0"+
    "\40\0\3\0\1\0\3\0\2\0\1\0\2\0\12\0\41\0\3\0"+
    "\2\0\12\0\6\0\130\0\10\0\51\0\1\0\1\0\5\0\106\0"+
    "\12\0\35\0\3\0\14\0\4\0\14\0\12\0\12\0\36\0\2\0"+
    "\5\0\13\0\54\0\4\0\21\0\7\0\2\0\6\0\12\0\46\0"+
    "\27\0\5\0\4\0\65\0\12\0\1\0\35\0\2\0\13\0\6\0"+
    "\12\0\15\0\1\0\130\0\5\0\57\0\21\0\7\0\4\0\12\0"+
    "\21\0\11\0\14\0\3\0\36\0\15\0\2\0\12\0\54\0\16\0"+
    "\14\0\44\0\24\0\10\0\12\0\3\0\3\0\12\0\44\0\122\0"+
    "\3\0\1\0\25\0\4\0\1\0\4\0\3\0\2\0\11\0\300\0"+
    "\47\0\25\0\4\0\u0116\0\2\0\6\0\2\0\46\0\2\0\6\0"+
    "\2\0\10\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\37\0"+
    "\2\0\65\0\1\0\7\0\1\0\1\0\3\0\3\0\1\0\7\0"+
    "\3\0\4\0\2\0\6\0\4\0\15\0\5\0\3\0\1\0\7\0"+
    "\16\0\5\0\32\0\5\0\20\0\2\0\23\0\1\0\13\0\5\0"+
    "\5\0\6\0\1\0\1\0\15\0\1\0\20\0\15\0\3\0\33\0"+
    "\25\0\15\0\4\0\1\0\3\0\14\0\21\0\1\0\4\0\1\0"+
    "\2\0\12\0\1\0\1\0\3\0\5\0\6\0\1\0\1\0\1\0"+
    "\1\0\1\0\1\0\4\0\1\0\13\0\2\0\4\0\5\0\5\0"+
    "\4\0\1\0\21\0\51\0\u0a77\0\57\0\1\0\57\0\1\0\205\0"+
    "\6\0\4\0\3\0\2\0\14\0\46\0\1\0\1\0\5\0\1\0"+
    "\2\0\70\0\7\0\1\0\17\0\1\0\27\0\11\0\7\0\1\0"+
    "\7\0\1\0\7\0\1\0\7\0\1\0\7\0\1\0\7\0\1\0"+
    "\7\0\1\0\7\0\1\0\40\0\57\0\1\0\u01d5\0\3\0\31\0"+
    "\11\0\6\0\1\0\5\0\2\0\5\0\4\0\126\0\2\0\2\0"+
    "\2\0\3\0\1\0\132\0\1\0\4\0\5\0\51\0\3\0\136\0"+
    "\21\0\33\0\65\0\20\0\u0200\0\u19b6\0\112\0\u51cd\0\63\0\u048d\0"+
    "\103\0\56\0\2\0\u010d\0\3\0\20\0\12\0\2\0\24\0\57\0"+
    "\1\0\4\0\12\0\1\0\31\0\7\0\1\0\120\0\2\0\45\0"+
    "\11\0\2\0\147\0\2\0\4\0\1\0\4\0\14\0\13\0\115\0"+
    "\12\0\1\0\3\0\1\0\4\0\1\0\27\0\5\0\20\0\1\0"+
    "\7\0\64\0\14\0\2\0\62\0\21\0\13\0\12\0\6\0\22\0"+
    "\6\0\3\0\1\0\4\0\12\0\34\0\10\0\2\0\27\0\15\0"+
    "\14\0\35\0\3\0\4\0\57\0\16\0\16\0\1\0\12\0\46\0"+
    "\51\0\16\0\11\0\3\0\1\0\10\0\2\0\2\0\12\0\6\0"+
    "\27\0\3\0\1\0\1\0\4\0\60\0\1\0\1\0\3\0\2\0"+
    "\2\0\5\0\2\0\1\0\1\0\1\0\30\0\3\0\2\0\13\0"+
    "\5\0\2\0\3\0\2\0\12\0\6\0\2\0\6\0\2\0\6\0"+
    "\11\0\7\0\1\0\7\0\221\0\43\0\10\0\1\0\2\0\2\0"+
    "\12\0\6\0\u2ba4\0\14\0\27\0\4\0\61\0\u2104\0\u016e\0\2\0"+
    "\152\0\46\0\7\0\14\0\5\0\5\0\1\0\1\0\12\0\1\0"+
    "\15\0\1\0\5\0\1\0\1\0\1\0\2\0\1\0\2\0\1\0"+
    "\154\0\41\0\u016b\0\22\0\100\0\2\0\66\0\50\0\15\0\3\0"+
    "\20\0\20\0\7\0\14\0\2\0\30\0\3\0\31\0\1\0\6\0"+
    "\5\0\1\0\207\0\2\0\1\0\4\0\1\0\13\0\12\0\7\0"+
    "\32\0\4\0\1\0\1\0\32\0\13\0\131\0\3\0\6\0\2\0"+
    "\6\0\2\0\6\0\2\0\3\0\3\0\2\0\3\0\2\0\22\0"+
    "\3\0\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    45,    90,   135,    90,    90,    90,   180,   225,   270, 
      315,   360,    90,    90,   405,   450,   495,    90,   315,    90, 
       90,   540,   585,   630,   675,   720,   765,   810,   855,   900, 
      945,   990,  1035,    90,  1080,  1125,  1170,   495,   315,  1215, 
     1260,  1305,  1350,  1395,  1440,  1485,   495,  1530,    90,    90, 
       90,  1575,  1620,  1665,  1710,  1125,  1755,  1800,  1845,  1890, 
     1935,   495,   495,  1980,   495,  2025,  2070,  2115,  2160,  2205, 
     1800,  2250,   315,  2295,  2340,   495,   495,  2385,  2430,  2475, 
      495,  2520,  2565,  2610,  2655,  2700,  2745,  2790,  2835,  2880, 
     2925,  2970,   495,  3015,   495,   495,  3060,  3105,   495
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\3\1\14\1\13\1\15\1\16\1\17\2\13"+
    "\1\20\4\13\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\21\1\32\1\33\1\21\1\34"+
    "\1\35\1\36\1\37\1\21\1\40\1\21\1\41\1\42"+
    "\55\3\57\0\1\5\52\0\2\10\1\0\52\10\7\0"+
    "\2\11\1\13\1\43\1\44\1\45\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\10\46\3\0\5\46\10\0\1\11"+
    "\1\12\1\47\1\43\1\44\1\45\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\10\46\3\0\5\46\10\0\3\13"+
    "\1\0\2\13\2\0\11\13\1\0\1\13\2\0\10\13"+
    "\3\0\5\13\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\1\46\1\50"+
    "\6\46\3\0\5\46\10\0\3\13\1\0\2\13\2\0"+
    "\1\13\1\51\7\13\1\0\1\13\2\0\10\13\3\0"+
    "\5\13\10\0\3\13\1\0\2\13\2\0\4\13\1\52"+
    "\4\13\1\0\1\13\2\0\10\13\3\0\5\13\10\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\10\46\3\0\5\46\10\0\2\46"+
    "\1\13\1\0\1\46\1\13\2\0\10\13\1\46\1\0"+
    "\1\13\2\0\1\46\1\53\6\46\3\0\5\46\10\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\5\46\1\54\2\46\3\0\5\46"+
    "\10\0\2\46\1\13\1\0\1\46\1\13\2\0\10\13"+
    "\1\46\1\0\1\13\2\0\1\55\7\46\3\0\5\46"+
    "\10\0\2\46\1\13\1\0\1\46\1\13\2\0\10\13"+
    "\1\46\1\0\1\13\2\0\1\46\1\56\6\46\3\0"+
    "\5\46\10\0\2\46\1\13\1\0\1\46\1\13\2\0"+
    "\10\13\1\46\1\0\1\13\2\0\6\46\1\57\1\46"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\60\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\10\46\3\0"+
    "\5\46\45\0\1\61\54\0\1\62\54\0\1\63\17\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\1\64\7\46\3\0\5\46\10\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\1\65\7\46\3\0\5\46\10\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\5\46\1\66\2\46\3\0\5\46"+
    "\10\0\2\67\53\0\2\70\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\10\46\3\0"+
    "\5\46\10\0\2\71\1\13\1\0\2\13\2\72\11\13"+
    "\1\0\1\13\2\0\10\13\3\0\5\13\10\0\2\46"+
    "\1\13\1\0\1\46\1\13\2\0\10\13\1\46\1\0"+
    "\1\13\2\0\7\46\1\73\3\0\5\46\10\0\3\13"+
    "\1\0\2\13\2\0\2\13\1\74\6\13\1\0\1\13"+
    "\2\0\10\13\3\0\5\13\10\0\3\13\1\0\2\13"+
    "\2\0\5\13\1\75\3\13\1\0\1\13\2\0\10\13"+
    "\3\0\5\13\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\2\46\1\76"+
    "\5\46\3\0\5\46\10\0\2\46\1\13\1\0\1\46"+
    "\1\13\2\0\10\13\1\46\1\0\1\13\2\0\7\46"+
    "\1\77\3\0\5\46\10\0\2\46\1\13\1\0\1\46"+
    "\1\13\2\0\10\13\1\46\1\0\1\13\2\0\1\46"+
    "\1\100\6\46\3\0\5\46\10\0\2\46\1\13\1\0"+
    "\1\46\1\13\2\0\10\13\1\46\1\0\1\13\2\0"+
    "\4\46\1\101\3\46\3\0\5\46\10\0\2\46\1\13"+
    "\1\0\1\46\1\13\2\0\10\13\1\46\1\0\1\13"+
    "\2\0\3\46\1\102\4\46\3\0\5\46\10\0\2\46"+
    "\1\13\1\0\1\46\1\13\2\0\10\13\1\46\1\0"+
    "\1\13\2\0\1\46\1\103\6\46\3\0\5\46\10\0"+
    "\2\46\1\13\1\0\1\104\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\10\46\3\0\5\46\10\0\2\46"+
    "\1\13\1\0\1\46\1\13\2\0\10\13\1\46\1\0"+
    "\1\13\2\0\5\46\1\105\2\46\3\0\5\46\10\0"+
    "\2\67\2\0\1\72\1\106\47\0\2\71\1\13\1\0"+
    "\2\13\2\0\11\13\1\0\1\13\2\0\10\13\3\0"+
    "\5\13\10\0\2\107\53\0\2\46\1\13\1\0\1\46"+
    "\1\13\2\0\10\13\1\46\1\0\1\13\2\0\5\46"+
    "\1\110\2\46\3\0\5\46\10\0\3\13\1\0\1\13"+
    "\1\111\2\0\11\13\1\0\1\13\2\0\10\13\3\0"+
    "\5\13\10\0\3\13\1\0\2\13\2\0\6\13\1\74"+
    "\2\13\1\0\1\13\2\0\10\13\3\0\5\13\10\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\10\46\3\0\1\112\1\46\1\113"+
    "\2\46\10\0\2\46\1\13\1\0\1\46\1\13\2\0"+
    "\10\13\1\46\1\0\1\13\2\0\10\46\3\0\3\46"+
    "\1\114\1\46\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\5\46\1\115"+
    "\2\46\3\0\5\46\10\0\2\46\1\13\1\0\1\46"+
    "\1\13\2\0\10\13\1\46\1\0\1\13\2\0\1\46"+
    "\1\116\6\46\3\0\5\46\10\0\2\46\1\13\1\0"+
    "\1\46\1\13\2\0\10\13\1\46\1\0\1\13\2\0"+
    "\10\46\3\0\3\46\1\117\1\46\10\0\2\107\4\0"+
    "\2\72\45\0\2\46\1\13\1\0\1\46\1\13\2\0"+
    "\10\13\1\46\1\0\1\13\2\0\1\46\1\120\6\46"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\1\121\7\46"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\1\122\7\46"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\7\46\1\123"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\124\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\10\46\3\0"+
    "\5\46\10\0\2\46\1\13\1\0\1\46\1\13\2\0"+
    "\10\13\1\46\1\0\1\13\2\0\10\46\3\0\1\46"+
    "\1\125\3\46\10\0\2\46\1\13\1\0\1\126\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\10\46\3\0"+
    "\5\46\10\0\2\46\1\13\1\0\1\46\1\13\2\0"+
    "\10\13\1\46\1\0\1\13\2\0\6\46\1\127\1\46"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\3\46\1\130"+
    "\4\46\3\0\5\46\10\0\2\46\1\13\1\0\1\131"+
    "\1\13\2\0\10\13\1\46\1\0\1\13\2\0\10\46"+
    "\3\0\5\46\10\0\2\46\1\13\1\0\1\46\1\13"+
    "\2\0\10\13\1\46\1\0\1\13\2\0\1\46\1\132"+
    "\6\46\3\0\5\46\10\0\2\46\1\13\1\0\1\46"+
    "\1\13\2\0\10\13\1\46\1\0\1\13\2\0\3\46"+
    "\1\133\4\46\3\0\5\46\10\0\2\46\1\13\1\0"+
    "\1\46\1\13\2\0\10\13\1\46\1\0\1\13\2\0"+
    "\1\46\1\134\6\46\3\0\5\46\10\0\2\46\1\13"+
    "\1\0\1\46\1\13\2\0\10\13\1\46\1\0\1\13"+
    "\2\0\10\46\3\0\1\135\4\46\10\0\2\46\1\13"+
    "\1\0\1\46\1\13\2\0\10\13\1\46\1\0\1\13"+
    "\2\0\7\46\1\136\3\0\5\46\10\0\2\46\1\13"+
    "\1\0\1\46\1\13\2\0\10\13\1\46\1\0\1\13"+
    "\2\0\10\46\3\0\1\137\4\46\10\0\2\46\1\13"+
    "\1\0\1\46\1\13\2\0\10\13\1\46\1\0\1\13"+
    "\2\0\5\46\1\140\2\46\3\0\5\46\10\0\2\46"+
    "\1\13\1\0\1\46\1\13\2\0\10\13\1\46\1\0"+
    "\1\13\2\0\6\46\1\141\1\46\3\0\5\46\10\0"+
    "\2\46\1\13\1\0\1\46\1\13\2\0\10\13\1\46"+
    "\1\0\1\13\2\0\3\46\1\142\4\46\3\0\5\46"+
    "\10\0\2\46\1\13\1\0\1\46\1\13\2\0\10\13"+
    "\1\46\1\0\1\13\2\0\10\46\3\0\1\143\4\46"+
    "\1\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  9,  9,  1,  1,  1,  1,  1,  9,  9,  1,  1, 
     1,  9,  1,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  9,  0,  0,  1,  0,  1,  0,  1,  1,  0,  0,  0,  0,  1,  0, 
     9,  9,  9,  1,  0,  0,  1,  1,  1,  0,  0,  1,  1,  1,  1,  0, 
     1,  0,  0,  0,  0,  0,  1,  0,  1,  0,  0,  1,  1,  0,  0,  0, 
     1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  1,  1, 
     0,  0,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[3150];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2244) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 98: 
          {  return symbolFactory.newSymbol("FINMIENTRAS", FINMIENTRAS);  }
        case 100: break;
        case 95: 
          {  return symbolFactory.newSymbol("BOOLEANTYPE", BOOLEANTYPE);  }
        case 101: break;
        case 49: 
          {  return symbolFactory.newSymbol("GREATERTHAN", GREATERTHAN);  }
        case 102: break;
        case 76: 
          {  return symbolFactory.newSymbol("SINO", SINO);  }
        case 103: break;
        case 13: 
          {  return symbolFactory.newSymbol("PLUS", PLUS);  }
        case 104: break;
        case 17: 
          {  return symbolFactory.newSymbol("SEMI", SEMI);  }
        case 105: break;
        case 50: 
          {  return symbolFactory.newSymbol("LOWERTHAN", LOWERTHAN);  }
        case 106: break;
        case 51: 
          {  return symbolFactory.newSymbol("SI", SI);  }
        case 107: break;
        case 46: 
          {  return symbolFactory.newSymbol("OR", OR);  }
        case 108: break;
        case 55: 
        case 56: 
        case 70: 
          {  return symbolFactory.newSymbol("SCIENCNUM", SCIENCNUM, Double.parseDouble(yytext()));  }
        case 109: break;
        case 54: 
          {  return symbolFactory.newSymbol("REALNUM", REALNUM, Double.parseDouble(yytext()));  }
        case 110: break;
        case 18: 
          {  return symbolFactory.newSymbol("UMINUS", UMINUS);  }
        case 111: break;
        case 19: 
          {  return symbolFactory.newSymbol("LPAREN", LPAREN);  }
        case 112: break;
        case 20: 
          {  return symbolFactory.newSymbol("RPAREN", RPAREN);  }
        case 113: break;
        case 10: 
        case 14: 
        case 15: 
        case 36: 
        case 40: 
        case 41: 
        case 59: 
        case 60: 
          {  return symbolFactory.newSymbol("VARIABLE", VARIABLE, yytext());  }
        case 114: break;
        case 8: 
        case 9: 
          {  return symbolFactory.newSymbol("NUMBERDEC", NUMBERDEC, Integer.parseInt(yytext()));  }
        case 115: break;
        case 72: 
          {  return symbolFactory.newSymbol("BOOLWORD", BOOLWORD, Boolean.parseBoolean(yytext()));  }
        case 116: break;
        case 3: 
        case 4: 
          {      }
        case 117: break;
        case 48: 
          {  return symbolFactory.newSymbol("EQUALTO", EQUALTO);  }
        case 118: break;
        case 80: 
          {  return symbolFactory.newSymbol("FINSI", FINSI);  }
        case 119: break;
        case 12: 
          {  return symbolFactory.newSymbol("MINUS", MINUS);  }
        case 120: break;
        case 6: 
          {  return symbolFactory.newSymbol("TIMES", TIMES);  }
        case 121: break;
        case 27: 
          {  return symbolFactory.newSymbol("ASIGN", ASIGN);  }
        case 122: break;
        case 33: 
          {  return symbolFactory.newSymbol("COMMA", COMMA);  }
        case 123: break;
        case 2: 
        case 11: 
        case 16: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        case 32: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");  }
        case 124: break;
        case 64: 
          {  return symbolFactory.newSymbol("AND", AND);  }
        case 125: break;
        case 62: 
          {  return symbolFactory.newSymbol("NOT", NOT);  }
        case 126: break;
        case 61: 
          {  return symbolFactory.newSymbol("INF", INF);  }
        case 127: break;
        case 5: 
          {  return symbolFactory.newSymbol("DIV", DIV);  }
        case 128: break;
        case 94: 
          {  return symbolFactory.newSymbol("MIENTRAS", MIENTRAS);  }
        case 129: break;
        case 92: 
          {  return symbolFactory.newSymbol("ENTONCES", ENTONCES);  }
        case 130: break;
        case 75: 
          {  return symbolFactory.newSymbol("REALTYPE", REALTYPE);  }
        case 131: break;
        case 7: 
          {  return symbolFactory.newSymbol("PERCCOMM", PERCCOMM);  }
        case 132: break;
        case 38: 
          {  return symbolFactory.newSymbol("NUMOCTAL", NUMOCTAL);  }
        case 133: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
