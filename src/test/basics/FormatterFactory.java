package test.basics;

// Class that provides a formatter based on a type
// implements singleton pattern to ensure there is only a single instance
class FormatterFactory {
 
  public static FormatterFactory INSTANCE;
   
  public static FormatterFactory getInstance() { // we can use double lock
    if (INSTANCE == null) {
      INSTANCE = new FormatterFactory();
    }
    return INSTANCE;
  }
   
  public static AbstractFormatter getFormatter(int type) {
    if (type == FormatterType.DATE) {
      return new DateFormatter();
    } else {
      return null;
    }
  }
}