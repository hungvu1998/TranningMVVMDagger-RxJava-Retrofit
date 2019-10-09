// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.di;

import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideRequestOptionFactory implements Factory<RequestOptions> {
  private final AppModule module;

  public AppModule_ProvideRequestOptionFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public RequestOptions get() {
    return provideInstance(module);
  }

  public static RequestOptions provideInstance(AppModule module) {
    return proxyProvideRequestOption(module);
  }

  public static AppModule_ProvideRequestOptionFactory create(AppModule module) {
    return new AppModule_ProvideRequestOptionFactory(module);
  }

  public static RequestOptions proxyProvideRequestOption(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideRequestOption(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}