package com.example.testrxandretro.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.testrxandretro.BaseApplication
import com.example.testrxandretro.R
import com.example.testrxandretro.data.sources.local.BreedDao
import com.example.testrxandretro.data.sources.local.BreedsDao
import com.example.testrxandretro.data.sources.local.Database
import com.example.testrxandretro.util.Constants
import com.example.testrxandretro.util.Utils
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun someThing():String{
        return "this is a test"
    }

    @Singleton
    @Provides
    fun provideRequestOption():RequestOptions{
        return RequestOptions
            .placeholderOf(R.drawable.white_background)
            .error(R.drawable.white_background)
    }

    @Singleton
    @Provides
    fun provideGlideInstanse(application: Application,requestOptions: RequestOptions):RequestManager{
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }
    @Singleton
    @Provides
    fun provideAppDrawable(application: Application):Drawable{
        return ContextCompat.getDrawable(application,R.drawable.logo)!!
    }

    @Singleton
    @Provides
    internal fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun provideUtils(application: Application): Utils = Utils(application)

    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): Database {
        return Room.databaseBuilder(
            application,
            Database::class.java,
            "DatabaseBreed.db"

        )
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .addMigrations(MIGRATION_1_2)
            .build()
    }

    @Provides
    @Singleton
    fun provideBreedDao(database: Database): BreedDao {
        return database.breedDao()
    }
    @Provides
    @Singleton
    fun provideBreedsDao(database: Database): BreedsDao {
        return database.breedsDao()
    }
    val MIGRATION_1_2: Migration = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("CREATE TABLE IF NOT EXISTS `answer` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `question_id` INTEGER NOT NULL, FOREIGN KEY(`question_id`) REFERENCES `question`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )")
        }
    }

    val MIGRATION_2_3: Migration = object : Migration(2, 3) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE `answer` ADD COLUMN `answer` TEXT NOT NULL DEFAULT ''")
        }
    }
}