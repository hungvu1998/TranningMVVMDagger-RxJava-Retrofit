package com.example.testrxandretro.di;

import android.app.Activity;
import com.example.testrxandretro.di.auth.AuthModule;
import com.example.testrxandretro.di.auth.AuthViewModelsModule;
import com.example.testrxandretro.ui.auth.AuthActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeAuthActivity {
  private ActivityBuildersModule_ContributeAuthActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AuthActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AuthActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {AuthViewModelsModule.class, AuthModule.class})
  public interface AuthActivitySubcomponent extends AndroidInjector<AuthActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AuthActivity> {}
  }
}
