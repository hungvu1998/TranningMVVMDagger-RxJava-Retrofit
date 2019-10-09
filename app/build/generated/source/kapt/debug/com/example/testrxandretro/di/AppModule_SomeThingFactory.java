// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_SomeThingFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_SomeThingFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(AppModule module) {
    return proxySomeThing(module);
  }

  public static AppModule_SomeThingFactory create(AppModule module) {
    return new AppModule_SomeThingFactory(module);
  }

  public static String proxySomeThing(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.someThing(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
