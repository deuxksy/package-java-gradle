package com.zzizily.pkg.app;

import com.zzizily.pkg.lib.GradleProperties;

public class App {
  public static void main(String[] args) {
    System.out.println(GradleProperties.getProperty("gpr.user"));
  }
}
