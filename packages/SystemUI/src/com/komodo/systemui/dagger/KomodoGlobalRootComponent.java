package com.komodo.systemui.dagger;

import android.content.Context;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.dagger.WMModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        GlobalModule.class,
        KomodoSysUISubcomponentModule.class,
        WMModule.class})
public interface KomodoGlobalRootComponent extends GlobalRootComponent {

    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        KomodoGlobalRootComponent build();
    }

    @Override
    KomodoSysUIComponent.Builder getSysUIComponent();
}
