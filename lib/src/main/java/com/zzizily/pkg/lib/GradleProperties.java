package com.zzizily.pkg.lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GradleProperties {

  private static Properties properties = new Properties();

  static {
    try {
      properties.load(new FileInputStream("./gradle.properties"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static String getProperty(String key) {
    return properties.getProperty(key);
  }

  public static void main(String[] args) {
    System.out.println(GradleProperties.getProperty("gpr.user"));
  }
}
