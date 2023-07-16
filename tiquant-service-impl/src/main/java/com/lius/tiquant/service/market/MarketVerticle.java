package com.lius.tiquant.service.market;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Promise;

public class MarketVerticle extends AbstractVerticle {
  public static void main(String[] args) {
    Promise<Integer> promise = Promise.promise();
    Future<Integer> future = promise.future();
    future.onComplete(x -> {
      System.out.println(x);
    });
    promise.complete(1);
  }
}
