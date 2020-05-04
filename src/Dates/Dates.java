package Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dates {

    /**
     * Verifica se uma data em texto está no formato indicado.
     * @param dateString Data no formato de texto
     * @param dateFormat Formato da data
     * @return Verdadeiro se a data em string estiver no formato indicado.
     */
    public static boolean isDateInThisFormat(String dateString, String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        try {
            format.setLenient(false);
            Date date = format.parse(dateString);
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
    public static String getMonthAbbr_PtBr(int mes){
        String defaultAbbr = "jan";
        try {
            List<String> listMonthAbbr_PtBr =  new ArrayList<>();
            listMonthAbbr_PtBr.add(defaultAbbr);//padrao
            listMonthAbbr_PtBr.add("jan");
            listMonthAbbr_PtBr.add("fev");
            listMonthAbbr_PtBr.add("mar");
            listMonthAbbr_PtBr.add("abr");
            listMonthAbbr_PtBr.add("mai");
            listMonthAbbr_PtBr.add("jun");
            listMonthAbbr_PtBr.add("jul");
            listMonthAbbr_PtBr.add("ago");
            listMonthAbbr_PtBr.add("set");
            listMonthAbbr_PtBr.add("out");
            listMonthAbbr_PtBr.add("nov");
            listMonthAbbr_PtBr.add("dez");
            
            return listMonthAbbr_PtBr.get(mes);
        } catch (Exception e) {
            return defaultAbbr;
        }
    }
    
    
}
