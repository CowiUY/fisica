package grafico;

public class IntermedioResultado {
    public static String FuerzaElectrica = "";
    public static String CampoElectrico = "";
    public static String PotencialElectrico = "";
    public static boolean CampoElectricoSigno;
    public static String ImagenVector = "/imagen/Vectores/";

    public static String getFuerzaElectrica() {
        return FuerzaElectrica;
    }

    public static void setFuerzaElectrica(String FuerzaElectrica) {
        IntermedioResultado.FuerzaElectrica = FuerzaElectrica;
    }

    public static String getCampoElectrico() {
        return CampoElectrico;
    }

    public static void setCampoElectrico(String CampoElectrico) {
        IntermedioResultado.CampoElectrico = CampoElectrico;
    }

    public static String getPotencialElectrico() {
        return PotencialElectrico;
    }

    public static void setPotencialElectrico(String PotencialElectrico) {
        IntermedioResultado.PotencialElectrico = PotencialElectrico;
    }

    public static boolean getCampoElectricoSigno() {
        return CampoElectricoSigno;
    }

    public static void setCampoElectricoSigno(boolean CampoElectricoSigno) {
        IntermedioResultado.CampoElectricoSigno = CampoElectricoSigno;
        if (CampoElectricoSigno){
            ImagenVector = ImagenVector + "1CargaPositiva";
        }else{
            ImagenVector = ImagenVector + "1CargaNegativa";
        }
    }
    
    
}
