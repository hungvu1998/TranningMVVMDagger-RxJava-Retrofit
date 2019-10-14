package com.example.testrxandretro.di.main2;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.ui.main2.detaildog.DetailDogFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      Main2FragmentBuildersModule_ConstributeDetailDogFragment.DetailDogFragmentSubcomponent.class
)
public abstract class Main2FragmentBuildersModule_ConstributeDetailDogFragment {
  private Main2FragmentBuildersModule_ConstributeDetailDogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DetailDogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DetailDogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DetailDogFragmentSubcomponent extends AndroidInjector<DetailDogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailDogFragment> {}
  }
}
