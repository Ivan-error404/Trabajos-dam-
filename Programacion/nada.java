public class nada{

static int fibonacci (int valor){
     //System.out.println("El valor  "+ valor +" es :" );// quitar esto si solo quiero fibonacci
    if ( valor== 0){
        return 0 ;
    }
    if (valor== 1){
        return 1 ;
    }
    return fibonacci(valor - 1)+ fibonacci(valor - 2);
}
public static void main(String[] args) {
    int valor=47;//esto es el valor canbiar para que ocurra el fibonacci
    int res = fibonacci(valor);
    System.out.println("El valor para el fibonacci "+ valor + " es " +res);

}
}