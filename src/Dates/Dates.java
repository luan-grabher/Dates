package Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Dates {

    public static final Locale BRAZIL = new Locale("pt", "BR");

    /**
     * Verifica se uma data em texto está no formato indicado.
     *
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
     * Converte um número no mês abreviado em minúsculo.
     * Caso o mes nao exista, retorna janeiro
     *
     * @param mes Mês em número.
     * @return O mês abreviado minúsculo. Ex: mes = 1, return = 'jan'
     */
    public static String getMonthAbbr_PtBr(int mes) {
        List<String> months = getBrazilianMonths();
        
        try {
            return months.get(mes).substring(0, 3).toLowerCase();
        } catch (Exception e) {
            return months.get(0).substring(0, 3).toLowerCase();
        }
    }

    /**
     * Retorna lista dos meses em português, janeiro é 0. A LISTA COMEÇA EM 0
     *
     * @return lista dos meses em português, janeiro é 0
     */
    public static List<String> getBrazilianMonths() {
        List<String> months = new ArrayList<>();
        months.add("JANEIRO");
        months.add("FEVEREIRO");
        months.add("MARÇO");
        months.add("ABRIL");
        months.add("MAIO");
        months.add("JUNHO");
        months.add("JULHO");
        months.add("AGOSTO");
        months.add("SETEMBRO");
        months.add("OUTUBRO");
        months.add("NOVEMBRO");
        months.add("DEZEMBRO");

        return months;
    }

    /**
     * Converte a data em texto para calendario utilizando o formato passado
     *
     * @param dateString String com a data
     * @param dateFormat Formato para converter, use dd/MM/yyyy para Brasileiro
     * @return Calendario da data informada
     */
    public static Calendar getCalendarFromFormat(String dateString, String dateFormat) {
        try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, BRAZIL);
            cal.setTime(sdf.parse(dateString));

            return cal;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Converte Calendar para o formato de string informado
     *
     * @param cal Calendário a ser convertido
     * @param dateFormat Formato para converter, use dd/MM/yyyy para Brasileiro
     * @return A String do calendário no formato informado ou NULL se ocorrer
     * erro
     */
    public static String getCalendarInThisStringFormat(Calendar cal, String dateFormat) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, BRAZIL);
            return sdf.format(cal.getTime());
        } catch (Exception e) {
            return null;
        }
    }
}
