package ua.hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WordCount {
  public static void main(String[] args) {
    String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec commodo nunc dui, vitae pretium dui tincidunt vel. Donec lacinia egestas sapien, eget rhoncus erat tincidunt at. Mauris volutpat blandit diam volutpat iaculis. Cras vehicula faucibus leo, eget rhoncus orci. Proin in ante pulvinar, malesuada odio non, molestie orci. Mauris rhoncus vitae ex nec blandit. Curabitur turpis nulla, tincidunt ac quam sit amet, pulvinar auctor dolor. Nam id leo augue. Suspendisse lobortis, nisi feugiat gravida placerat, sem odio fringilla turpis, quis interdum nulla ipsum id justo. Donec tincidunt ullamcorper risus in dignissim. Suspendisse potenti. Ut nisi mi, eleifend sit amet rhoncus nec, mollis quis metus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Ut at imperdiet odio. Integer magna arcu, sodales nec consequat ut, convallis tristique enim. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vitae consectetur ante. Vivamus sit amet euismod nisl. Pellentesque ut nisl a lacus dapibus vehicula sed mattis sapien. Etiam luctus volutpat nibh, et pharetra tellus porttitor sed. Suspendisse malesuada tempus rhoncus. Mauris non faucibus ipsum. Aenean sit amet tristique massa. Integer id posuere nibh. Curabitur non velit vestibulum, tristique metus vel, suscipit felis. Aenean erat ipsum, bibendum nec est at, commodo tempus tellus. Suspendisse eleifend convallis tempus. Aenean at pretium magna. Etiam ex tellus, malesuada nec tincidunt sed, tristique vel libero. Maecenas convallis vulputate magna eleifend commodo. Curabitur lacinia laoreet vehicula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Duis massa mauris, venenatis eget tortor ac, molestie congue orci. Curabitur sapien augue, ullamcorper quis posuere eget, fringilla eu velit. Proin ultricies elit vel lacus finibus, a consectetur lorem mattis. Proin lectus sem, aliquam ac nibh sed, dapibus sodales ipsum. Praesent consequat placerat urna non blandit. Nam vitae est non justo rhoncus fermentum. Mauris sagittis ipsum vel consectetur elementum. Cras eu erat nunc. Integer consequat ante odio, eu porttitor mi sodales et. Integer enim augue, volutpat id lorem ac, efficitur convallis lacus. Duis vitae ante lacus. Praesent pharetra ante at odio commodo interdum. Proin dolor magna, vehicula vitae neque ut, mollis fringilla ipsum. Donec malesuada magna sed porttitor iaculis. Maecenas scelerisque nunc at dui tristique, in vehicula mi posuere. Pellentesque finibus cursus justo, nec mollis magna porta vitae. Aliquam tempus justo et ex gravida venenatis. Nam commodo pharetra enim ut semper. Proin bibendum augue at urna scelerisque, in egestas erat auctor. Sed non accumsan ipsum. Donec tempus facilisis purus non elementum. Ut pharetra tempus efficitur. Nullam in volutpat velit, id aliquet nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Duis elementum magna sollicitudin lacus semper, vel mattis elit faucibus. Nunc dolor nulla, bibendum ut consectetur nec, ultricies ut felis. Mauris porta lobortis libero ac viverra. Praesent vitae eros quam. Morbi ut elementum urna. Morbi pulvinar justo a tristique porttitor. Cras nec massa ante. Sed pretium urna ac diam fermentum, posuere cursus nunc hendrerit. Aliquam nec quam quis nisl elementum imperdiet sed efficitur orci. Ut sit amet auctor leo.";

    String[] words = input.split(" ");

    Map<String, Integer> wordCountMap = new HashMap<>();
    for (String word : words) {
      word = word.replace(".", "").replace(",", "").toLowerCase();
      if (wordCountMap.containsKey(word)) {
        wordCountMap.put(word, wordCountMap.get(word)+1);
      } else {
        wordCountMap.put(word, 1);
      }
    }

    System.out.println(wordCountMap);
  }
}
