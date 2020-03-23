package Auxiliar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Datas {

    /**
     * Verifica se uma data em texto está no formato indicado.
     * @param dataStr Data no formato de texto
     * @param formato Formato da data
     * @return Verdadeiro se a data em string estiver no formato indicado.
     */
    public static boolean éUmaDataValida(String dataStr, String formato) {
        String dataFinal = "";

        Date data = null;
        SimpleDateFormat format = new SimpleDateFormat(formato);
        try {
            format.setLenient(false);
            data = format.parse(dataStr);
            dataFinal = dataStr;
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    /**
     * Converte um número no mês abreviado.
     * @param mes Mês em número.
     * @return O mês abreviado minúsculo. Ex: mes = 1, return = 'jan'
     */
    public static String getMesAbreviado(int mes){
        String padrao = "jan";
        try {
            List<String> mesesAbreviados =  new ArrayList<>();
            mesesAbreviados.add(padrao);//padrao
            mesesAbreviados.add("jan");
            mesesAbreviados.add("fev");
            mesesAbreviados.add("mar");
            mesesAbreviados.add("abr");
            mesesAbreviados.add("mai");
            mesesAbreviados.add("jun");
            mesesAbreviados.add("jul");
            mesesAbreviados.add("ago");
            mesesAbreviados.add("set");
            mesesAbreviados.add("out");
            mesesAbreviados.add("nov");
            mesesAbreviados.add("dez");
            
            return mesesAbreviados.get(mes);
        } catch (Exception e) {
            return padrao;
        }
    }
}
