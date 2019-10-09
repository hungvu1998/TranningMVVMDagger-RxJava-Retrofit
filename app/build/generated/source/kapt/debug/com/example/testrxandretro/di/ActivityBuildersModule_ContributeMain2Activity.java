package com.example.testrxandretro.di;

import android.app.Activity;
import com.example.testrxandretro.di.main2.Main2FragmentBuildersModule;
import com.example.testrxandretro.di.main2.Main2Module;
import com.example.testrxandretro.di.main2.Main2ViewModelsModule;
import com.example.testrxandretro.ui.main2.Main2Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeMain2Activity {
  private ActivityBuildersModule_ContributeMain2Activity() {}

  @Binds
  @IntoMap
  @ActivityKey(Main2Activity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      Main2ActivitySubcomponent.Builder builder);

  @Subcomponent(
    modules = {Main2FragmentBuildersModule.class, Main2ViewModelsModule.class, Main2Module.class}
  )
  public interface Main2ActivitySubcomponent extends AndroidInjector<Main2Activity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Main2Activity> {}
  }
}
