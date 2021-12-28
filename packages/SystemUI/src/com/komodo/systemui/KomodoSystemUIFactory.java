package com.komodo.systemui;

import android.content.Context;

import com.komodo.systemui.dagger.KomodoGlobalRootComponent;
import com.komodo.systemui.dagger.DaggerKomodoGlobalRootComponent;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class KomodoSystemUIFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerKomodoGlobalRootComponent.builder()
                .context(context)
                .build();
    }
}
