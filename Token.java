public class Token{

  String lexe;
  int tokecode;

  Token(String lexe, int tokecode) {
    this.lexe = lexe;
    this.tokecode = tokecode;
  }

  public int getCode() {
	return this.tokecode;
  }
  
  public String getlexe() {
	  return this.lexe;
  }
public String toString(){
	return this.lexe;
	
	}
}