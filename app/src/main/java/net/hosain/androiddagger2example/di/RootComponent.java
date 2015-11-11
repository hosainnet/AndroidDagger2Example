package net.hosain.androiddagger2example.di;

import net.hosain.androiddagger2example.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ServiceModule.class
})
public interface RootComponent {
    void inject(MainActivity mainActivity);
}
