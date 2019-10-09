// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.di;

import android.app.Application;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideGlideInstanseFactory implements Factory<RequestManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<RequestOptions> requestOptionsProvider;

  public AppModule_ProvideGlideInstanseFactory(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.requestOptionsProvider = requestOptionsProvider;
  }

  @Override
  public RequestManager get() {
    return provideInstance(module, applicationProvider, requestOptionsProvider);
  }

  public static RequestManager provideInstance(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    return proxyProvideGlideInstanse(
        module, applicationProvider.get(), requestOptionsProvider.get());
  }

  public static AppModule_ProvideGlideInstanseFactory create(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    return new AppModule_ProvideGlideInstanseFactory(
        module, applicationProvider, requestOptionsProvider);
  }

  public static RequestManager proxyProvideGlideInstanse(
      AppModule instance, Application application, RequestOptions requestOptions) {
    return Preconditions.checkNotNull(
        instance.provideGlideInstanse(application, requestOptions),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
