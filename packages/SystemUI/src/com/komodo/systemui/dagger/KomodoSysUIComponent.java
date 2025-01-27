package com.komodo.systemui.dagger;

import com.android.systemui.dagger.DefaultComponentBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIBinder;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SystemUIModule;

import com.komodo.systemui.keyguard.KomodoKeyguardSliceProvider;
import com.komodo.systemui.smartspace.KeyguardSmartspaceController;

import dagger.Subcomponent;

@SysUISingleton
@Subcomponent(modules = {
        DefaultComponentBinder.class,
        DependencyProvider.class,
        SystemUIBinder.class,
        SystemUIModule.class,
        KomodoSystemUIModule.class})
public interface KomodoSysUIComponent extends SysUIComponent {
    @SysUISingleton
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder {
        KomodoSysUIComponent build();
    }

    /**
     * Member injection into the supplied argument.
     */
    void inject(KomodoKeyguardSliceProvider keyguardSliceProvider);

    @SysUISingleton
    KeyguardSmartspaceController createKeyguardSmartspaceController();
}
