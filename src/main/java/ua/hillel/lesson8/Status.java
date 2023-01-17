package ua.hillel.lesson8;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public enum Status {
  NEW(1),
  IN_REVIEW(2),
  ACTIVE(3),
  OUT_OF_SALE(4);

  private int status;

  Status(int status) {
    this.status = status;
  }

  public int getStatus() {
    return status;
  }
}
