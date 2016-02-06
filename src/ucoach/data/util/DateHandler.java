package ucoach.data.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateHandler {

	static DateFormat format = new SimpleDateFormat("Y-M-d");

	/**
	 * Converts XMLGregorianCalendar to Date string
	 * @param calendar
	 * @return
	 */
  public static String toString(XMLGregorianCalendar calendar){
      if(calendar == null)
          return null;

      return format.format(calendar.toGregorianCalendar().getTime());
  }

  /**
   * Converts date string to XMLGregorianCalendar
   * @param strDate
   * @return
   * @throws ParseException
   */
  public static XMLGregorianCalendar toCalendar(String strDate) throws ParseException {

  	Date date = format.parse(strDate);

  	GregorianCalendar gCalendar = new GregorianCalendar();
    gCalendar.setTime(date);
    XMLGregorianCalendar xmlCalendar = null;
    try {
        xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
    } catch (Exception ex) {
        return null;
    }
    return xmlCalendar;
  }
}
