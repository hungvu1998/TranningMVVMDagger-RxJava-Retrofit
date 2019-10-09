package com.example.testrxandretro.di;

import android.app.Activity;
import com.example.testrxandretro.ui.popup.PopUpFullImage;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent.class
)
public abstract class ActivityBuildersModule_ContributePopUpFullImage {
  private ActivityBuildersModule_ContributePopUpFullImage() {}

  @Binds
  @IntoMap
  @ActivityKey(PopUpFullImage.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      PopUpFullImageSubcomponent.Builder builder);

  @Subcomponent
  public interface PopUpFullImageSubcomponent extends AndroidInjector<PopUpFullImage> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PopUpFullImage> {}
  }
}
