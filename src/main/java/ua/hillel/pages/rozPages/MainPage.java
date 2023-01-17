package ua.hillel.pages.rozPages;

import ua.hillel.pages.rozPages.components.HeaderComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage {
  public HeaderComponent header;

  public MainPage() {
    this.header = new HeaderComponent();
  }

  public List<String> getLastViewedProducts() {
    return new ArrayList<>();
  }
}
