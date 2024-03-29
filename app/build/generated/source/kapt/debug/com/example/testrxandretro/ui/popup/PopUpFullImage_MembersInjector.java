// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.ui.popup;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.ui.base.BaseActivity_MembersInjector;
import com.example.testrxandretro.viewmodels.SessionManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class PopUpFullImage_MembersInjector implements MembersInjector<PopUpFullImage> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public PopUpFullImage_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<PopUpFullImage> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new PopUpFullImage_MembersInjector(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, sessionManagerProvider);
  }

  @Override
  public void injectMembers(PopUpFullImage instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    BaseActivity_MembersInjector.injectSessionManager(instance, sessionManagerProvider.get());
  }
}
