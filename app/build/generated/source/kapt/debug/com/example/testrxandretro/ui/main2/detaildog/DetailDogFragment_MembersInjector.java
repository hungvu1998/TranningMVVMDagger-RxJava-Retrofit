// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.ui.main2.detaildog;

import androidx.fragment.app.Fragment;
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class DetailDogFragment_MembersInjector implements MembersInjector<DetailDogFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvidersFactory> providerFactoryProvider;

  public DetailDogFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvidersFactory> providerFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.providerFactoryProvider = providerFactoryProvider;
  }

  public static MembersInjector<DetailDogFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvidersFactory> providerFactoryProvider) {
    return new DetailDogFragment_MembersInjector(
        childFragmentInjectorProvider, providerFactoryProvider);
  }

  @Override
  public void injectMembers(DetailDogFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectProviderFactory(instance, providerFactoryProvider.get());
  }

  public static void injectProviderFactory(
      DetailDogFragment instance, ViewModelProvidersFactory providerFactory) {
    instance.providerFactory = providerFactory;
  }
}