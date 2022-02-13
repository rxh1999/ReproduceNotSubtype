package org.reproduce;

public class L1LocalCacheObserver {

  public static void m(){
    RemoteController instance = EngineRemoteController.instance;
  }

  public static void main(String[] args) {
    System.out.println("test");
  }
}
