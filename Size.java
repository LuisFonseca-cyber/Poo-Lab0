public enum Size {

 SMALL(32, 36, "Pequeno",'S'),
 MEDIUM(37, 44, "Médio",'M'),
 LARGE(45, 52, "Grande",'L');
 
 private final String description; //representa a descriçãp
 private final int minValue; //representa o valor minimo
 private final int maxValue; //representa o valor maximo
 private final char code; //representa o codigo

 private Size(int minValue, int maxValue, String description, char code){
     this.description=description;
     this.minValue=minValue;
     this.maxValue=maxValue;
     this.code=code;
 }
 //Este metedo devolve a descrição
 @Override
 public String toString() {
     return this.description;
 }
 //Este metedo devolve a descrição
 public String getDescription() {
     return description;
 }
 //Este metedo devolve o valor minimo
 public int getMinValue() {
     return minValue;
 }
 //Este metedo devolve o valor maximo
 public int getMaxValue() {
     return maxValue;
 }
 //Este metedo devolve o codigo
 public char getCode() {
     return code;
 }

}
