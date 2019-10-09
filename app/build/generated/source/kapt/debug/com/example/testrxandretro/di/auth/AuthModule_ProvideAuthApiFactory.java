// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.di.auth;

import com.example.testrxandretro.network.auth.AuthApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class AuthModule_ProvideAuthApiFactory implements Factory<AuthApi> {
  private final AuthModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AuthModule_ProvideAuthApiFactory(AuthModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AuthApi get() {
    return provideInstance(module, retrofitProvider);
  }

  public static AuthApi provideInstance(AuthModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvideAuthApi(module, retrofitProvider.get());
  }

  public static AuthModule_ProvideAuthApiFactory create(
      AuthModule module, Provider<Retrofit> retrofitProvider) {
    return new AuthModule_ProvideAuthApiFactory(module, retrofitProvider);
  }

  public static AuthApi proxyProvideAuthApi(AuthModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideAuthApi(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
