package com.example.testrxandretro.di.main2;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.ui.main2.dog.DogFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent.class
)
public abstract class Main2FragmentBuildersModule_ConstributeCatFragment {
  private Main2FragmentBuildersModule_ConstributeCatFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DogFragmentSubcomponent extends AndroidInjector<DogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DogFragment> {}
  }
}
