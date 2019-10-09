package com.example.testrxandretro.di;

import android.app.Activity;
import com.example.testrxandretro.di.login.LoginModule;
import com.example.testrxandretro.di.login.LoginViewModelsModule;
import com.example.testrxandretro.ui.login.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeLoginActivity {
  private ActivityBuildersModule_ContributeLoginActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {LoginViewModelsModule.class, LoginModule.class})
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
