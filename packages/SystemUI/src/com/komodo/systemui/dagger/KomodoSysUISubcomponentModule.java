package com.komodo.systemui.dagger;

import dagger.Module;

/**
 * Dagger module for including the WMComponent.
 */
@Module(subcomponents = {KomodoSysUIComponent.class})
public abstract class KomodoSysUISubcomponentModule {
}
