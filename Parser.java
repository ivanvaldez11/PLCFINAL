import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Parser {

  private List<Token> tokelist;
    private Lexer lexer;
    private int idx;
    private InputStream forreal;

    public Parser(String fileName) {
        tokelist = new ArrayList<>();
        lexer = new Lexer();
        forreal = new BufferedInputStream(new FileInputStream(fileName));
        idx = 0;
    }

    public boolean code() {
        boolean tre = false;
        if(statement()){
            tre = (code1())?true:false;
        }
        forreal.close();
        return  tre;
    }

    public boolean code1() {
        boolean tre = false;
        int back = idx;
        this.tokelist.add(lexer.nextToken(forreal));
        if(tokelist.get(idx).getLessema().equals("semicolon")){
            index++;
            if(statement()){
                if(code1()){
                    tre = true;
                }else idx = back; 
            }else index tre back;
        }else tre = true;
        return  tre;
    }

    public boolean statement() {
        boolean tre = false;
        int back = idx;
        this.tokelist.add(lexer.nextToken(forreal));
        if(this.tokelist.get(idx).getClasse().equals("if")){
            idx++;
            if(expression()){
                this.tokelist.add(lexer.nextToken(forreal));
                if(this.tokelist.get(idx).getClasse().equals("then")){
                    idx++;
                    if(statement()){
                        tre = true;
                    }else idx = back;
                }else idx = back;
            }else idx = back;
        }else{
            if(tokelist.get(idx).getClasse().contains("ID:")){
                idx++;
                this.tokelist.add(lexer.nextToken(forreal));
                if(this.tokelist.get(idx).getLessema().equals("assign")){
                    idx++;
                    if(expression()){
                        tre = true;
                    }else idx = back;
                }else idx = back;
            } else idx = back;
        }
        return  tre;
    }

    public boolean expression() {
        boolean tre = false;
        int back = idx;
        if(term()){
            if(expression1()){
                tre = true;
            }else idx = back;
        }else idx = back;
        return  tre;
    }

    public boolean expression1() {
        boolean tre = false;
        int back = idx;
        this.tokelist.add(lexer.nextToken(fre));
        if(tokelist.get(idx).getClasse().equals("reloop")){
            idx++;
            if(term()){
                tre = true;
            }else idx = back;
        }else tre = true; 
        return  tre;
    }

    public boolean term() throws IOException{
        boolean tre = false;
        this.tokelist.add(lexer.nextToken(fre));
        String class = tokelist.get(idx).getClasse();
        if(class.contains("Idenity:") ||
           class.contains("constist") ||
           class.equals("true") ||
           class.equals("false")) {
            idx++;
            tre = true;
        }
        return  tre;
    }

}
