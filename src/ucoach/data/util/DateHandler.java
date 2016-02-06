package ucoach.data.util;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class DateHandler {

	/**
	 * Converts XMLGregorianCalendar to Date
	 * @param calendar
	 * @return
	 */
  public static Date toDate(XMLGregorianCalendar calendar){
      if(calendar == null) {
          return null;
      }
      return calendar.toGregorianCalendar().getTime();
  }
}
