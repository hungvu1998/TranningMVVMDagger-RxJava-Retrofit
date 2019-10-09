// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.ui.base;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.viewmodels.SessionManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<BaseActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new BaseActivity_MembersInjector(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, sessionManagerProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  public static void injectSessionManager(BaseActivity instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}