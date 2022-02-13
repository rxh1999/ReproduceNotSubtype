package org.reproduce;

import java.util.ServiceLoader;
import org.reproduce.manager.Manager;

public class Foundation {

  private volatile static Manager manager;

  static {
    manager = ServiceLoader.load(Manager.class).iterator().next();
  }

  public static void m1(){};
}
