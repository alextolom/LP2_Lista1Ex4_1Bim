

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Categoria {
    int Idade;
    String categoria;

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getCategoria() {
        if (Idade<=4) {
            categoria = "Você não está em uma categoria adequada";   
        }else if(Idade<=7){
            categoria = "Você está na categoria: infantil A";
        }else if(Idade<=10){
            categoria = "Você está na categoria: infantil B";
        }else if(Idade<=13){
            categoria = "Você está na categoria: juvenil A";
        }else if(Idade<=17){
            categoria = "Você está na categoria: juvenil B";
        }else if(Idade>=18){
            categoria = "Você está na categoria: adulto";
        }
        return categoria;
    }
}
