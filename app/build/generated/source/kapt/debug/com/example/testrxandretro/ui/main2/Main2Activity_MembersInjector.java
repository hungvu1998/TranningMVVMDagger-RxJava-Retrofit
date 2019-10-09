// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.ui.main2;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.ui.base.BaseActivity_MembersInjector;
import com.example.testrxandretro.viewmodels.SessionManager;
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class Main2Activity_MembersInjector implements MembersInjector<Main2Activity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<ViewModelProvidersFactory> providerFactoryProvider;

  public Main2Activity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<ViewModelProvidersFactory> providerFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.providerFactoryProvider = providerFactoryProvider;
  }

  public static MembersInjector<Main2Activity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<ViewModelProvidersFactory> providerFactoryProvider) {
    return new Main2Activity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        sessionManagerProvider,
        providerFactoryProvider);
  }

  @Override
  public void injectMembers(Main2Activity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    BaseActivity_MembersInjector.injectSessionManager(instance, sessionManagerProvider.get());
    injectProviderFactory(instance, providerFactoryProvider.get());
  }

  public static void injectProviderFactory(
      Main2Activity instance, ViewModelProvidersFactory providerFactory) {
    instance.providerFactory = providerFactory;
  }
}
