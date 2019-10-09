package com.example.testrxandretro.di.main;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.ui.main.profile.ProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentBuildersModule_ConstributeProfileFragment.ProfileFragmentSubcomponent.class
)
public abstract class MainFragmentBuildersModule_ConstributeProfileFragment {
  private MainFragmentBuildersModule_ConstributeProfileFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFragment> {}
  }
}
