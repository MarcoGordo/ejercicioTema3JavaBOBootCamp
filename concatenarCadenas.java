public class concatenarCadenas {

    public static void main(String[] args) {

        String nombres[] = { "Marco","Antonio","Pulido","Solis"};
        String nombreCompleto = " ";
        for(int i=0; i<nombres.length; i++){
            nombreCompleto += nombres[i] + " ";
        }
        System.out.println(nombreCompleto);
    }
}
