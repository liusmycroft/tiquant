package com.lius.tiquant.service.market;

import com.lius.tiquant.service.container.model.Container;

public interface MarketService {

  void addSubscription(Container container);

  void startSubscription(Container container);
  void stopSubscription();
  void removeSubscription();
  void listSubscription();
  void getSubscription();
}
