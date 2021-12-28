package com.komodo.android.systemui;

import android.content.Context;

import com.komodo.android.systemui.dagger.DaggerGlobalRootComponentKomodo;
import com.komodo.android.systemui.dagger.GlobalRootComponentKomodo;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUIKomodoFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentKomodo.builder()
                .context(context)
                .build();
    }
}
