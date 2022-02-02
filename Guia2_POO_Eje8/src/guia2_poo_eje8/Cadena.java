/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia2_poo_eje8;

public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena(){
        
    }
    
    public Cadena(String frase,int longitud){
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void mostrarVocales(){
        int contarVocales = 0;
        for (int i = 0; i < longitud; i++) {
            switch(frase.substring(i,i + 1)){
                case "a":
                    contarVocales++;
                    break;
                case "e":
                    contarVocales++;
                    break;
                case "i":
                    contarVocales++;
                    break;
                case "o":
                    contarVocales++;
                    break;
                case "u":
                    contarVocales++;
                    break;
            }
        }
        System.out.println("Las vocales aparecen en la frase: "+ contarVocales + " veces");
    }
    
    public void invertirFrase(){
        String invertida;
        invertida = "";
        for (int i = longitud - 1; i >= 0; i--) {
            invertida = invertida.concat(frase.substring(i, i + 1));  
        }
        System.out.println("frase original: "+ frase);
        System.out.println("frase invertida: "+ invertida);
    }
    
    public void vecesRepetido(String letra){
        int contarLetra = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                contarLetra++;
            }
        }
        System.out.println("La letra \"" + letra + "\" se repite: "+ contarLetra + " veces");
    }
    
    public void compararLongitud(String frase){
        if (longitud == frase.length()) {
            System.out.printf("\n La frase (%s) es igual de larga que la frase (%s)  \n",this.frase,frase);
        }else if(longitud > frase.length()){
            System.out.printf("\n La frase (%s) es más larga que la frase (%s)  \n",this.frase,frase);
        }else{
            System.out.printf("\n La frase (%s) es más corta que la frase (%s)  \n",this.frase,frase);
        }  
    }
    
    public void unirFrases(String frase){
        String frasesUnidas;
        frasesUnidas = this.frase.concat(frase);
        System.out.println("Frases unidas: "+ frasesUnidas);
    }
    
    public void reemplazar(String letra){
        String reemplazo;
        reemplazo = this.frase.replace("a", letra);
        System.out.println("La frase con la letra reemplazada queda: "+ reemplazo);
    }
    
    public boolean contiene(String letra){
        return this.frase.contains(letra);
    }
}
