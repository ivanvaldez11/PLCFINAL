import java.util.*;
import java.io.*;

public class Lexer {
 
  private String enter;
  private Token[] token;
  
  public Lexer(String enter) {
   this.enter = enter;
   this.token = new Token[enter.length()];
  }
  

  public void tokenize(){
   int tokenIdx = 0;
   for(int i=0; i<enter.length(); i++) {
    char characters = enter.charAt(i);
    switch(characters) {
    case '+': 
     token[tokenIdx++] = new Toke("ADD", "+");
     break;
    case '-': 
     token[tokenIdx++] = new Toke("SUB", "-");
     break;
    case '*': 
     token[tokenIdx++] = new Toke("MUL", "*");
     break;
    case '/':
     token[tokenIdx++] = new Toke("DIV", "/");
     break;
    case '^': 
     token[tokenIdx++] = new Toke("OPER", "^");
     break;
    case '>': 
     token[tokenIdx++] = new Toke("GTN", ">");
     break;
    case '<': 
     token[tokenIdx++] = new Toke("LTN", "<");
     break;
    case '>=': 
     token[tokenIdx++] = new Toke("GTE", ">=");
     break;
    case '<=': 
     token[tokenIdx++] = new Toke("LTE", "<=");
     break;
    case '==': 
     token[tokenIdx++] = new Toke("ETO", "==");
     break;
    case '/=': 
     token[tokenIdx++] = new Toke("NTO", "/=");
     break;
    case '!': 
     token[tokenIdx++] = new Toke("LNT", "!");
     break;
    case '!!': 
     token[tokenIdx++] = new Toke("LND", "!!");
     break;
    case '!!!': 
     token[tokenIdx++] = new Toke("LOR", "!!!");
     break;  
    case 'R': 
     token[tokenIdx++] = new Toke("Real", Character.toString(characters));
     break;
    case '0': 
     token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '1': 
    token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '2': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '3': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '4': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '5': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '6': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '7': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '8': 
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break;
    case '9':
        token[tokenIdx++] = new Toke("Natural", Character.toString(characters));
     break; 
    case 'true': 
     token[tokenIdx++] = new Toke("Boolean", Character.toString(characters));
     break;
    case 'false': 
     token[tokenIdx++] = new Toke("Boolean", Character.toString(characters));
     break;
    case 'C': 
     token[tokenIdx++] = new Toke("Character", Character.toString(characters));
     break;
    case '"': 
     token[tokenIdx++] = new Toke("String", Character.toString(characters));
     break;  
    case 'for': 
     token[tokenIdx++] = new Toke("Keyword", "for");
     break; 
    case 'while': 
     token[tokenIdx++] = new Toke("Keyword", "while");
     break;
    case 'String': 
      token[tokenIdx++] = new Toke("Keyword", Character.toString(characters));
     break;  
    case 'int': 
      token[tokenIdx++] = new Toke("Keyword", Character.toString(characters));
     break;  
    case 'character': 
    token[tokenIdx++] = new Toke("Keyword", Character.toString(characters));
     break;
    case 'float': 
    token[tokenIdx++] = new Toke("Keyword", Character.toString(characters));
     break;
    case 'boolean':
     token[tokenIdx++] = new Toke("Keyword", Character.toString(characters));
     break;
    }
   }
  }