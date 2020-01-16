//Alberto López Martín 1ºDAW

public class Piramide{
  private int altura ;
  private String caracter ;
  
  Piramide(int h,String c){
    this.altura = h;
    this.caracter = c;
  }
  
  public void Aumentar(){
    if (this.altura==12){
      altura = this.altura;
    } else {
      altura = this.altura + 1;
    } 
  }
  
  public void Disminuir(){
    if (this.altura==1){
      altura = this.altura;
    } else {
      altura = this.altura - 1;
    } 
  }
  
  public void CambiarDibujo(String c){
    this.caracter = c;
  }
  
  public String toString() {
    
    String resultado = "";
    
    for (int i = 0; i < this.altura; ++i){
      for (int rell = 0; rell < this.altura-i-1; ++rell){
        resultado = resultado + " ";
      }
      for (int on = 0; on < 2*i+1; ++on){
        resultado = resultado+ this.caracter;
      }
      resultado = resultado+"\n";
    }
    
    return resultado;
  }
}
  
