package com.zzizily.repo.app;

import com.zzizily.repo.lib.GradleProperties;

public class App {
  public static void main(String[] args) {
    System.out.println(GradleProperties.getProperty("gpr.user"));
  }
}
