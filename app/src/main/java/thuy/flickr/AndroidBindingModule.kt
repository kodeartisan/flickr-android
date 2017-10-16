package thuy.flickr

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AndroidBindingModule {
  @ContributesAndroidInjector()
  abstract fun mainActivity(): RecentActivity

  @ContributesAndroidInjector()
  abstract fun recentFragment(): RecentFragment
}
