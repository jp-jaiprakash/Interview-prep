package test;


public class Salary {

   private String code;
   private String periodTypeCode;
   private double amount;

   public Salary(String code, String periodTypeCode, double amount) {
      this.code = code;
      this.periodTypeCode = periodTypeCode;
      this.amount = amount;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getPeriodTypeCode() {
      return periodTypeCode;
   }

   public void setPeriodTypeCode(String periodTypeCode) {
      this.periodTypeCode = periodTypeCode;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }
}
