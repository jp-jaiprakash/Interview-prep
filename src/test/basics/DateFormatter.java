package test.basics;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

// formatter for dates
class DateFormatter extends AbstractFormatter {

  @Override
  public String format(Object object) {
    Data = (Date) object;
    return Data.toString();
  }

  @SuppressWarnings("unchecked")
  @Override
  public Date parse(String text) {
    // TODO Auto-generated method stub
    try {
      Data = getDateFormat().parse(text);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return (Date) null; // not needed--------
    }
    return (Date) Data;
  }

    @Override
    public boolean isValid (String text){
      // TODO Auto-generated method stub
      // ------- This can reuse above method ---------
      try {
        Data = getDateFormat().parse(text);
      } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
      }
      return true;
    }

    // this can be avoided ---------
    // returns the date format for this formatter
    public DateFormat getDateFormat () {
      return sdf;
    }

  }
