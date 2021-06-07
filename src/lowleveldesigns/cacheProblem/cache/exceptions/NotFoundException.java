package lowleveldesigns.cacheProblem.cache.exceptions;

public class NotFoundException extends RuntimeException {

   public NotFoundException() {

   }

   public NotFoundException(String message) {
      super(message);
   }
}
