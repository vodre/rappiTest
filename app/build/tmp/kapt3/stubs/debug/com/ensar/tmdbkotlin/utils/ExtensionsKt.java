package com.ensar.tmdbkotlin.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"isNetworkAvailable", "", "Landroid/app/Activity;", "setImageUrl", "", "Landroid/widget/ImageView;", "url", "", "app_debug"})
public final class ExtensionsKt {
    
    @androidx.databinding.BindingAdapter(value = {"android:imageUrl"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver) {
        return false;
    }
}