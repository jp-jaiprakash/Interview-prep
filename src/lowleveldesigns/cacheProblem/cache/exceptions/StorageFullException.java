package lowleveldesigns.cacheProblem.cache.exceptions;

public class StorageFullException extends RuntimeException {

   public StorageFullException() {

   }

   public StorageFullException(String message) {
      super(message);
   }
}
