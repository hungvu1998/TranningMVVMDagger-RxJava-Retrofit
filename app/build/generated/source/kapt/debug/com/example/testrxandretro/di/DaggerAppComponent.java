// Generated by Dagger (https://google.github.io/dagger).
package com.example.testrxandretro.di;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.testrxandretro.BaseApplication;
import com.example.testrxandretro.di.auth.AuthModule;
import com.example.testrxandretro.di.auth.AuthModule_ProvideAuthApiFactory;
import com.example.testrxandretro.di.main.MainFragmentBuildersModule_ConstributePostFragment;
import com.example.testrxandretro.di.main.MainFragmentBuildersModule_ConstributeProfileFragment;
import com.example.testrxandretro.di.main.MainModule;
import com.example.testrxandretro.di.main.MainModule_ProvideAdapter$app_debugFactory;
import com.example.testrxandretro.di.main.MainModule_ProvideMainApiFactory;
import com.example.testrxandretro.di.main2.Main2FragmentBuildersModule_ConstributeCatFragment;
import com.example.testrxandretro.di.main2.Main2Module;
import com.example.testrxandretro.di.main2.Main2Module_ProvideMain2ApiFactory;
import com.example.testrxandretro.ui.auth.AuthActivity;
import com.example.testrxandretro.ui.auth.AuthActivity_MembersInjector;
import com.example.testrxandretro.ui.auth.AuthViewModel;
import com.example.testrxandretro.ui.auth.AuthViewModel_Factory;
import com.example.testrxandretro.ui.base.BaseActivity_MembersInjector;
import com.example.testrxandretro.ui.login.LoginActivity;
import com.example.testrxandretro.ui.login.LoginActivity_MembersInjector;
import com.example.testrxandretro.ui.login.LoginViewModel;
import com.example.testrxandretro.ui.login.LoginViewModel_Factory;
import com.example.testrxandretro.ui.main.MainActivity;
import com.example.testrxandretro.ui.main.post.PostFragment;
import com.example.testrxandretro.ui.main.post.PostFragment_MembersInjector;
import com.example.testrxandretro.ui.main.post.PostViewModel;
import com.example.testrxandretro.ui.main.post.PostViewModel_Factory;
import com.example.testrxandretro.ui.main.profile.ProfileFragment;
import com.example.testrxandretro.ui.main.profile.ProfileFragment_MembersInjector;
import com.example.testrxandretro.ui.main.profile.ProfileViewModel;
import com.example.testrxandretro.ui.main.profile.ProfileViewModel_Factory;
import com.example.testrxandretro.ui.main2.Main2Activity;
import com.example.testrxandretro.ui.main2.Main2Activity_MembersInjector;
import com.example.testrxandretro.ui.main2.Main2ViewModel;
import com.example.testrxandretro.ui.main2.Main2ViewModel_Factory;
import com.example.testrxandretro.ui.main2.dog.DogFragment;
import com.example.testrxandretro.ui.main2.dog.DogFragment_MembersInjector;
import com.example.testrxandretro.ui.main2.dog.DogViewModel;
import com.example.testrxandretro.ui.main2.dog.DogViewModel_Factory;
import com.example.testrxandretro.ui.popup.PopUpFullImage;
import com.example.testrxandretro.viewmodels.SessionManager;
import com.example.testrxandretro.viewmodels.SessionManager_Factory;
import com.example.testrxandretro.viewmodels.ViewModelProvidersFactory;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Builder>
      authActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent.Builder>
      main2ActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent.Builder>
      popUpFullImageSubcomponentBuilderProvider;

  private Provider<String> someThingProvider;

  private Provider<Application> applicationProvider;

  private Provider<Drawable> provideAppDrawableProvider;

  private Provider<RequestOptions> provideRequestOptionProvider;

  private Provider<RequestManager> provideGlideInstanseProvider;

  private Provider<Retrofit> provideRetrofitInstance$app_debugProvider;

  private Provider<SessionManager> sessionManagerProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return ImmutableMap
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>of(
            AuthActivity.class,
            (Provider) authActivitySubcomponentBuilderProvider,
            MainActivity.class,
            (Provider) mainActivitySubcomponentBuilderProvider,
            Main2Activity.class,
            (Provider) main2ActivitySubcomponentBuilderProvider,
            LoginActivity.class,
            (Provider) loginActivitySubcomponentBuilderProvider,
            PopUpFullImage.class,
            (Provider) popUpFullImageSubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends BroadcastReceiver>,
                Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
                of());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
                of());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>of());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends ContentProvider>,
                Provider<AndroidInjector.Factory<? extends ContentProvider>>>
                of());
  }

  private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
      getDispatchingAndroidInjectorOfFragment2() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        ImmutableMap
            .<Class<? extends androidx.fragment.app.Fragment>,
                Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
                of());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.authActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Builder
              get() {
            return new AuthActivitySubcomponentBuilder();
          }
        };
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder
              get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.main2ActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent.Builder
              get() {
            return new Main2ActivitySubcomponentBuilder();
          }
        };
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder
              get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.popUpFullImageSubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent.Builder
              get() {
            return new PopUpFullImageSubcomponentBuilder();
          }
        };
    this.someThingProvider =
        DoubleCheck.provider(AppModule_SomeThingFactory.create(builder.appModule));
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideAppDrawableProvider =
        DoubleCheck.provider(
            AppModule_ProvideAppDrawableFactory.create(builder.appModule, applicationProvider));
    this.provideRequestOptionProvider =
        DoubleCheck.provider(AppModule_ProvideRequestOptionFactory.create(builder.appModule));
    this.provideGlideInstanseProvider =
        DoubleCheck.provider(
            AppModule_ProvideGlideInstanseFactory.create(
                builder.appModule, applicationProvider, provideRequestOptionProvider));
    this.provideRetrofitInstance$app_debugProvider =
        DoubleCheck.provider(
            AppModule_ProvideRetrofitInstance$app_debugFactory.create(builder.appModule));
    this.sessionManagerProvider = DoubleCheck.provider(SessionManager_Factory.create());
  }

  @Override
  public void inject(BaseApplication arg0) {
    injectBaseApplication(arg0);
  }

  @CanIgnoreReturnValue
  private BaseApplication injectBaseApplication(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    dagger.android.support.DaggerApplication_MembersInjector.injectSupportFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment2());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class AuthActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Builder {
    private AuthModule authModule;

    private AuthActivity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent build() {
      if (authModule == null) {
        this.authModule = new AuthModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(AuthActivity.class.getCanonicalName() + " must be set");
      }
      return new AuthActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(AuthActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class AuthActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent {
    private AuthModule_ProvideAuthApiFactory provideAuthApiProvider;

    private AuthViewModel_Factory authViewModelProvider;

    private AuthActivitySubcomponentImpl(AuthActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          AuthViewModel.class, (Provider) authViewModelProvider);
    }

    private ViewModelProvidersFactory getViewModelProvidersFactory() {
      return new ViewModelProvidersFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AuthActivitySubcomponentBuilder builder) {
      this.provideAuthApiProvider =
          AuthModule_ProvideAuthApiFactory.create(
              builder.authModule,
              DaggerAppComponent.this.provideRetrofitInstance$app_debugProvider);
      this.authViewModelProvider =
          AuthViewModel_Factory.create(
              provideAuthApiProvider, DaggerAppComponent.this.sessionManagerProvider);
    }

    @Override
    public void inject(AuthActivity arg0) {
      injectAuthActivity(arg0);
    }

    @CanIgnoreReturnValue
    private AuthActivity injectAuthActivity(AuthActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment2());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      AuthActivity_MembersInjector.injectXxvx(
          instance, DaggerAppComponent.this.someThingProvider.get());
      AuthActivity_MembersInjector.injectLogo(
          instance, DaggerAppComponent.this.provideAppDrawableProvider.get());
      AuthActivity_MembersInjector.injectRequestManager(
          instance, DaggerAppComponent.this.provideGlideInstanseProvider.get());
      AuthActivity_MembersInjector.injectProviderFactory(instance, getViewModelProvidersFactory());
      return instance;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder {
    private MainModule mainModule;

    private MainActivity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent build() {
      if (mainModule == null) {
        this.mainModule = new MainModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent {
    private MainModule mainModule;

    private Provider<
            MainFragmentBuildersModule_ConstributeProfileFragment.ProfileFragmentSubcomponent
                .Builder>
        profileFragmentSubcomponentBuilderProvider;

    private Provider<
            MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent.Builder>
        postFragmentSubcomponentBuilderProvider;

    private MainModule_ProvideMainApiFactory provideMainApiProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<
            Class<? extends androidx.fragment.app.Fragment>,
            Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return ImmutableMap
          .<Class<? extends androidx.fragment.app.Fragment>,
              Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
              of(
                  ProfileFragment.class,
                  (Provider) profileFragmentSubcomponentBuilderProvider,
                  PostFragment.class,
                  (Provider) postFragmentSubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.profileFragmentSubcomponentBuilderProvider =
          new Provider<
              MainFragmentBuildersModule_ConstributeProfileFragment.ProfileFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainFragmentBuildersModule_ConstributeProfileFragment.ProfileFragmentSubcomponent
                    .Builder
                get() {
              return new ProfileFragmentSubcomponentBuilder();
            }
          };
      this.postFragmentSubcomponentBuilderProvider =
          new Provider<
              MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent
                    .Builder
                get() {
              return new PostFragmentSubcomponentBuilder();
            }
          };
      this.provideMainApiProvider =
          MainModule_ProvideMainApiFactory.create(
              builder.mainModule,
              DaggerAppComponent.this.provideRetrofitInstance$app_debugProvider);
      this.mainModule = builder.mainModule;
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      BaseActivity_MembersInjector.injectSessionManager(
          instance, DaggerAppComponent.this.sessionManagerProvider.get());
      return instance;
    }

    private final class ProfileFragmentSubcomponentBuilder
        extends MainFragmentBuildersModule_ConstributeProfileFragment.ProfileFragmentSubcomponent
            .Builder {
      private ProfileFragment seedInstance;

      @Override
      public MainFragmentBuildersModule_ConstributeProfileFragment.ProfileFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ProfileFragment.class.getCanonicalName() + " must be set");
        }
        return new ProfileFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ProfileFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ProfileFragmentSubcomponentImpl
        implements MainFragmentBuildersModule_ConstributeProfileFragment
            .ProfileFragmentSubcomponent {
      private ProfileViewModel_Factory profileViewModelProvider;

      private PostViewModel_Factory postViewModelProvider;

      private ProfileFragmentSubcomponentImpl(ProfileFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>>
          getMapOfClassOfAndProviderOfViewModel() {
        return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
            ProfileViewModel.class,
            (Provider) profileViewModelProvider,
            PostViewModel.class,
            (Provider) postViewModelProvider);
      }

      private ViewModelProvidersFactory getViewModelProvidersFactory() {
        return new ViewModelProvidersFactory(getMapOfClassOfAndProviderOfViewModel());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ProfileFragmentSubcomponentBuilder builder) {
        this.profileViewModelProvider =
            ProfileViewModel_Factory.create(DaggerAppComponent.this.sessionManagerProvider);
        this.postViewModelProvider =
            PostViewModel_Factory.create(
                MainActivitySubcomponentImpl.this.provideMainApiProvider,
                DaggerAppComponent.this.sessionManagerProvider);
      }

      @Override
      public void inject(ProfileFragment arg0) {
        injectProfileFragment(arg0);
      }

      @CanIgnoreReturnValue
      private ProfileFragment injectProfileFragment(ProfileFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        ProfileFragment_MembersInjector.injectProviderFactory(
            instance, getViewModelProvidersFactory());
        return instance;
      }
    }

    private final class PostFragmentSubcomponentBuilder
        extends MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent
            .Builder {
      private PostFragment seedInstance;

      @Override
      public MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(PostFragment.class.getCanonicalName() + " must be set");
        }
        return new PostFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(PostFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class PostFragmentSubcomponentImpl
        implements MainFragmentBuildersModule_ConstributePostFragment.PostFragmentSubcomponent {
      private ProfileViewModel_Factory profileViewModelProvider;

      private PostViewModel_Factory postViewModelProvider;

      private PostFragmentSubcomponentImpl(PostFragmentSubcomponentBuilder builder) {
        initialize(builder);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>>
          getMapOfClassOfAndProviderOfViewModel() {
        return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
            ProfileViewModel.class,
            (Provider) profileViewModelProvider,
            PostViewModel.class,
            (Provider) postViewModelProvider);
      }

      private ViewModelProvidersFactory getViewModelProvidersFactory() {
        return new ViewModelProvidersFactory(getMapOfClassOfAndProviderOfViewModel());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final PostFragmentSubcomponentBuilder builder) {
        this.profileViewModelProvider =
            ProfileViewModel_Factory.create(DaggerAppComponent.this.sessionManagerProvider);
        this.postViewModelProvider =
            PostViewModel_Factory.create(
                MainActivitySubcomponentImpl.this.provideMainApiProvider,
                DaggerAppComponent.this.sessionManagerProvider);
      }

      @Override
      public void inject(PostFragment arg0) {
        injectPostFragment(arg0);
      }

      @CanIgnoreReturnValue
      private PostFragment injectPostFragment(PostFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        PostFragment_MembersInjector.injectProviderFactory(
            instance, getViewModelProvidersFactory());
        PostFragment_MembersInjector.injectAdapter(
            instance,
            MainModule_ProvideAdapter$app_debugFactory.proxyProvideAdapter$app_debug(
                MainActivitySubcomponentImpl.this.mainModule));
        return instance;
      }
    }
  }

  private final class Main2ActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent.Builder {
    private Main2Module main2Module;

    private Main2Activity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent build() {
      if (main2Module == null) {
        this.main2Module = new Main2Module();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(Main2Activity.class.getCanonicalName() + " must be set");
      }
      return new Main2ActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(Main2Activity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class Main2ActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeMain2Activity.Main2ActivitySubcomponent {
    private Provider<
            Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent.Builder>
        dogFragmentSubcomponentBuilderProvider;

    private Main2Module_ProvideMain2ApiFactory provideMain2ApiProvider;

    private Main2ViewModel_Factory main2ViewModelProvider;

    private Main2ActivitySubcomponentImpl(Main2ActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<
            Class<? extends androidx.fragment.app.Fragment>,
            Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return ImmutableMap
          .<Class<? extends androidx.fragment.app.Fragment>,
              Provider<AndroidInjector.Factory<? extends androidx.fragment.app.Fragment>>>
              of(DogFragment.class, (Provider) dogFragmentSubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          Main2ViewModel.class,
          (Provider) main2ViewModelProvider,
          DogViewModel.class,
          (Provider) DogViewModel_Factory.create());
    }

    private ViewModelProvidersFactory getViewModelProvidersFactory() {
      return new ViewModelProvidersFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Main2ActivitySubcomponentBuilder builder) {
      this.dogFragmentSubcomponentBuilderProvider =
          new Provider<
              Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent
                  .Builder>() {
            @Override
            public Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent
                    .Builder
                get() {
              return new DogFragmentSubcomponentBuilder();
            }
          };
      this.provideMain2ApiProvider =
          Main2Module_ProvideMain2ApiFactory.create(
              builder.main2Module,
              DaggerAppComponent.this.provideRetrofitInstance$app_debugProvider);
      this.main2ViewModelProvider = Main2ViewModel_Factory.create(provideMain2ApiProvider);
    }

    @Override
    public void inject(Main2Activity arg0) {
      injectMain2Activity(arg0);
    }

    @CanIgnoreReturnValue
    private Main2Activity injectMain2Activity(Main2Activity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      BaseActivity_MembersInjector.injectSessionManager(
          instance, DaggerAppComponent.this.sessionManagerProvider.get());
      Main2Activity_MembersInjector.injectProviderFactory(instance, getViewModelProvidersFactory());
      return instance;
    }

    private final class DogFragmentSubcomponentBuilder
        extends Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent.Builder {
      private DogFragment seedInstance;

      @Override
      public Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(DogFragment.class.getCanonicalName() + " must be set");
        }
        return new DogFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(DogFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class DogFragmentSubcomponentImpl
        implements Main2FragmentBuildersModule_ConstributeCatFragment.DogFragmentSubcomponent {
      private DogFragmentSubcomponentImpl(DogFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(DogFragment arg0) {
        injectDogFragment(arg0);
      }

      @CanIgnoreReturnValue
      private DogFragment injectDogFragment(DogFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, Main2ActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        DogFragment_MembersInjector.injectProviderFactory(
            instance, Main2ActivitySubcomponentImpl.this.getViewModelProvidersFactory());
        return instance;
      }
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(LoginActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent {
    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {}

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return ImmutableMap.<Class<? extends ViewModel>, Provider<ViewModel>>of(
          LoginViewModel.class, (Provider) LoginViewModel_Factory.create());
    }

    private ViewModelProvidersFactory getViewModelProvidersFactory() {
      return new ViewModelProvidersFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity(LoginActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment2());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      LoginActivity_MembersInjector.injectProviderFactory(instance, getViewModelProvidersFactory());
      return instance;
    }
  }

  private final class PopUpFullImageSubcomponentBuilder
      extends ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent.Builder {
    private PopUpFullImage seedInstance;

    @Override
    public ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(PopUpFullImage.class.getCanonicalName() + " must be set");
      }
      return new PopUpFullImageSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(PopUpFullImage arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class PopUpFullImageSubcomponentImpl
      implements ActivityBuildersModule_ContributePopUpFullImage.PopUpFullImageSubcomponent {
    private PopUpFullImageSubcomponentImpl(PopUpFullImageSubcomponentBuilder builder) {}

    @Override
    public void inject(PopUpFullImage arg0) {
      injectPopUpFullImage(arg0);
    }

    @CanIgnoreReturnValue
    private PopUpFullImage injectPopUpFullImage(PopUpFullImage instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment2());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      BaseActivity_MembersInjector.injectSessionManager(
          instance, DaggerAppComponent.this.sessionManagerProvider.get());
      return instance;
    }
  }
}