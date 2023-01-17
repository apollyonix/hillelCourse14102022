package ua.hillel.lesson8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductPage {
  private static final Logger LOGGER = Logger.getLogger(ProductPage.class.getName());
  public void createProduct(Status status) {
    LOGGER.log(Level.INFO, "create product with status " + status.getStatus());

    /*
    LOGGER.info(message);
    LOGGER.warn(message);
    LOGGER.error(message);
     */
  }
}
