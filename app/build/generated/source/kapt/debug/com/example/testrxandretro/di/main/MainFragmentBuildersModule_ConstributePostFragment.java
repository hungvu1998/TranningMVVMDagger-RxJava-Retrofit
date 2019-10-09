package com.example.testrxandretro.di.main;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.ui.main.post.PostFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent.class
)
public abstract class MainFragmentBuildersModule_ConstributePostFragment {
  private MainFragmentBuildersModule_ConstributePostFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(PostFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      PostFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface PostFragmentSubcomponent extends AndroidInjector<PostFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PostFragment> {}
  }
}
